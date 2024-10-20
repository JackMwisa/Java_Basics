package Week4.Day26.OOP;

public class App {
    public static void main(String[] args) {

        var dog = new Dog("Milou", 10);

        System.out.println(dog.getName());
        dog.getName();
        dog.eat("Meet");

       ((Dog) dog).bark();

        Cat cat = new Cat("Tom", 8);

        cat.getAge();
        cat.getName();
        cat.eat();
        cat.eat("fish");


        System.out.println(Dog.type);
        System.out.println(Cat.type);
        System.out.println(Animal.type);
    }
}
