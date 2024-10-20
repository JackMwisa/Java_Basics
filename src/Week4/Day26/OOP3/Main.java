package Week4.Day26.OOP3;

public class Main {
    public static void main(String[] args) {
        Bag<Chihuahua> chihuahuaBag = new Bag<>();
        Chihuahua chihuahua = new Chihuahua();

        chihuahua.setName("Tom");

        chihuahuaBag.setContent(chihuahua);

        Bag<Laptop> laptopBag = new Bag<>();
        Laptop laptop = new Laptop();
        laptop.setName("Apple");

        laptopBag.setContent(laptop);



    }
}
