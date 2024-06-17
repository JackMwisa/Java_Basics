package com.practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculatorVersionOne {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interst Rate: ");
        float annualInterst = scanner.nextFloat();
        float monthlyInterst = annualInterst / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * ( monthlyInterst * Math.pow(1 + monthlyInterst, numberOfPayments)) / (Math.pow(1 + monthlyInterst, numberOfPayments) - 1);

        String mortageformatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortage: " + mortageformatted);
    }
}
