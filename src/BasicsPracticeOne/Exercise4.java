package BasicsPracticeOne;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        /*

        Write a Java program that takes two numbers as input and displays the product of two numbers.
        Test Data:
        Input first number: 25
        Input second number: 5
        Expected Output :
        25 x 5 = 125

         */

        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Input first number: ");
        int secondNumber = input.nextInt();

        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));

    }
}
