package Day18;

public class Student implements Person {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getAttendanceString() {
        return "Student: " + name + " (ID: " + id + ")";
    }

    @Override
    public void takeAttendance() {

    }
}