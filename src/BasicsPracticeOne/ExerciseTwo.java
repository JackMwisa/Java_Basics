package BasicsPracticeOne;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        /*
        2. Write a Java program to print the sum of two numbers.
        Test Data:
        74 + 36
        Expected Output :
        110
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int num1= scanner.nextInt();
        String sign = scanner.next();
        int num2= scanner.nextInt();

        System.out.println(num1 + num2);
    }
}
