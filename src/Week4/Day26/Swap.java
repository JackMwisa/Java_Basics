package Week4.Day26;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int num1 = in.nextInt();

        System.out.print("Enter number B: ");
        int num2 = in.nextInt();

        Swap(num1,num2);


    }

    static void Swap(int a, int b){

        int c = a;
        a = b;
        b = c;

        System.out.println("A is now : " + a + " " + "B is now : " + b);


    }
}
