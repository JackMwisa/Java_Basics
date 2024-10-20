package Week4.Day26.OOP4.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class WorkingWithQueus {
    public static void main(String[] args) {
        Deque<String> strings = new ArrayDeque<>();

        strings.add("Java");
        strings.add("Ruby");
        strings.add("Python");

        strings.addFirst("C++");


        System.out.println(strings);

        strings.pop();

        System.out.println(strings);

        strings.addFirst("C");

//        System.out.println(strings.reversed());
    }
}
