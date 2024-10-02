package Day15;

public class Main {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Dog dog1 = new Dog("Milou");
        Cat cat1 = new Cat("Tom");
        Lion lion1 = new Lion("Simba");

        // Animal dog = new Animal();

        // Calling methods on the objects
        dog1.makeSound();
        cat1.makeSound();
        lion1.makeSound();

        // trying a regular function
//        dog1.sleep();
//        cat1.sleep();
//        lion1.sleep();
//
//        System.out.println(dog1);
    }
}
