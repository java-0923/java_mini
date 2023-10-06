package Ticket;

import Ticket.age.Age;
import Ticket.genre.GenreView;

import java.util.Scanner;

public class MovieView {
    Scanner sc;

    public MovieView() {
        this.sc = new Scanner(System.in);
        choice();
    }
    void mainView(){
        System.out.println(" ************************** ");
        System.out.println("       1️⃣영화 모두 보기        ");
        System.out.println("       2️⃣장르별 영화 보기       ");
        System.out.println("       3️⃣연령 제한별 보기       ");
        System.out.println("       4️⃣할인 혜택 확인하기     ");
        System.out.println("       5️⃣나가기              ");
        System.out.println(" ************************** ");
    }

    void choice(){
        mainView();
        String input = input("번호를 선택해라 >> ");
        switch (input){
            case "1" :
                System.out.println("1번은 없다.");
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

     public String input(String message){
        System.out.print(message);
        return sc.nextLine();
    }
}
