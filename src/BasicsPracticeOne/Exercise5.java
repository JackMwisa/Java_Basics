package BasicsPracticeOne;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        /*

     Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5

         */

        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = in.nextInt();
        System.out.print("Input second number: ");
        int secondNumber = in.nextInt();


        int add = firstNumber + secondNumber;
        int subs = firstNumber - secondNumber;
        int mult = firstNumber * secondNumber;
        double div = (double)firstNumber / (double)secondNumber;
        int mod = firstNumber % secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + add );
        System.out.println(firstNumber + " - " + secondNumber + " = " + subs );
        System.out.println(firstNumber + " x " + secondNumber + " = " + mult );
        System.out.println(firstNumber + " / " + secondNumber + " = " + div );
        System.out.println(firstNumber + " % " + secondNumber + " = " + mod );

    }
}
