package Week2.Day14;

//2- Create Customer class, it should extend Person  class and it should have extra customerID(auto genarate we will not have it on constructor) and balance.
//
//        Required extra functions: getBalance, setBalance and getCustomerID
//
//        Overide toString again and print extra customerID
//        override equals function and check if username and password matchs or customerID and password match.  IF any of cases are correct we will return true.

import java.util.Objects;


public class Customer extends Person {

    private int customerID;
    private double balance;

    public Customer(String name, int age, String username, String password, double balance) {
        super(name, age, username, password);
        this.customerID = (int) (1000000 * Math.random());
        this.balance = balance;
    }

    // Getter and Setter for balance
    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public int getCustomerID() {

        return customerID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;

        return super.equals(o) ||
                (customerID == customer.customerID && password.equals(customer.password));
    }

    @Override
    public int hashCode() {

        return Objects.hash(username, password, customerID);
    }
}
