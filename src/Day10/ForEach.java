package Day10;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {


        String[] fruits = {"grape","pie","mango","banana"};

        Arrays.toString(fruits);

        for (int i =0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        System.out.println("");

        for (String fruit : fruits)
            System.out.println(fruit);

    }
}
