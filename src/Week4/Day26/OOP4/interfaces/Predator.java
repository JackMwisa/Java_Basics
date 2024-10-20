package Week4.Day26.OOP4.interfaces;

public interface Predator {
    void catchAndEat();

    default void eat(Prey prey){
        System.out.println("Eating: " + prey.getClass().getName() );
    }
}
