package Day6;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
//        for loops
//        for (int i = 0; i <= 5; i++){
//            System.out.println("Hello World " + i);
//        }

//        while loops

        int i = 1;
        while (i <= 10) {
            System.out.println("Hello World " + i);
            i++;
        }


        String input ="";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.next().toLowerCase();

        }




    }

}
