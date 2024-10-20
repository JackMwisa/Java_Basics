package Week4.Day26.OOP4.interfaces;

public class Fox extends Mammal implements Predator, Prey{

    @Override
    public void catchAndEat() {
        System.out.println("The Fox is catching and eating a pray");
    }

    @Override
    public void runAndHide() {
        System.out.println("The Fox is running to hide itself");
    }
}
