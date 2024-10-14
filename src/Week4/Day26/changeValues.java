package Week4.Day26;

import java.util.Arrays;

public class changeValues {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        change(arr);

        System.out.println(Arrays.toString(arr));

    }


    static void change(int[] nums) {
        nums[8] = 99;
    }
}
