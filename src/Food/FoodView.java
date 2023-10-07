package Food;
import java.util.UUID;

import static Food.FoodRepository.*;
import static util.Utility.input;
import static util.Utility.makeLine;

public class FoodView {
    private static FoodRepository ar;

    static  {
        ar = new FoodRepository();
    }

    // 메인 메뉴
    public static void start() {

        // 기능들 테스트 후 살려놓을 코드.
//        ar.loadFile();

        while (true) {
            System.out.println("\n\n****** 음식 주문 프로그램 ******");
            System.out.printf("$ 현재 등록된 주문 $ : %d개\n", ar.count());
            System.out.println("* 1. 팝콘 주문 하기");
            System.out.println("# 2. 음료수 주문 하기");
            System.out.println("% 3. 사이드 메뉴 주문 하기");
            System.out.println("& 4. 결제 하기");
            System.out.println("@ 5. 나가기");

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
//                    sideMenuSelect();
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
    // Popcon 메뉴
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
        int dricount;
        int sidcount;
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
                return;
        }

        // UserMenuList에 주문 추가
        String orderNumber = new Food_pop(popconSelect, price * popcount).getOrderNumber();
        UserMenuList.put(orderNumber, new Food_pop(popconSelect, price));
        Food_pop userOrder = UserMenuList.get(orderNumber);
        userOrder.setPopcount(popcount);
        userOrder.updateTotalPrice();
        System.out.printf("\n# %s %d개가 주문 되었습니다. (주문 번호: %s)\n", popconSelect, popcount, orderNumber);
        System.out.println(UserMenuList);
        ar.autoSave();
    }

    private static void drinkMenuSelect() {
        System.out.println("\n# 메뉴 등록을 시작합니다.");

        // 메뉴 목록 출력
        System.out.println("--------[Menu]--------");
        System.out.println("# 1. 콜라 1000원 #");
        System.out.println("# 2. 사이다 1000원 #");
        System.out.println("# 3. 아이스 아메리카노 1500원 #");
        System.out.println("----------------------");

        // 사용자로부터 입력 받기
        String driname = input("- 상품 번호를 선택하세요: ");
        int dricount;
        try {
            dricount = Integer.parseInt(input("- 개수: "));
        } catch (NumberFormatException e) {
            System.out.println("올바른 숫자를 입력하세요.");
            return;
        }

        String drinkSelect = "";
        int price = 0;  // 가격 변수 추가

        switch (driname) {
            case "1":
                drinkSelect = "콜라";
                price = 1000;
                break;
            case "2":
                drinkSelect = "사이다";
                price = 1000;
                break;
            case "3":
                drinkSelect = "아이스 아메리카노";
                price = 1500;
                break;
            default:
                System.out.println("선택하신 번호는 없는 번호입니다.");
                return;  // 메뉴 선택 오류 시 메서드 종료
        }

        // UserMenuList에 주문 추가
        UserMenuList.put(UUID.randomUUID().toString().substring(0, 5), new Food_pop(drinkSelect, price * dricount));
        System.out.printf("\n# %s %d개가 주문 되었습니다.\n", drinkSelect, dricount);
        System.out.println(UserMenuList);
        ar.autoSave();
    }

//    private static void sideMenuSelect() {
//        System.out.println("\n# 메뉴 등록을 시작합니다.");
//
//        // 메뉴 목록 출력
//        System.out.println("--------[Menu]--------");
//        System.out.println("# 1. 나쵸 1000원 #");
//        System.out.println("# 2. 츄러스 1000원 #");
//        System.out.println("# 3. 핫도그 1500원 #");
//        System.out.println("----------------------");
//
//        // 사용자로부터 입력 받기
//        String sidname = input("- 사이드 메뉴 번호 선택: ");
//        int sidcount;
//        try {
//            sidcount = Integer.parseInt(input("- 개수: "));
//        } catch (NumberFormatException e) {
//            System.out.println("올바른 숫자를 입력하세요.");
//            return;
//        }
//
//        String sideSelect = "";
//        int price = 0;  // 가격 변수 추가
//
//        switch (sidname) {
//            case "1":
//                sideSelect = "나쵸";
//                price = 1000;
//                break;
//            case "2":
//                sideSelect = "츄러스";
//                price = 1000;
//                break;
//            case "3":
//                sideSelect = "핫도그";
//                price = 1500;
//                break;
//            default:
//                System.out.println("선택하신 번호는 없는 번호입니다.");
//                return;  // 메뉴 선택 오류 시 메서드 종료
//        }
//
//        // UserMenuList에 주문 추가
//        UserMenuList.put(sidname, new Food_pop(sideSelect, price * sidcount));
//        System.out.printf("\n# %s %d개가 주문 되었습니다.\n", sideSelect, sidcount);
//        ar.autoSave();
//    }

    private static void payMent(){
        //결제화면
        // 메뉴 목록 출력
        System.out.println("------------------------[결제화면]-------------------------");
        System.out.println("총 결제 금액: " + ar.getTotalOrderPrice()+ "원");
        System.out.println("#1. \uD83D\uDCB3 신용카드( 삼성 / 카카오 페이 ) \uD83D\uDCB3#");
        System.out.println("#2. \uD83D\uDCB2********** 계좌이체 ***********\uD83D\uDCB2#");
        System.out.println("---------------------------------------------------------");

        // 사용자로부터 입력 받기
        String paymentNum = input("- 결제 번호 선택 - : ");
        System.out.printf("\n# 총 %d원 결제 되었습니다.\n", ar.getTotalOrderPrice());

        // 주문 목록 초기화 및 저장
//        ar.getUserMenuList().clear();
//        ar.autoSave();
    }
}
