package Day6;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.printf("Name: ");
//        String name = input.nextLine().trim();
//
//        System.out.println("You are " + name);


        int x = 1;
        double y = 1.0d;

        System.out.println(x == y);


        int temp = 12;
        boolean isWarm = temp > 20 && temp < 20;

        System.out.println(isWarm);


        boolean hasHighIncome = true;
        boolean hasHighscore = true;
        boolean hasCriminalRecords = false;
        boolean isEligible = (hasHighscore || hasHighIncome) && !hasCriminalRecords;

        System.out.println(isEligible);
        

    }
}
