package Ticket.genre;

import Ticket.MovieView;

import java.util.Scanner;

public class GenreView {

    Scanner sc;

    public GenreView() {
        this.sc = new Scanner(System.in);
        choice();
    }

    void mainView() {
        System.out.println(" ************************** ");
        System.out.println("       🚟 드라마              ");
        System.out.println("       🔫 액션               ");
        System.out.println("       💕 로맨스              ");
        System.out.println("       🧌 판타지              ");
        System.out.println("       👻 스릴러              ");
        System.out.println("       ⬅️이전 화면            ");
        System.out.println(" ************************** ");
    }
    void choice(){
        mainView();
        String input = input("원하는 장르를 골라 >> ");
        if(input.equals("드라마")){
            System.out.println("드라마 선택 완료");
        }
        else if(input.equals("1")){
        }
        else if(input.equals("2")){
        }
        else if(input.equals("3")){
        }
        else if(input.equals("4")){
        }
        else if(input.equals("5")){

        }else{
            System.out.println(" ⬅️ 이전 화면으로 돌아갑니다  ⬅️  ");
            System.out.println(" ************************** ");
            new MovieView();
        }
    }

    String input(String message){
        System.out.print(message);
        return sc.nextLine();
    }
}