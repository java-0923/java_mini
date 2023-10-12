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

    static void genreView(){
        System.out.println(" ************************** ");
        System.out.println("       1. 액션        ");
        System.out.println("       2. 코미디       ");
        System.out.println("       3. 드라마       ");
        System.out.println("       4. 애니메이션     ");
        System.out.println("       5. 공포              ");
        System.out.println("       6. 나가기              ");
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
                genre();
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

    public void genre(){
        genreView();
        String input = input("원하는 장르 선택 >> ");
        switch (input){
            case "1" :
                tr.getGenreMovieList("1");
                break;
            case "2" :
                tr.getGenreMovieList("2");
                break;
            case "3" :
                tr.getGenreMovieList("3");
                break ;
            case "4" :
                tr.getGenreMovieList("4");
                break;
            case "5" :
                tr.getGenreMovieList("5");
                break;
            case "6":
                break;
        }
    }


    /**
     * 예매하기, 돌아가기
     */
    private void reservation(){
        System.out.println("====================");
        System.out.println("  🎟️예매하기 (1️⃣)");
        System.out.println("  ⬅️돌아가기 (2️⃣)");
        System.out.println("====================");

        String input = input("예매 할꺼냐 ? ");

        while (true){
            switch (input){
                case "1" :
                    inputMovieName();
                    break;
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
    void inputMovieName(){
        String input = input("무빙 이름을 입력하세요 😘");
        boolean f = tr.movieTitle(input);
        if (f){
            click();
        }else {
            System.out.println("예매 실페");
        }
    }

    private void click(){
        int[] arr = new int[]{10,20,30};

        for (int i : arr) {
            System.out.printf("%d:00 \n",i);
        }
        input("시간을 정하세요!!");
    }
}
