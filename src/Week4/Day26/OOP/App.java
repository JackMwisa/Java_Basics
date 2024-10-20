package Week4.Day26.OOP;

public class App {
    public static void main(String[] args) {

        Animal dog = new Dog("Milou", 10);

        dog.getAge();
        dog.getName();
        dog.eat();

        Animal cat = new Cat("Tom", 8);

        cat.getAge();
        cat.getName();
        cat.eat();
    }
}
