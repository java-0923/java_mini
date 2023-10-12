package Ticket;
import java.util.*;
import java.io.Serializable;

public class TicketRepositories implements Serializable {

    public static MovieList[] movieList;

    static {
        movieList = new MovieList[]{
                new MovieList("천박사 퇴마 연구소:설경의 비밀","김성식","액션",12,11500,98),
                new MovieList("그란 투리스모","닐 블롬캠프","액션",12,14000,134),
                new MovieList("30일","남대중","코미디",12,13000,119),
                new MovieList("달짝지근해:7510","이한","코미디",12,13000,118),
                new MovieList("거미집","김지운","드라마",15,14000,132),
                new MovieList("1947 보스톤","강제규","드라마",12,12000,108),
                new MovieList("드림쏭2","마크 밸도","애니메이션",0,11000,90),
                new MovieList("더 퍼스트 슬램덩크","이노우에 다케히코","애니메이션",12,13500,125),
                new MovieList("괴담만찬","김용균","공포",15,13000,117),
                new MovieList("더넌2","마이클 차베즈","공포",15,12000,109),
                new MovieList("엑소시스트","데이빗 고든 그린","공포",15,12000,111)
        };
    }

    public boolean movieTitle(String input){
        for (MovieList list : movieList) {
            if (input.equals(list.getMovieName())){
                return true;
            }
        }
        return false;
    }

    public String[] getMovieListArr(){
        String[] list = new String[movieList.length];
        for (int i = 0; i < movieList.length; i++) {
            list[i] = String.valueOf(movieList[i]);
        }
        return list;
    }

    public void getMovieList() {
        for (MovieList list : movieList) {
            System.out.println(list.info());
        }
    }


    public void getGenreMovieList(String genre) {
        MovieList MList = new MovieList();
        String keyword = "";
        switch (Integer.parseInt(genre)){
            case 1:
                keyword = "액션";
                break;
            case 2:
                keyword = "코미디";
                break;
            case 3:
                keyword = "드라마";
                break;
            case 4:
                keyword = "애니메이션";
                break;
            case 5:
                keyword = "공포";
                break;
            default:

        }
        for (MovieList movie : movieList) {
            if (movie.getGenre().contains(keyword)) {
                System.out.println(movie.info());
            }
        }
    }





}
