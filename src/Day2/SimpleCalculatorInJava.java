package Day2;

import java.util.Scanner;

public class SimpleCalculatorInJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("| Welcome to our calculator |".toUpperCase());
        System.out.println();
        System.out.print("Enter your first number: ");
        int numOne = scanner.nextInt();
        System.out.print("Enter your second number: ");
        int numTwo = scanner.nextInt();


        System.out.println("Addition: " + (numOne + numTwo));
        System.out.println("Substraction: " + (numOne - numTwo));
        System.out.println("Multiplication: " + (numOne * numTwo));
        System.out.println("Division: " + ((float)numOne / (float)numTwo));
        System.out.println("Modulus: " + (numOne % numTwo));
    }
}
