package Day3;

public class Employee {
    public int baseSalary;
    public int hourlyRate;
    public  int extraHours;


    public int calculateWage() {
        return baseSalary + hourlyRate + extraHours
    }
}
