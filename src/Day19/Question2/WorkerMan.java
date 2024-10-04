package Day19.Question2;

public class WorkerMan extends Man {

    public WorkerMan(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working as a WorkerMan.");
    }
}

