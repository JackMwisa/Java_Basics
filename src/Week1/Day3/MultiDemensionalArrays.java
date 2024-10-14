package Day3;

import java.util.Arrays;

public class MultiDemensionalArrays {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];

        numbers[0][0] = 1;

        System.out.println(Arrays.deepToString(numbers));


        int[][] hours = {{1,2,3},{3,5,7}};
        System.out.println(Arrays.deepToString(hours));



    }
}
