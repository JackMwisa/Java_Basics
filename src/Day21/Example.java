package Day21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example {
    public static void main(String[] args) {

        ArrayList<String> listOfFruits = new ArrayList<>();

        listOfFruits.add("Apple");
        listOfFruits.add("Mango");
        listOfFruits.add("Pie");
        listOfFruits.add("Pie");

        System.out.println(listOfFruits);



        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
    }

}
