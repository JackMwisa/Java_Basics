package Week4.Day26.OOP4.collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, Integer> nameAgeMap = new HashMap<>();

        nameAgeMap.put("Jack", 24);
        nameAgeMap.put("Sam", 27);
        nameAgeMap.put("Robert", 56);

        System.out.println(nameAgeMap);
        System.out.println(nameAgeMap.keySet());
        System.out.println(nameAgeMap.values());

        for (int j : nameAgeMap.values()) {
            System.out.println(j);
        }

        for (String s : nameAgeMap.keySet()) {
            System.out.println(s + " is " + nameAgeMap.get(s));
        }


        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet() ){

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}
