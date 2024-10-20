package Week4.Day26.OOP3;

public enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String fullName;

    DaysOfWeek(String fullName){
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}


