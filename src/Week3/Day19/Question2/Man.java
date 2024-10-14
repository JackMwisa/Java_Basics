package Week3.Day19.Question2;

public class Man extends Person {

    Man(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working as a Man.");
    }

    @Override
    void printNameAndType() {
        System.out.println("Name: " + name + ", Type: Man");
    }
}