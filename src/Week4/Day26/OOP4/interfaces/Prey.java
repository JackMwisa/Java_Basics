package Week4.Day26.OOP4.interfaces;

public interface Prey {
    void runAndHide();

    default void run(){
        System.out.println("The prey is running");
    }
}
