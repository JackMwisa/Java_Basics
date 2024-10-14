package Week3.Day19.Question3;

import java.util.ArrayList;
import java.util.Scanner;

public class DealerTwo extends Dealer{

    ArrayList<DealerTwo> listOfDealersTwo;

    public DealerTwo(String dealerName, double money) {
        super(dealerName, money);
    }

    public void addDealer(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the dealer:");
    }

}
