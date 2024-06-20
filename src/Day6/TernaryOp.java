package Day6;

public class TernaryOp {
    public static void main(String[] args) {

        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";

        System.out.println(className);

    }
}