package Week4.Day26;

import java.util.Arrays;
import java.util.Scanner;

public class rollNumber {
    public static void main(String[] args) {

//        int a = 19;

        Scanner in = new Scanner(System.in);
        System.out.println("Add to array");


        int[] rnumbers = new int[5];

//        System.out.println(Arrays.toString(rnumbers));

        int[] rnumbers2 = {1,2,3,4,5};

        System.out.println(Arrays.toString(rnumbers2));


        for (int i = 0; i < rnumbers.length; i++) {
            rnumbers[i] = in.nextInt();

        }

        System.out.println(Arrays.toString(rnumbers));
    }
}
