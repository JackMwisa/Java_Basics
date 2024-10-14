package Week1.Day1;

public class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Peter";
        System.out.println(firstName + " " + lastName);

        firstName = "John ";
        System.out.println(firstName.concat(lastName));
    }
}
