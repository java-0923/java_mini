package utilt;

import java.util.Scanner;

public class Utilty {

    public static Scanner sc = new Scanner(System.in);

    public static String input(String message){
        System.out.print(message);
        return sc.nextLine();
    }

}
