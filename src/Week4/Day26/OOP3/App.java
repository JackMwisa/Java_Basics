package Week4.Day26.OOP3;

public class App {
    public static void main(String[] args) {

        Car myCar = new Car();


    DaysOfWeek today = DaysOfWeek.SUNDAY;

        System.out.println(today);


        if (today == DaysOfWeek.SUNDAY){
            System.out.println("Today is Sunday!!!");
        }else {
            System.out.println("Today is not Sunday!!!");
        }

    }
}
