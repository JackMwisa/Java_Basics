package Day19.Question3;

import java.util.ArrayList;
import java.util.Scanner;

public class Dealers extends Dealer{


    private ArrayList<Dealers> listOfDealers;


    public Dealers(String dealerName){
        super(dealerName);
        this.listOfDealers = new ArrayList<>();
    }


    public void showAllDealers() {
        if (listOfDealers.isEmpty()) {
            System.out.println("No dealers available.");
            return;
        }
        System.out.println("Existing Dealers:");
        for (int i = 0; i < listOfDealers.size(); i++) {
            System.out.println((i + 1) + ". " + listOfDealers.get(i).getDealerName());
        }
    }


    public void addDealer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dealer name: ");
        String dealerName = scanner.nextLine();
        System.out.print("Enter starting balance: ");
        double money = scanner.nextDouble();

        Dealer newDealer = new Dealer(dealerName);
        listOfDealers.add((Dealers) newDealer);
        System.out.println("Dealer " + dealerName + " has been added.");
    }


    public void accessDealerMenu() {
        if (listOfDealers.isEmpty()) {
            System.out.println("No dealers available to access.");
            return;
        }
        showAllDealers();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select dealer by number: ");
        int dealerIndex = scanner.nextInt() - 1;

        if (dealerIndex >= 0 && dealerIndex < listOfDealers.size()) {
            Dealers selectedDealer = listOfDealers.get(dealerIndex);
            selectedDealer.dealersMenu();
        } else {
            System.out.println("Invalid selection.");
        }
    }

    // Main menu for managing dealers
    public void dealersMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Dealers Menu =====");
            System.out.println("1. Show all dealers");
            System.out.println("2. Add a new dealer");
            System.out.println("3. Access an existing dealer");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    showAllDealers();
                    break;
                case 2:
                    addDealer();
                    break;
                case 3:
                    accessDealerMenu();
                    break;
                case 4:
                    System.out.println("Exiting Dealers Menu.");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }
}
