package Day12;

public class WorkingWithStrings {
    public static void main(String[] args) {

        var t1 = new Text();
        t1.setDescription("Hello Signore");

        var t2 = t1;

        System.out.println(t1.getDescription() + " " + t2.getDescription());

        t1.setDescription("Ciau, Signora");

        System.out.println(t1.getDescription() + " " + t2.getDescription());


//       comparing strings

        String s1 = "Hi";
        String s2 = new String("Hi");

        System.out.println(s1 == s2); // false

        System.out.println(s1.equals(s2)); // true


        // string builder
        StringBuilder sb = new StringBuilder("Jack");

        sb.append(" Mwisa");

        System.out.println(sb);


    }
}
