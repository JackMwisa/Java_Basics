package Week4.Day26.TRY;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExampleMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> ourMealsPrices = new HashMap<>();

        ourMealsPrices.put("Pizza", 57);
        ourMealsPrices.put("Fruits", 90);
        ourMealsPrices.put("Cakes", 76);

        System.out.println(ourMealsPrices);

        System.out.println(ourMealsPrices.keySet());
        System.out.println(ourMealsPrices.values());

        ArrayList<String> ourMealsNames = new ArrayList<>();
        ourMealsNames.add("Pizza");
        ourMealsNames.add("Fruits");
        ourMealsNames.add("Cakes");

        System.out.println(ourMealsNames);


    }

}
