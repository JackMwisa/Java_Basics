package Day15;

abstract class Animal {
    // Abstract method (has nothing in its body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz...");
    }
}