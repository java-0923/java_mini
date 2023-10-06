package Ticket;
import java.util.*;
import java.io.Serializable;

public class TicketRepositories implements Serializable {

    private static MovieList[] movieList;

    static {
        movieList = new MovieList[]{
                new MovieList("천박사 퇴마 연구소:설경의 비밀","김성식","액션",12,11500,98,0),
                new MovieList("그란 투리스모","닐 블롬캠프","액션",12,14000,134,0),
                new MovieList("30일","남대중","코미디",12,13000,119,0),
                new MovieList("달짝지근해:7510","이한","코미디",12,13000,118,0),
                new MovieList("거미집","김지운","드라마",15,14000,132,0),
                new MovieList("1947 보스톤","강제규","드라마",12,12000,108,0),
                new MovieList("드림쏭2","마크 밸도","애니메이션",0,11000,90,0),
                new MovieList("더 퍼스트 슬램덩크","이노우에 다케히코","애니메이션",12,13500,125,0),
                new MovieList("괴담만찬","김용균","공포",15,13000,117,0),
                new MovieList("더넌2","공포","마이클 차베즈",15,12000,109,0),
                new MovieList("엑소시스트","공포","데이빗 고든 그린",15,12000,111,0),
        };
    }





}
