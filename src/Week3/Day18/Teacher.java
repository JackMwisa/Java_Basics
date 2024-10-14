package Week3.Day18;

public class Teacher implements Person {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String getAttendanceString() {
        return "Teacher: " + name + " (" + subject + ")";
    }

    @Override
    public void takeAttendance() {

    }
}
