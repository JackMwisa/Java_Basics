package Day5;

import java.util.Arrays;

public class Arrays1 {

    public static void main(String[] args) {

        String[] carbrands = {"Benz", "Hammer", "Ferrari", "Toyota", "Suzuki"};
        System.out.println("I have " + carbrands.length + " cars");

        System.out.println(carbrands[2]);
        System.out.println(carbrands[carbrands.length - 1]);


        int[] primeNumbers = new int[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        System.out.println(Arrays.toString(primeNumbers));

        System.out.print("Prime numbers: ");

        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
        System.out.println(); // Add newline after loop

        }

    }


