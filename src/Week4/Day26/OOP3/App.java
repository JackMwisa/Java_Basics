package Week4.Day26.OOP3;

public class App {
    public static void main(String[] args) {

        Car myCar = new Car();


        DaysOfWeek today = DaysOfWeek.WEDNESDAY;

        DaysOfWeek day2 = DaysOfWeek.MONDAY;

        System.out.println(today.getFullName() + " is day number " +  today.getNumberOfDay());


        if (day2 == today){
            System.out.println("Today is Sunday!!!");
        }else {
            System.out.println("Today is not Sunday!!!");
        }

    }
}
