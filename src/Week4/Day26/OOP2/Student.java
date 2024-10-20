package Week4.Day26.OOP2;

public class Student extends Person{

    private int age;
    private int studentNbr;

    public Student(String name, int age) {
//        super(name);
//        this.age = age;

        this(name, age, 0);
    }

    public Student(String name, int age, int studentNbr) {
        super(name);
        this.age = age;
        this.studentNbr = studentNbr;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentNbr() {
        return studentNbr;
    }

    public void setStudentNbr(int studentNbr) {
        this.studentNbr = studentNbr;
    }


}
