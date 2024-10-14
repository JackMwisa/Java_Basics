package Week4.Day23;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.feed("bone");
        dog.play();
        dog.bark();
        dog.sleep(5);
        dog.showInteractionHistory();

        System.out.println();

        cat.feed("fish");
        cat.play();
        cat.meow();
        cat.sleep(3);
        cat.showInteractionHistory();
    }
}
