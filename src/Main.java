import Food.FoodView;
import Ticket.MovieView;
import util.Utility;

public class Main {
    public static void main(String[] args) {
        System.out.println("##########################");
        System.out.println(" 원하시는 메뉴를 선택해주세요 ");
        System.out.println("1. 영화 예매");
        System.out.println("2. 음식 주문");
        System.out.println("2. 종료");
        System.out.println("##########################");

        String start = Utility.input("메뉴 선택 >>  ");
        if (start.equals("1")) {
            new MovieView();
        } else if (start.equals("2")) {
            FoodView.start();
        } else if (start.equals("3")) {
            System.exit(0);
        } else {
            System.out.println("정확한 메뉴를 선택해주세요");
        }
    }
}
