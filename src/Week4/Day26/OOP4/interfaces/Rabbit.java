package Week4.Day26.OOP4.interfaces;

public class Rabbit extends Mammal implements Prey {

    @Override
    public void runAndHide() {
        System.out.println("Ran and hid");
    }
}
