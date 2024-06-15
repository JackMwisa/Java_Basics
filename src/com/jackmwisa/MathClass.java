package com.jackmwisa;

public class MathClass {
    public static void main(String[] args) {
        int result = Math.round(1.2F);
        System.out.println(result);

        int result1 = (int)Math.ceil(1.1F);
        System.out.println(result1);


        int result2 = (int)Math.floor(1.6F);
        System.out.println(result2);

        int result3 = Math.max(1, 6);
        System.out.println(result3);

//random

        int results4 = (int)Math.round(Math.random() * 100);
        System.out.println(results4);


        int results5 = (int)(Math.random() * 100);
        System.out.println(results5);

    }
}
