package Week2.Day8;

public class ForLoopsExample2 {

    public static void main(String[] args) {

        // multiplication table
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }

    }
}
