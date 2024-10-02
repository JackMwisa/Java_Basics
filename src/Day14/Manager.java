package Day14;

import java.util.Objects;


public class Manager extends Person {

    int managerID;
    int actionNumber;

    public Manager(String name, int age, String username, String password) {
        super(name, age, username, password);
        this.managerID = (int) (1000000 * Math.random());
        this.actionNumber = 0;
    }

    public int getManagerID() {
        return managerID;
    }

    public int getActionNumber() {
        return actionNumber;
    }

    public void setActionNumber(int actionNumber) {
        this.actionNumber = actionNumber;
    }

//    public int increaseMoney(Customer customer, int amount ){
//
//    }


    // updating the balance function
    public void updateMoney(Customer customer, double changeAmount) {
        double previousBalance = customer.getBalance();
        double newBalance = previousBalance + changeAmount;
        customer.setBalance(newBalance);
        System.out.println("Customer " + customer.getName() + "'s new balance: " + customer.getBalance());
    }


    // increase money
    public void increaseMoney(Customer customer, double amount) {
        if (amount > 0) {
            updateMoney(customer, amount);
        } else {
            System.out.println("Amount to increase must be positive.");
        }
    }


    // decrease money
    public void decreaseMoney(Customer customer, double amount) {
        if (amount > 0 && customer.getBalance() >= amount) {
            updateMoney(customer, -amount);
        } else {
            System.out.println("Amount to decrease must be positive and less than or equal to the current balance.");
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", ManagerID: " + managerID + ", ActionNumber: " + actionNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return super.equals(o) ||
                (managerID == manager.managerID && password.equals(manager.password));

        // (username.equals(manager.username) && password.equals(manager.password))

    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, managerID);
    }
}

