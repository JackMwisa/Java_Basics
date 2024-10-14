package Day25;

public class Cat extends SimpleAnimal{
    public Cat() {
        super("Cat");
    }

    public void meow() {
        System.out.println("The cat is meowing!");
        interactionHistory.add("The cat meowed");
    }
}
