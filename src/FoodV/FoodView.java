package FoodV;
import static FoodV.FoodRepository.UserMenuList;
import static util.Utility.input;
import static util.Utility.makeLine;

public class FoodView {
    private static FoodRepository ar;

    static  {
        ar = new FoodRepository();
    }

    // 메인 실행 기능
    public static void start() {

        // 기능들 테스트 후 살려놓을 코드.
        ar.loadFile();

        while (true) {
            System.out.println("\n\n****** 음식 주문 프로그램 ******");
            System.out.printf("$ 현재 등록된 주문 $ : %d개\n", ar.count());
            System.out.println("* \uD83C\uDF7F 1. 팝콘 주문 하기");
            System.out.println("# \uD83E\uDD64 2. 음료수 주문 하기");
            System.out.println("% \uD83C\uDF2E 3. 사이드 메뉴 주문 하기");
            System.out.println("& \uD83D\uDCB3 4. 결제 하기");
            System.out.println("@ \uD83D\uDEAA 5. 나가기");

            makeLine();

            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    popconMenuSelect();
                    break;
                case "2":
                    drinkMenuSelect();
                    break;
                case "3":
                    sideMenuSelect();
                    break;
                case "4" :
                    payMent();
                    break;
                case "5":
                    System.out.println("# 주문 프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("# 주문 메뉴를 잘못 선택했습니다.");
            }
        }
    }
    // 1번 메뉴에 대한 입출력 실행 내용
    private static void popconMenuSelect() {
        System.out.println("\n# 메뉴 등록을 시작합니다.");

        // 메뉴 목록 출력
        System.out.println("--------[Menu]--------");
        System.out.println("# 1. 오리지널 팝콘 2000원 #");
        System.out.println("# 2. 어니언 팝콘 2500원 #");
        System.out.println("# 3. 카라멜 팝콘 3000원 #");
        System.out.println("----------------------");

        String name = input("- 상품 번호를 선택하세요: ");
        int popcount;
        try {
            popcount = Integer.parseInt(input("- 개수: "));
        } catch (NumberFormatException e) {
            System.out.println("올바른 숫자를 입력하세요.");
            return;
        }

        String popconSelect = "";
        int price = 0;  // 가격 변수 추가

        switch (name) {
            case "1":
                popconSelect = "오리지널";
                price = 2000;
                break;
            case "2":
                popconSelect = "어니언";
                price = 2500;
                break;
            case "3":
                popconSelect = "카라멜";
                price = 3000;
                break;
            default:
                System.out.println("선택하신 번호는 없는 번호입니다.");
                return;  // 메뉴 선택 오류 시 메서드 종료
        }



        // UserMenuList에 주문 추가
        UserMenuList.put(name, new Food_pop(popconSelect, popcount));
        System.out.printf("\n# %s %d개가 주문 되었습니다.\n", popconSelect, popcount);
        ar.autoSave();
    }

    private static void drinkMenuSelect() {
        System.out.println("\n# 메뉴 등록을 시작합니다.");

        // 메뉴 목록 출력
        System.out.println("--------[Menu]--------");
        System.out.println("# 1. 콜라 1000원 #");
        System.out.println("# 2. 사이다 1000원 #");
        System.out.println("# 3. 아이스 커피 1500원 #");
        System.out.println("----------------------");

        // 사용자로부터 입력 받기
        String name = input("- 음료수 번호 선택: ");
        String dricount = input("- 개수: ");

    }

    private static void sideMenuSelect() {
        System.out.println("\n# 메뉴 등록을 시작합니다.");

        // 메뉴 목록 출력
        System.out.println("--------[Menu]--------");
        System.out.println("# 1. 나쵸 1000원 #");
        System.out.println("# 2. 츄러스 1000원 #");
        System.out.println("# 3. 핫도그 1500원 #");
        System.out.println("----------------------");

        // 사용자로부터 입력 받기
        String name = input("- 사이드 메뉴 번호 선택: ");
        String sidcount = input("- 개수: ");


    }

  private static void payMent(){
        //결제화면
      // 메뉴 목록 출력
      System.out.println("------------------------[결제화면]-------------------------");
      System.out.println("#1. \uD83D\uDCB3 신용카드( 삼성 / 카카오 페이 ) \uD83D\uDCB3#");
      System.out.println("#2. \uD83D\uDCB2********** 계좌이체 ***********\uD83D\uDCB2#");
      System.out.println("---------------------------------------------------------");

      // 사용자로부터 입력 받기
      String name = input("- 결제 번호 선택 - : ");
      System.out.printf("\n#  결제 되었습니다.\n", name);

  }
}
