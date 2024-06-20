package Day6;

import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int number = input.nextInt();

        int remainder = number % 15; // remainder when divided by 15

        switch (remainder) {
            case 0:
                System.out.println("FizzBuzz");
                break;
            case 3:
            case 6:
            case 9:
            case 12:
                System.out.println("Fizz");
                break;
            case 5:
            case 10:
                System.out.println("Buzz");
                break;
            default:
                System.out.println(number);
        }

        input.close(); // Closing the Scanner object
    }
}
