package Day19.Day21;

import java.util.*;

public class Example {
    public static void main(String[] args) {

        ArrayList<String> listOfFruits = new ArrayList<>();

        listOfFruits.add("Apple");
        listOfFruits.add("Mango");
        listOfFruits.add("Pie");
        listOfFruits.add("Pie");

        System.out.println(listOfFruits);


        for (int i = 0; i < listOfFruits.size(); i++) {
            System.out.println(listOfFruits.get(i));
        }


        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        for (int num : numbers){
            System.out.println(num);
        }
    }

}
