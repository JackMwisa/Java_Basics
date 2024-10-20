package Week4.Day26.OOP2;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student("Jack", 90);
        Student student2 = new Student("Jack", 90, 98);

        student1.getName();
        student1.getAge();



        student2.getAge();
        student2.getName();
        student2.setStudentNbr(456);
    }
}
