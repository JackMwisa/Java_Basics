package Day5;

import java.util.HashMap;

public class PeopleAge {
    public static void main(String[] args) {
        // Create a HashMap where the key is the person's name and the value is their age
        HashMap<String, Integer> peopleAges = new HashMap<>();

        // Add 5 people and their ages to the map
        peopleAges.put("Sam", 15);
        peopleAges.put("Mary", 15);
        peopleAges.put("Joseph", 20);
        peopleAges.put("John", 21);
        peopleAges.put("Paul", 30);


        for (String name : peopleAges.keySet()) {
            System.out.println(name + ": " + peopleAges.get(name) + " years old");
        }
    }
}
