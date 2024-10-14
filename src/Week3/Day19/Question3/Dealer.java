package Week3.Day19.Question3;

import java.util.ArrayList;
import java.util.Scanner;

class Dealer {
    private String dealerName;
    private double money;
    private ArrayList<Car> carInventory;


    public Dealer(String dealerName, double money) {
        this.dealerName = dealerName;
        this.money = money;
        this.carInventory = new ArrayList<>();
    }


    public String getDealerName() {
        return dealerName;
    }


    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    public ArrayList<Car> getCarInventory() {
        return carInventory;
    }

    // Function to show all cars in the inventory
    public void showAllCars() {
        if (carInventory.isEmpty()) {
            System.out.println("No cars in the inventory.");
            return;
        }
        System.out.println("Cars in inventory:");
        for (int i = 0; i < carInventory.size(); i++) {
            Car car = carInventory.get(i);
            System.out.println((i + 1) + ". " + car.toString());
        }
    }

    // Function to sell a car
    public void sellCar() {
        showAllCars();
        System.out.print("Enter the number of the car to sell: ");
        Scanner scanner = new Scanner(System.in);
        int carIndex = scanner.nextInt() - 1;
        if (carIndex < 0 || carIndex >= carInventory.size()) {
            System.out.println("Invalid car number.");
            return;
        }
        Car car = carInventory.get(carIndex);
        double sellingPrice = car.sell();
        carInventory.remove(carIndex);
        money += sellingPrice;
        System.out.println("Car sold for $" + String.format("%.3f", sellingPrice) + ". Current balance: $" + String.format("%.2f", money));
    }

    // Function to add a car to the inventory
    public void addCar(Car car) {
        carInventory.add(car);
        System.out.println(car.toString() + " has been added to the inventory.");
    }

    // Menu function to control the dealer's operations
    public void dealerMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== Dealer Menu =====");
            System.out.println("1. Show all cars");
            System.out.println("2. Sell a car");
            System.out.println("3. Add a car");
            System.out.println("4. Show current balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    showAllCars();
                    break;
                case 2:
                    sellCar(); // Call the updated sellCar method
                    break;
                case 3:
                    // Adding a car using pre-defined models
                    System.out.println("Select car type to add:");
                    System.out.println("1. FourDoorToyota");
                    System.out.println("2. TwoDoorBMW");
                    System.out.print("Choose an option: ");
                    int carType = scanner.nextInt();
                    Car newCar = null;
                    if (carType == 1) {
                        newCar = new FourDoorToyota("Toyota Camry", "Camry", 30000, 240, 50, 2020, 15000, 180);
                    } else if (carType == 2) {
                        newCar = new TwoDoorBMW("BMW M4", "M4", 80000, 280, 60, 2022, 12000, 450);
                    }
                    if (newCar != null) {
                        addCar(newCar);
                    } else {
                        System.out.println("Invalid selection.");
                    }
                    break;
                case 4:
                    System.out.println("Current balance: $" + String.format("%.2f", money));
                    break;
                case 5:
                    System.out.println("Exiting Dealer Menu.");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }
}
