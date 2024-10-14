package Week3.Day20;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        // creating an Array
        int[] age = new int[5];

        age[0] = 23;
        age[1] = 74;
        age[2] = 64;
        age[3] = 54;
        age[4] = 44;

        System.out.println(age[0]);

        // second way of creating an Array
        int[] numbers = {1,2,3,4,5,5};

        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[3]);

        // loop to iterate through array
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }


        //multidimensional arrays

        double[][] matrix = {
                {1.2, 1.4, 4.0},
                {2.3, 5.6, -1.1}
        };

        System.out.println(matrix[0][0]);
        System.out.println(matrix[1][1]);

        System.out.println(Arrays.deepToString(matrix));


        // Maps

        //  HashMaps


    }
}
