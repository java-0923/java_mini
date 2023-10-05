package Ticket.age;

import Ticket.MovieView;

import java.util.Scanner;

public class Age {

        Scanner sc;

        public Age() {
            this.sc = new Scanner(System.in);
            choice();
        }

        void mainView() {
            System.out.println(" ************************** ");
            System.out.println("       🔞 19금              ");
            System.out.println("       🍼 애기               ");
            System.out.println("       ⬅️ 돌아가기            ");
            System.out.println(" ************************** ");
        }
        void choice(){
            mainView();
            String input = input("원하는 연령을 골라 >> ");
            if(input.equals("1")){
                System.out.println("19금 선택");
                System.out.println("하악하악하악");
            }
            else if(input.equals("2")){
                System.out.println("아기 선택");
                System.out.println("응애응애응애");
            }
            else if(input.equals("3")){
                new MovieView();
            }
        }

        String input(String message){
            System.out.print(message);
            return sc.nextLine();
        }
    }

