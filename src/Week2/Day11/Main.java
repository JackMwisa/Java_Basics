package Week2.Day11;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        var texBox1 = new TexBox();
        texBox1.setText("Hello");
        System.out.println(texBox1.text.toLowerCase(Locale.ROOT));

    }
}
