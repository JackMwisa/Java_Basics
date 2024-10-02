package Day15;

public class Main {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Lion lion1 = new Lion();

        // Animal dog = new Animal();

        // Calling methods on the objects
        dog1.makeSound();
        cat1.makeSound();
        lion1.makeSound();

        // trying a regular function
        dog1.sleep();
        cat1.sleep();
        lion1.sleep();
    }
}
