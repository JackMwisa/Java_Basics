package Day19.Question2;

public class WorkerMan extends Man {
    int workingHours;

    WorkerMan(String name, int workingHours) {
        super(name);
        this.workingHours = workingHours;
    }

    public void work() {
        System.out.println(name + " worked " + workingHours + " hours.");
    }

    @Override
    void printNameAndType() {
        System.out.println("Name: " + name + ", Type: WorkerMan");
    }
}
