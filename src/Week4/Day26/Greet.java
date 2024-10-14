package Week4.Day26;

import java.util.Scanner;

public class Greet {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("enter your name: ");
        String firstName = in.nextLine();

        String message = greeting(firstName);

        System.out.println(message);

    }


    static String greeting(String name){
        String hi = "Hello " + name;
        return hi;
    }
}
