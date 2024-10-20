package Week4.Day26.OOP;

public class Dog extends Animal {
    public static String type = "Dog";

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void eat(String food){
        System.out.println("Dog is eating " + food);
    }

    public void bark(){
        System.out.println("Dog is barking");
    }
}
