package com.jackmwisa;

public class EscapeSequence {
    public static void main(String[] args) {
        String message = new String("Hello, His name is: \"Jack\"");


        String path = "c:\tWindows\\\n";
        System.out.println(path);

        System.out.println(message);
    }
}
