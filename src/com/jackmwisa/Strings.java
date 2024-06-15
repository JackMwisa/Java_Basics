package com.jackmwisa;

public class Strings {
    public static void main(String[] args){
        //String message = new String("Hello my brother");

        String news = "How are you?";
        String message = "Hello Kenny " + news ;


        System.out.println(message);


        message = message.toUpperCase();
        System.out.println(message);

//        message

        System.out.println(message.startsWith("H"));
        System.out.println(message.length());

        System.out.println(message.indexOf("H"));

        System.out.println(message.replace("?", "!!!!"));



    }
}
