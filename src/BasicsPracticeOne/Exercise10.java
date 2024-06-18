package BasicsPracticeOne;

public class Exercise10 {
    public static void main(String[] args) {



        int m = 9, n = 5;
        System.out.println("Values of number 1: " + m);
        System.out.println("Values of number 2: " + n);
//        version 2

            m = m - n;
            n = m + n;
            m = n - m;

            // Print numbers
        System.out.println("Swapped values of number 1: " + m);
        System.out.println("Swapped values of number 2: " + n);


    }
}
