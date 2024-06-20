package Day6;

import java.util.Scanner;

public class Ifstatements {

    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);
        System.out.println("What's the temperature? ");
        int temp = input.nextInt();

        if (temp > 30){
            System.out.println("It's a hot day \nDrink a lot of water");
        }
        else if (temp > 20) {
            System.out.println("It is a nice day");
        } else {
            System.out.println("It is cold");
        }
    }
}


