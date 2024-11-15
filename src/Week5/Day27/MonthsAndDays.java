package Week5.Day27;

public class MonthsAndDays {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        // Using a for loop to print month names and days
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i] + " has " + daysInMonths[i] + " days.");
        }
        
    }
}
