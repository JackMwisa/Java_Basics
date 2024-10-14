package Week1.Day6;

import java.util.HashMap;
import java.util.Map;

public class Exercise {

/*
5- Map a List of People to Their Ages
Write a program that:

-Creates a HashMap where the keys are people's names (Strings) and the values are their ages (Integers).
-Add 5 people and their ages.
-Print out each person and their age using a loop.
-Update one of the student's age
-Print out each person and their age using a loop.
-Remove one student from map
-Print out each person and their age using a loop.

 */

    public static void main(String[] args) {
        Map<String, Integer> namesAges  = new HashMap<>();

        namesAges.put("Hana", 28);
        namesAges.put("Ali", 22);
        namesAges.put("Mundes", 26);
        namesAges.put("Jeremy", 27);
        namesAges.put("Yak", 38);

        System.out.println(namesAges);

        /* Printing using a loop*/

        for (Map.Entry<String, Integer> entries : namesAges.entrySet()){
            System.out.println(entries);
        }

        // updating the age of one student
        String yak = "Yak";
        String Jeremy = "Jeremy";
        System.out.println(yak);

        if (namesAges.containsKey(yak) && namesAges.containsKey(Jeremy)) {
            namesAges.put(yak, 45);
            namesAges.remove(Jeremy);
            System.out.println(namesAges);
        }

    }

}
