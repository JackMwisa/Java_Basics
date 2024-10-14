package Week4.Day26;

import java.util.Arrays;

public class VarbsArgs {
    public static void main(String[] args) {

        fun(9,8,7,6,5,4,3,2,1);

        fun(1,2,3,4,5,6,7,8,9);

        multiple(3,5, "John", "Paul", "Marrot");
    }

    static void multiple(int a, int b, String ...c){
        System.out.println(a + ", " + b +  ", " + Arrays.toString(c));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
