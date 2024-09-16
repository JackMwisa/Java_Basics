package Day3;

public class Employee {
    public int baseSalary;
    public int hourlyRate;


    public int calculateWage(int extraHours) {
        return baseSalary + hourlyRate + extraHours;
    }

    public static void main(String[] args) {
        var employee1 = new Employee();

        employee1.baseSalary = 50_000;
        employee1.hourlyRate = 10;
        int wage = employee1.calculateWage(10);

        

    }

}


