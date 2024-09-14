package Day1;

public class StringMethods {
    public static void main(String[] args){
        String txt = "Cool";
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());

        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate"));
    }
}
