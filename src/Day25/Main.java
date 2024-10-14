package Day25;

public class Main {
    public static void main(String[] args) {

        var dog1 = new Dog();
        var cat1 = new Cat();

        dog1.feed("Meet");
        dog1.play();
        dog1.sleep(2);
        dog1.bark();
        dog1.showInteractionHistory();

        System.out.println();


        cat1.feed("fish");
        cat1.play();
        cat1.meow();
        cat1.sleep(3);
        cat1.showInteractionHistory();



    }
}
