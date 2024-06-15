package com.jackmwisa;
import java.util.Arrays;
public class MyArrays {
    public static void main(String[] args) {
        int[] number = {10,5,6,8,9,15,20,3,7};

        System.out.println(number.length);

        Arrays.sort(number);

        System.out.println(Arrays.toString(number));

    }
}
