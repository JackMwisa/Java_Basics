package Day1;

public class JavaTypeCasting {
    public static void main(String[] args) {
        int num = 9;
        System.out.println(num);
        double myDouble = num; // automatic casting
        System.out.println(myDouble);


        double theDouble = 8.983d;
        int myInt = (int) theDouble;
        System.out.println(myInt);

    }
}
