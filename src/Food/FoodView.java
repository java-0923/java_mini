package Food;
import static util.Utility.input;
import static util.Utility.makeLine;

public class FoodView {
    private static FoodRepository ar;

    static  {
        ar = new FoodRepository();
    }

    // 메인 실행 기능
    public static void start() {
        while (true) {
            System.out.println("\n\n****** 음식 주문 프로그램 ******");
            System.out.printf("# 현재 등록된 주문: %d명\n", ar.count());
            System.out.println("* 1. 팝콘 주문 하기");
            System.out.println("# 2. 음료수 주문 하기");
            System.out.println("# 3. 사이드 메뉴 주문 하기");

            makeLine();

            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    insertProcess();
                    break;
                case "2":
                    break;
                case "3":
                    System.out.println("# 주문 프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("# 주문 메뉴를 잘못 선택했습니다.");
            }
        }
    }
    // 1번 메뉴에 대한 입출력 실행 내용
    private static void insertProcess() {
        System.out.println("\n# 메뉴 등록을 시작합니다.");
        String name = input("- 팝콘: ");
        double price = Double.parseDouble(input("- 가격: ")); // 가격 입력 추가

        // 기존에 등록된 주문자 인가?
        if (!ar.isRegistered(name)) { // 등록되지 않은 신규 주문자라면
            ar.addNewMenu(name, price);
            System.out.printf("\n# %s님이 신규 주문 되었습니다.\n", name);
        } else { // 기존 등록된 주문자에 메뉴만 추가
            boolean flag = ar.addNewMenu(name, price);
            if (flag) {
                System.out.printf("\n# %s님의 주문메뉴에 %s개 추가되었습니다.\n", name, name);
            }
        }
        ar.autoSave();
    }
}
