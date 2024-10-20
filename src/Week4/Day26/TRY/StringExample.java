package Week4.Day26.TRY;

public class StringExample {

    public static void main(String[] args) {

        String message = greets("John");
        System.out.println(message);
    }


    static String greets(String name){

        String greeting = "How are you " + name;

        return greeting;
    }
}
