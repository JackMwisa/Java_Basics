package Day6;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        final byte FIZZ = 3;
        final byte BUZZ = 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");

        int number = input.nextInt();

        if ((number % FIZZ == 0) && (number % BUZZ == 0)){
            System.out.println("FizzBuzz");
        }

        else if (number % FIZZ == 0) {
            System.out.println("Fizz");
        }

        else if (number % BUZZ == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }

    }
}
