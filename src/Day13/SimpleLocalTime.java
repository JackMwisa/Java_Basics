package Day13;

import java.time.LocalTime;

public class SimpleLocalTime {
    public static void main(String[] args) {

        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.of(3,5,6);
        System.out.println(localTime2);

        LocalTime localTime3 = LocalTime.parse("03:23:03");
        System.out.println(localTime3);

        System.out.println(localTime1.getHour());
        System.out.println(localTime1.plusHours(7));
    }

}
