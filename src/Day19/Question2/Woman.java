package Day19.Question2;

public class Woman extends Person {

    public Woman(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working as a Woman.");
    }

    @Override
    void printNameAndType() {

    }
}


