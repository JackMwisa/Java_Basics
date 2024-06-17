package BasicsPracticeOne;

public class Exercise9 {
    public static void main(String[] args){
       /*
       A program that swaps 2 numbers
        */

        int num1 = 4;
        System.out.println("Values of number 1: " + num1);
        int num2 = 7;
        System.out.println("Values of number 2: " + num2);

        int num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println("Swapped values of number 1: " + num1);
        System.out.println("Swapped values of number 2: " + num2);




    }
}
