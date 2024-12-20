package Week3.Day19.Question2;

public abstract class Person {

    String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void work();

    abstract void printNameAndType();
}
