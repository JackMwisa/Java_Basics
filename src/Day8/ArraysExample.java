package Day8;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args){
        int[] nrs = {1,2,3,4,5};

        System.out.println(nrs[0]);
        System.out.println(nrs[1]);
        System.out.println(nrs[2]);

        nrs[4] = nrs[4] * 2;

        System.out.println(nrs[4]);

        System.out.println(nrs);

        System.out.println(Arrays.toString(nrs));

        System.out.println(nrs.length);
    }
}
