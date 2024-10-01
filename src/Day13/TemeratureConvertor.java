package Day13;

import java.util.Scanner;

public class TemeratureConvertor {
    public static void main(String[] args) {
        System.out.print("Enter temp for in Celsuis: ");
        Scanner in = new Scanner(System.in);

        float temp = in.nextFloat();
        float tempInFar = (temp * 9/5) + 32;
        //float tempInKel = temp * 7;

        String farSymbol = "F";
        System.out.println(tempInFar + farSymbol);

    }
}
