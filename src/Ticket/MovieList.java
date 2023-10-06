package Ticket;

public class MovieList {
    private String movieName; // 영화 제목
    private String director;  // 감독
    private String genre; // 장르
    private int accessAge; // 연령제한
    private int ticket_price; // 티켓 값
    private int runtime;  // 상영시간 ( 영화의 길이 )
    private int time; // 상영시간 ( 영화 상영 시간 )
    private boolean login;// 로그인 여부 ( 할인 )



    public MovieList(){}

    //생성자

    public MovieList(String movieName, String director, String genre,
                     int accessAge, int ticket_price, int runtime, int time) {
        this.movieName = movieName;
        this.director = director;
        this.genre = genre;
        this.accessAge = accessAge;
        this.ticket_price = ticket_price;
        this.runtime = runtime;
        this.time = time;
    }


    //getter & setter영역


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    public int getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(int ticket_price) {
        this.ticket_price = ticket_price;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String info() {
        return String.format("%s   %s   %s   %d   %d   %d",this.movieName,this.director,this.genre,this.accessAge,this.runtime,this.ticket_price);
    }

}