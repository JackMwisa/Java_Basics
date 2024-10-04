package Day19.Question2;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[] {
                new Man("jack"),
                new WorkerMan("Brian", 4),
                new Woman("Catherine"),
                new WorkerWoman("Diana", 3),
                new Man("Edward"),
                new WorkerMan("Frank", 5),
                new Woman("Grace"),
                new WorkerWoman("Hannah", 4)
        };

        for (Person person : people) {
            if (person instanceof WorkerMan) {
                ((WorkerMan) person).work();
            } else if (person instanceof WorkerWoman) {
                ((WorkerWoman) person).work();
            } else {
                person.work();
            }
        }
    }
}