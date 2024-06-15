package com.jackmwisa;

public class ArithmeticOps {
    public static void main(String[] args) {
        int total = 10 + 3;
        int product = 10 * 3;
        int difference = 10 - 3;
        double quotient = (double)10 / (double)3;

        System.out.println("Total: " + total);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);


        int x = 1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);


        x += 20;
        System.out.println(x);

        y *= 6;
        System.out.println(y);
    }
}
