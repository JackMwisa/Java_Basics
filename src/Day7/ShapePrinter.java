package Day7;
public class ShapePrinter {
    public static void printRectangle(int a, int b, char c) {
        String row = String.valueOf(c).repeat(b);
        for (int i = 0; i < a; i++) {
            System.out.println(row);
        }
    }

    public static void printTriangle(int n, char c) {
        for (int i = 1; i <= n; i++) {
            System.out.println(String.valueOf(c).repeat(i));
        }
    }

    public static void main(String[] args) {
        printRectangle(3, 4, 'f');
        System.out.println();
        printTriangle(5, 'f');
    }
}

