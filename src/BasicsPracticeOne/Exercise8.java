package BasicsPracticeOne;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        /*
        Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 3 numbers: ");
        int numbers1 = input.nextInt();
        int numbers2 = input.nextInt();
        int numbers3 = input.nextInt();

        int average = (numbers1 + numbers2 + numbers3) /3 ;

        System.out.println("The average of your numbers is: " + average);

    }
}
