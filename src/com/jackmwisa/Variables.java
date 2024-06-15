package com.jackmwisa;

public class Variables {
    public static void main(String[] args) {

        byte age = 30;
        int temperature = 89;

        System.out.println(age);

        age = 45;
        System.out.println(age);

        int herAge = age;
        System.out.println("Her age is " + herAge);

//        BYTE [128,127]
        byte minByte = -128;
        byte maxByte = 127;


        int viewsCounts = 1_453_234_040; // for in max 2 billion

        long viewsCount2 = 123_453_234_040L;

//        double
        double grade = 34.56;
//        float
        float price = 10.02f;
        System.out.println(price);

//   char

        char letter = 'F';
        System.out.println(letter);


        boolean isMarried = true;

        System.out.println(isMarried);


//        String letter = "H";
//        System.out.println(
//        letter);
    }
}
