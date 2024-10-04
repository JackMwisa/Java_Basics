package Day19.Question2;

public class Man extends Person{
    public Man(String name){
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working as a Man.");
    }

}
