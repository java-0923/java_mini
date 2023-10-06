package FoodV;
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
            System.out.printf("# 현재 등록된 주문: %d개\n", ar.count());
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
                    insertProcess2();
                    break;
                case "3" :
                    insertProcess3();
                    break;
                case "4":
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
        System.out.println("\n# 메뉴 등록을 시작합니다. #");
        System.out.println("# 1. 오리지널 팝콘 2000원 #");
        System.out.println("# 2. 어니언 팝콘 2500원 #");
        System.out.println("# 3. 카라멜 팝콘 3000원 #");
        String name = input("- 팝콘 번호 선택: ");

        double phoneNumber = Double.parseDouble(input("- 전화번호 - : ")); // 가격 입력 추가


        // 기존에 등록된 주문자 인가?
        if (!ar.isRegistered(name)) { // 등록되지 않은 신규 주문자라면
            ar.addNewMenu(name, phoneNumber);
            System.out.printf("\n# %s 신규 주문 되었습니다.\n", name);
        } else { // 기존 등록된 주문자에 메뉴만 추가
            boolean flag = ar.addNewMenu(name, phoneNumber);
            if (flag) {
                System.out.printf("\n# %s 주문메뉴에 %s개 추가되었습니다.\n", name, name);
            }
        }
        ar.autoSave();

    }

    private static void insertProcess2() {
        System.out.println("\n# 메뉴 등록을 시작합니다. #");
        System.out.println("# 1. 콜라 1000원 #");
        System.out.println("# 2. 사이다 1000원 #");
        System.out.println("# 3. 아이스 커피 1500원 #");
        String name = input("- 음료수 번호 선택: ");

        double phoneNumber = Double.parseDouble(input("- 전화번호 - : ")); // 가격 입력 추가


        // 기존에 등록된 주문자 인가?
        if (!ar.isRegistered(name)) { // 등록되지 않은 신규 주문자라면
            ar.addNewMenu(name, phoneNumber);
            System.out.printf("\n# %s 신규 주문 되었습니다.\n", name);
        } else { // 기존 등록된 주문자에 메뉴만 추가
            boolean flag = ar.addNewMenu(name, phoneNumber);
            if (flag) {
                System.out.printf("\n# %s 주문메뉴에 %s개 추가되었습니다.\n", name, name);
            }
        }
        ar.autoSave();

    }

    private static void insertProcess3() {
        System.out.println("\n# 메뉴 등록을 시작합니다. #");
        System.out.println("# 1. 나쵸 1000원 #");
        System.out.println("# 2. 츄러스 1000원 #");
        System.out.println("# 3. 핫도그 1500원 #");
        String name = input("- 사이드 메뉴 번호 선택: ");

        double phoneNumber = Double.parseDouble(input("- 전화번호 - : ")); // 가격 입력 추가


        // 기존에 등록된 주문자 인가?
        if (!ar.isRegistered(name)) { // 등록되지 않은 신규 주문자라면
            ar.addNewMenu(name, phoneNumber);
            System.out.printf("\n# %s 신규 주문 되었습니다.\n", name);
        } else { // 기존 등록된 주문자에 메뉴만 추가
            boolean flag = ar.addNewMenu(name, phoneNumber);
            if (flag) {
                System.out.printf("\n# %s 주문메뉴에 %s개 추가되었습니다.\n", name, name);
            }
        }
        ar.autoSave();

    }

}
