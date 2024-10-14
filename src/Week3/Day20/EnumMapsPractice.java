package Week3.Day20;
import java.util.EnumMap;

public class EnumMapsPractice {

    enum Size {
        SMALL,
        MEDIUM,
        LARGE,
        EXTRALARGE
    }
    public static void main(String[] args) {

        // CREATING AN EnumMap OF SIZE ENUM

        EnumMap<Size, String> size1 = new EnumMap<>(Size.class);

        size1.put(Size.SMALL, "28");
        size1.put(Size.MEDIUM, "38");
        size1.put(Size.LARGE, "48");
        size1.put(Size.EXTRALARGE, "58");

        System.out.println(size1.keySet());
        System.out.println(size1);
        System.out.println(size1.values());
        System.out.println(size1.entrySet());

    }
}
