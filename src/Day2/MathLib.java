package Day2;

public class MathLib {
    public static void main(String[] args) {

        double lunchPrice = 25;
        System.out.println("Our Lunch price " + lunchPrice);

        double lunchPriceSquareRout = Math.sqrt(lunchPrice);
        System.out.println("Lunch price square root: " + lunchPriceSquareRout);

        System.out.println("\n/////////////////\n");

        double lunchPriceMonday = 17.4;
        double lunchPriceTuesday = 78.5;
        double lunhcpriceDifference = Math.abs(lunchPriceMonday - lunchPriceTuesday);

        System.out.println("The difference between monday and tuesday lunch price is: " + lunhcpriceDifference);

        



    }
}
