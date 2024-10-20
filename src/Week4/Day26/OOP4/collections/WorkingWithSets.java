package Week4.Day26.OOP4.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();


        integerSet.add(7);
        integerSet.add(10);
        integerSet.add(1);
        integerSet.add(5);
        integerSet.add(4);
        integerSet.add(4);
        integerSet.add(1);

        System.out.println(integerSet);

        for (int i : integerSet){
            System.out.println(i);
        }
    }
}
