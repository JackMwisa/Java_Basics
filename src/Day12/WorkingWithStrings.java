package Day12;

public class WorkingWithStrings {
    public static void main(String[] args) {

        var t1 = new Text();
        t1.setDescription("Hello Signore");

        var t2 = t1;

        System.out.println(t1.getDescription() + " " + t2.getDescription());

        t1.setDescription("Ciau, Signora");

        System.out.println(t1.getDescription() + " " + t2.getDescription());

    }
}
