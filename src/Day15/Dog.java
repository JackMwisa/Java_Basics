package Day15;

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(getName() + " says: Woof");
    }

}