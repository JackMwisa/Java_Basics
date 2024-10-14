package Week4.Day26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int result = substract(87,89);
        System.out.println("The difference is equal to: " + result);
        sum();

    }


    static int substract(int num1, int num2) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        num1 = in.nextInt();

        System.out.print("Enter number 2: ");
        num2 = in.nextInt();

        int sub = num1 - num2;

        return sub;
    }


    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number 1: ");
        num1 = in.nextInt();

        System.out.print("Enter number 2: ");
        num2 = in.nextInt();

        sum = num1 + num2;
        System.out.println("The sum is equal to: " + sum);


    }

}
