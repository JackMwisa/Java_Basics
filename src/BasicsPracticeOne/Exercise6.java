package BasicsPracticeOne;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        /*

        7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
            Test Data:
            Input a number: 8
            Expected Output :
            8 x 1 = 8
            8 x 2 = 16
            8 x 3 = 24
            ...
            8 x 10 = 80

         */

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int myNumber = input.nextInt();

        System.out.println( myNumber + " x " + " 1 " + " = " + ( myNumber * 1));
        System.out.println( myNumber + " x " + " 2 " + " = " + ( myNumber * 2));
        System.out.println( myNumber + " x " + " 3 " + " = " + ( myNumber * 3));
        System.out.println( myNumber + " x " + " 4 " + " = " + ( myNumber * 4));
        System.out.println( myNumber + " x " + " 5 " + " = " + ( myNumber * 5));
        System.out.println( myNumber + " x " + " 6 " + " = " + ( myNumber * 6));
        System.out.println( myNumber + " x " + " 7 " + " = " + ( myNumber * 7));
        System.out.println( myNumber + " x " + " 8 " + " = " + ( myNumber * 8));
        System.out.println( myNumber + " x " + " 9 " + " = " + ( myNumber * 9));
        System.out.println( myNumber + " x " + " 10 " + " = " + ( myNumber * 10));


    }
}
