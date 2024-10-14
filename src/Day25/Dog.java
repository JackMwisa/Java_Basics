package Day25;

public class Dog extends SimpleAnimal {

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println("The dog is barking!");
        interactionHistory.add("The dog barked");
    }
}

