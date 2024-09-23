package Day7;

public class RectanglePrinter {
    public static void printRectangle(int a, int b, char c) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printRectangle(3, 4, 'f');
    }
}
