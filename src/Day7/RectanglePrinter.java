package Day7;

public class RectanglePrinter {
    public static void printRectangle(int a, int b, char c) {
        String row = String.valueOf(c).repeat(b);
        for (int i = 0; i < a; i++) {
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        printRectangle(3, 4, 'f');
    }
}