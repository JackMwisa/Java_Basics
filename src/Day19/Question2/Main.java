package Day19.Question2;

public class Main {
    public static void main(String[] args) {
        var people = new Person[] {
                new Man("John"),
                new WorkerMan("Mike"),
                new Woman("Anna"),
                new WorkerWoman("Sara"),
                new Man("David"),
                new WorkerMan("Tom"),
                new Woman("Eva"),
                new WorkerWoman("Lily")
        };

        for (var person : people) {
            person.work();
        }
    }
}

