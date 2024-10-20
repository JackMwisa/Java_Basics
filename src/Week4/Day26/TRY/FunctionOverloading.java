package Week4.Day26.TRY;

public class FunctionOverloading {
    public static void main(String[] args) {

        fun(45);

        System.out.println();

        fun("Mwisa Kassanova Jean-Jacques");

        System.out.println();

        int sum1 = sum(3,2);
        System.out.println("First sum function " + sum1);

        System.out.println();

        int sum2 = sum(1,4,6);
        System.out.println("Second sum function " + sum2);
    }

    static void fun(int a){
        System.out.println("Frist Function");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second Function");
        System.out.println(name);
    }


    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }

}
