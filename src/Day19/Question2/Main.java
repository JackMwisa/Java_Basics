package Day19.Question2;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[] {
                new Man("Alex"),
                new WorkerMan("Brian"),
                new Woman("Catherine"),
                new WorkerWoman("Diana"),
                new Man("Edward"),
                new WorkerMan("Frank"),
                new Woman("Grace"),
                new WorkerWoman("Hannah")
        };

        for (Person person : people) {
            person.work();
        }
    }
}
