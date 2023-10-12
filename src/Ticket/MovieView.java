package Ticket;

import com.sun.tools.javac.Main;

import static utilt.Utilty.input;

public class MovieView {
    TicketRepositories tr = new TicketRepositories();
//    Age ag = new Age();

    public MovieView() {
        choice();
    }



    /**
     * 초가 화면
     */
    void mainView(){  // 키오스크 영화 파트 메인 View
        System.out.println(" ************************** ");
        System.out.println("       1️⃣영화 모두 보기        ");
        System.out.println("       2️⃣장르별 영화 보기       ");
        System.out.println("       3️⃣연령 제한별 보기       ");
        System.out.println("       4️⃣나가기     ");
        System.out.println(" ************************** ");
    }

    static void genreView(){  // 장르별 영화 선택 View창
        System.out.println(" ************************** ");
        System.out.println("       1. 액션        ");
        System.out.println("       2. 코미디       ");
        System.out.println("       3. 드라마       ");
        System.out.println("       4. 애니메이션     ");
        System.out.println("       5. 공포              ");
        System.out.println("       6. 나가기              ");
        System.out.println(" ************************** ");
    }

    static void ageMainView() {
        System.out.println(" ************************** ");
        System.out.println("       🍼 0세               ");
        System.out.println("       🍼 12세               ");
        System.out.println("       🍼 15세               ");
        System.out.println("       🔞 19금              ");
        System.out.println("       ⬅️ 종료            ");
        System.out.println(" ************************** ");
    }

    /**
     * 메뉴 선택에 따른 표현
     */
    public void choice(){
        while (true){
        mainView();
        String input = input("번호를 선택해라 >> ");
        switch (input){
            case "1" :
                AllMovieList();
                break;
            case "2" :
                genre();
                break;
            case "3" :
                ageChoice();
                break ;
            case "4" :
                System.exit(0);
                break;
        }
        }

    }

    public void AllMovieList(){
        tr.getMovieList();
        reservation();
    }

    // 장르별 영화 선택하기
    public void genre(){
        genreView();
        String input = input("원하는 장르 선택 >> ");
        switch (input){
            case "1" :
                tr.getGenreMovieList("1");
                reservation();
            case "2" :
                tr.getGenreMovieList("2");
                reservation();
            case "3" :
                tr.getGenreMovieList("3");
                reservation();
            case "4" :
                tr.getGenreMovieList("4");
                reservation();
            case "5" :
                tr.getGenreMovieList("5");
                reservation();
            case "6":
                break;
        }
    }



    public void ageChoice() {
        ageMainView();
        String input = input("원하는 연령을 골라 >> ");
        switch (input) {
            case "1":
                System.out.println("전체이용가 선택");
                tr.getAgeMovieList(0);
                reservation();
                break;
            case "2":
                System.out.println("12세 선택");
                tr.getAgeMovieList(12);
                reservation();
                break;
            case "3":
                System.out.println("15세 선택");
                tr.getAgeMovieList(15);
                reservation();
                break;
            case "4":
                System.out.println("19세 선택");
                System.out.println("현재 상영중인 19세 이용가 영화가 없습니다");
                break;
            case "5":
                new MovieView();
                break;
        }
    }

    /**
     * 예매하기, 돌아가기
     */
    public void reservation(){
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
                    choice();
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
        String[] arr = new String[]{"10","20","30"};
        System.out.println("*** 시간을 정하세요 ***");
        for (String i : arr) {
            System.out.printf("%s:00 \n",i);
        }
        String input = input("시간을 정하세요 : ");
        for (String s : arr) {
            if(input.equals(s)){
                System.out.println("좌석을 선택해라 : ");
                seet();
            }
        }
    }
    private void seet(){
        String[][] set = new String[][]{
                {
                        "A1" , "A2", "A3"
                },
                {
                        "B1" , "B2", "B3"
                },
                {
                        "C1" , "C2", "C3"
                }
        };

        for (String[] strings : set) {
            for (String string : strings) {
                System.out.printf(" [%s] ", string);
            }
            System.out.println();
        }
        String input = input("죄석을 골라 : ");
        for (String[] strings : set) {
            for (String string : strings) {
                if (input.equals(string)){
                    System.out.println("예매가 정상적으로 성공!!!!!!!!!!!!!!!");
                    String endInput = input("종료를 원할 경우 0을 입력 : ");
                    if (Integer.parseInt(endInput) == 0){
                        System.exit(0);
                    }
                    else{
                         choice();
                    }
                }
            }
        }
    }

}