package Week2.Day15;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " says: Meow");
    }
}
