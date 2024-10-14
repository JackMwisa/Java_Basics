package Week1.Day6;
import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");

        map2.put(2, "Blueberry");
        map2.put(3, "Coconut");
        map2.put(4, "Date");


        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            map1.put(entry.getKey(), entry.getValue());
        }

        // Print the merged map
        System.out.println("Merged Map: " + map1);
    }
}