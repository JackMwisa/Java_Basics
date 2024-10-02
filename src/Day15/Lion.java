package Day15;

public class Lion extends Animal{
    public Lion(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " says: Roar");
    }

}
