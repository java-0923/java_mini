package Ticket;

public class MovieList {
    private String movieName; // 영화 제목
    private String director;  // 감독
    private String genre; // 장르



    public MovieList(){}

    //생성자
    public MovieList(String movieName, String director, String genre) {
        this.movieName = movieName;
        this.director = director;
        this.genre = genre;
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






}