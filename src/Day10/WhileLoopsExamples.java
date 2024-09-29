package Day10;

import java.util.Scanner;

public class WhileLoopsExamples {

    public static void main(String[] args) {
        String input = "";

        while(!input.equals("quit")){

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a text: ");
            input = scanner.nextLine().toLowerCase();

        }
    }

}
