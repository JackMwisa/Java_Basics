package Day12;

public class StringsExamples {
    public static void main(String[] args) {
        String str = "Hi, all!!";

        int lenghtStr = str.length();

        System.out.println(lenghtStr);

        System.out.println(str.charAt(2));

        System.out.println(str.indexOf("all"));

        System.out.println(str.substring(2,6));

        System.out.println(str.toUpperCase() + " " + str.toLowerCase());

    }
}
