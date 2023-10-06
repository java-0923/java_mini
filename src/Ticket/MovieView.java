package Ticket;

import Ticket.age.Age;
import Ticket.genre.GenreView;

import static utilt.Utilty.input;

public class MovieView {
    TicketRepositories tr = new TicketRepositories();

    public MovieView() {

    }

    /**
     * 초가 화면
     */
    void mainView(){
        System.out.println(" ************************** ");
        System.out.println("       1️⃣영화 모두 보기        ");
        System.out.println("       2️⃣장르별 영화 보기       ");
        System.out.println("       3️⃣연령 제한별 보기       ");
        System.out.println("       4️⃣할인 혜택 확인하기     ");
        System.out.println("       5️⃣나가기              ");
        System.out.println(" ************************** ");
    }

    /**
     * 메뉴 선택에 따른 표현
     */
    public void choice(){
        mainView();
        String input = input("번호를 선택해라 >> ");
        switch (input){
            case "1" :
                tr.getMovieList();
                reservation();
                break;
            case "2" :
               new GenreView();
                break;
            case "3" :
                new Age();
                break ;
            case "4" :
                break;
            case "5" :
                System.exit(0);
                break;
        }
    }


    /**
     * 예매하기, 돌아가기
     */
    private void reservation(){
        System.out.println(" 🎟️예매하기 (1️⃣)");
        System.out.println(" ⬅️돌아가기 (2️⃣)");

        String input = input("예매 할꺼냐 ? ");

        while (true){
            switch (input){
                case "1" :

                case "2" :
                    tr.getMovieList();
                    reservation();
                    break;
                default:
                    System.out.println("메뉴 시발 똑바로 정해");
                    reservation();
                    break;
            }
        }
    }

    /**
     * 영화 제목을 입력하면 그 영화
     * 예매를 도와주는 메서드
     */


}
