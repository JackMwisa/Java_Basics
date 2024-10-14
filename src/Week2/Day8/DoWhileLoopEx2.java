package Week2.Day8;

import java.util.Scanner;

public class DoWhileLoopEx2 {
    public static void main(String[] args) {

        // do while loops example
        // the user needs to enter a name longer than one 1 character
        Scanner input = new Scanner(System.in);

        String message;

        do {
            System.out.print("Enter your name: ");
            message = input.nextLine();
        } while (message.length() < 2);

    }
}
