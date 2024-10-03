package Day18;


public class Main {
    public static void main(String[] args) {
        Class mathClass = new Math();
        Class italianClass = new Italian();

        // Create Teacher and Student objects
        Person teacherMath = new Teacher("Mr. Johnson", "Math");
        Person student1Math = new Student("Alice", 101);
        Person student2Math = new Student("Bob", 102);

        Person teacherItalian = new Teacher("Mrs. Rossi", "Italian");
        Person student1Italian = new Student("Clara", 201);
        Person student2Italian = new Student("Diego", 202);

        // Take attendance for Math class
        mathClass.takeAttendance(teacherMath);
        mathClass.takeAttendance(student1Math);
        mathClass.takeAttendance(student2Math);

        // Take attendance for Italian class
        italianClass.takeAttendance(teacherItalian);
        italianClass.takeAttendance(student1Italian);
        italianClass.takeAttendance(student2Italian);

        // Print attendance lists
        System.out.println("Math Class Attendance: " + mathClass.getAttendanceList());
        System.out.println("Italian Class Attendance: " + italianClass.getAttendanceList());
    }
}

