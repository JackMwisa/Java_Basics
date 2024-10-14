package Week1.Day3;

import java.util.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers));

        // length
        int[] hours = {8, 9, 54, 1,2,4,8,94};
        Arrays.sort(hours);
        System.out.println("The length of my array is " + hours.length);
        System.out.println(Arrays.toString(hours));

    }
}
