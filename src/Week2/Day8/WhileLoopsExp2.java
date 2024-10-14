package Day8;

public class WhileLoopsExp2 {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("Multiplication Table");
        System.out.println("---------------------\n");

        while (i <= 10){

            int num = (int) (Math.pow(i, 2));
            System.out.println(i +" x " + i + " = " + num);
            i++;
        }
    }
}
