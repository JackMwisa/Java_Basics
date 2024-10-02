package Day14;

public class Main {
    public static void main(String[] args) {

        // PERSON OBJ
        Person person1 = new Person("Jack", 24, "JackMwisa", "1234");
        Person person2 = new Person("Sam", 21, "SamNeema", "5678");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println("person1 equals person2: " + person1.equals(person2));

        // CUSTOMER OBJ
        Customer customer1 = new Customer("AliceBahi", 23, "alice23", "2332", 1000.0);
        System.out.println(customer1);

        // manager obj
        Manager manager1 = new Manager("Shallom", 56, "Sally678", "9879");
        Manager manager2 = new Manager("Alex", 40, "Alex456", "0123");
        System.out.println(manager1);
        System.out.println(manager2);



        // Print initial balance // out current balance is 1000
        System.out.println("Initial Balance: " + customer1.getBalance());

        // Manager increases the customer's balance by 100.00
        manager1.increaseMoney(customer1, 100.00);

        System.out.println(customer1.getBalance());

        // Manager decreases the customer's balance by 50.00
        manager1.decreaseMoney(customer1, 50.00);
        System.out.println(customer1.getBalance());

        // Attempting to decrease by an amount larger than the current balance
        manager1.decreaseMoney(customer1, 600.00);  // Should show an error message

    }
}
