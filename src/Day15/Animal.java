package Day15;

abstract class Animal {
    String name;
    public Animal(String name){
        this.name = name;
    }
    // Abstract method (has nothing in its body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}