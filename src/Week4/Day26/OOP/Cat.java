package Week4.Day26.OOP;

public class Cat extends Animal {
    public static String type = "Cat";

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    public void eat(String food){
        System.out.println("Cat is eating " + food);
    }

}
