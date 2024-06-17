package Day5;

public class Forloops3 {
    public static void main(String[] args) {
        System.out.println("\nExercise:");

        String[] arr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i].toUpperCase();
            }
        }

        for (String day : arr) {
            System.out.println(day);
        }
    }
}
