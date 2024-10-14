package Week4.Day24.StaticModifier;

public class Main {
    public static void main(String[] args) {

        System.out.println(MathUtils.pi);

        double result = MathUtils.substract(7,90);
        System.out.println(result);


        MathUtils m = new MathUtils();
        System.out.println(m.pi);
        System.out.println(m.substract(7,2));

        MathUtils m1 =  new MathUtils();
        m1.pi = 23;


        System.out.println();
        System.out.println(m.pi + " " + MathUtils.pi + " " + m1.pi);

    }
}
