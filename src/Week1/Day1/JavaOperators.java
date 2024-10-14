package Week1.Day1;

public class JavaOperators {
    public static void main(String[] args){

        int x = 100 + 45;
        ++x;
        int sum1 = x + 234;
        int sum2 = sum1 - 323;
        int sum3 = sum1 % sum2;
        sum3 *= 56;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result




    }

}
