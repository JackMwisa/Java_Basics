package Day15;

public class Main {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        Cow myCow = new Cow();

        // Calling methods on the objects
        myDog.makeSound();
        myDog.sleep();

        myCat.makeSound();
        myCat.sleep();

        myCow.makeSound();
        myCow.sleep();
    }
}
