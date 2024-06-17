package com.jackmwisa;

public class Strings2 {
    public static void main(String[] args) {
        String message = new String("Hello");
        System.out.println(message);

        String greeting = "How are you" + "!";
        greeting = greeting.toUpperCase();
        System.out.println(greeting);

        System.out.println(greeting.indexOf("H"));
    }
}
