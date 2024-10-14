package Week3.Day19.Day21;
import java.util.*;

public class SetTest {
    public static void main(String[] args) {

        // Create a HashSet to store the days of the week
        Set<String> daysOfWeek = new HashSet<>();

        // Add the days of the week to the HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");


        // Print the content of the HashSet
        System.out.println("HashSet of days of the week: " + daysOfWeek);

        // Create a LinkedHashSet to preserve insertion order
        Set<String> orderedDays = new LinkedHashSet<>(daysOfWeek);

        // Print the ordered Set
        System.out.println("Ordered Set of days of the week: " + orderedDays);
    }
}
