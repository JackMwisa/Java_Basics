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

        System.out.println("\n/////////////////\n");

        int lunchPriceInEuro = 20;
        int sandwichPrice = 3;
        int remainingMoneyAfterBuyingAsManySandwichesAsPossible = lunchPriceInEuro % sandwichPrice;

        int totalSandwiches = lunchPriceInEuro / sandwichPrice;

        System.out.println("Our total lunch price is " + lunchPrice + ", after buying as many many Sandwiches as possible we have: " + remainingMoneyAfterBuyingAsManySandwichesAsPossible +
                " euros  left." + " We bought " + totalSandwiches + " sandwiches");


        System.out.println("\n/////////////////\n");

        int priceOne = 45;
        int priceTwo = 56;
        int maxPrice = Math.max(priceOne, priceTwo);
        int lowPrice = Math.min(priceOne, priceTwo);

        System.out.println("The higher lunch price is: " + maxPrice);
        System.out.println("The lower lunch price is: " + lowPrice);



    }
}
