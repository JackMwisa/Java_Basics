package Week4.Day26.OOP3;

public enum DaysOfWeek {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 4),
    SATURDAY("Saturday", 5),
    SUNDAY("Sunday", 6);

    private final String fullName;
    private final int NumberOfDay;

    DaysOfWeek(String fullName,int numberOfDay){
        this.fullName = fullName;
        this.NumberOfDay = numberOfDay;
    }

    public String getFullName() {
        return fullName;
    }

    public int getNumberOfDay() {
        return NumberOfDay;
    }

    public boolean isWeekend(){
        return this == SATURDAY || this == SUNDAY;
    }
}


