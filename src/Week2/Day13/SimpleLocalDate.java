package Day13;

import java.time.LocalDate;

public class SimpleLocalDate {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        LocalDate ld1 = LocalDate.of(2000, 5, 3);
        LocalDate ld2 = LocalDate.parse("2023-01-02");

        System.out.println(ld);
        System.out.println(ld1);
        System.out.println(ld2);


        LocalDate ld3 = ld.plusDays(45);
        System.out.println(ld3);

        System.out.println(ld3.getYear());
    }
}
