package com.jackmwisa;

import java.time.Period;
import java.util.Scanner;

public class ProjectOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterstRate = scanner.nextFloat();

        System.out.print("Period: ");
        byte period = scanner.nextByte();

        double mortgage = principal / (period * annualInterstRate);
        System.out.println("Mortgage: $" + mortgage);


    }
}
