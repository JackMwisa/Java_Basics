package Week3.Day22;

import java.util.Scanner;

class Solution {
    public static int sumOfMultiples(int n) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = input.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){

            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfMultiples(7));
    }

}


