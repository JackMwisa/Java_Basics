package Week4.Day26.OOP;

public class App {
    public static void main(String[] args) {

        Animal dog = new Dog("Milou", 10);

        System.out.println(dog.getName());
        dog.getName();
        dog.eat();

       ((Dog) dog).bark();

        Animal cat = new Cat("Tom", 8);

        cat.getAge();
        cat.getName();
        cat.eat();
    }
}
