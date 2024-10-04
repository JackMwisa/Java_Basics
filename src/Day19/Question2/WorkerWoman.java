package Day19.Question2;

public class WorkerWoman extends Woman {

    public WorkerWoman(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working as a WorkerWoman.");
    }
}
