package Week4.Day26.OOP4.collections;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();

        shoppingList.add("eggs");
        shoppingList.add("pasta");
        shoppingList.add("banana");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(shoppingList);
        System.out.println(numbers);


        System.out.println(shoppingList.get(2));
        shoppingList.remove(2);

        System.out.println(shoppingList);

        boolean containBananas = shoppingList.contains("banana");

        System.out.println(containBananas);


    }
}
