package Week3.Day16;

class Dog implements Animal {

    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void workout() {
        System.out.println(name + " is working out");
    }
}