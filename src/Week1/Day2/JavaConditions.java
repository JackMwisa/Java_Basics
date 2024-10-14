package Week1.Day2;

public class JavaConditions {
    public static void main(String[] args) {

//        Java If ... Else

        byte x = 20;
        byte y = 10;

        if (x > y)
            System.out.println("x is greater than y");
        else
            System.out.println("x is less than y");


        int time = 5;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
// Outputs "Good evening."
    }
}
