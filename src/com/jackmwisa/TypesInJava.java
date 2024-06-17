package com.jackmwisa;

public class TypesInJava {
    public static void main(String[] args) {
        byte age = 45;
        short employees = 10_000; // less than 32k
        int views = 234_345_786;
        long people = 4343445354353453L;

        char gender = 'M';
        System.out.println("You are " + age);
        System.out.println(employees);
        System.out.println(people);
        System.out.println(views);
    }
}
