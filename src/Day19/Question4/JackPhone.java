package Day19.Question4;

import java.util.Scanner;

public class JackPhone extends SimplePhone {

    public JackPhone(String contact, String message) {
        super(contact, message);
    }

    public void makeCall() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter contact to call: ");
        String contact = scanner.nextLine();
        call(contact);

}

        public void sendText() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter contact to text: ");
            String contact = scanner.nextLine();
            System.out.print("Enter your message: ");
            String message = scanner.nextLine();
            text(contact, message);
        }

    @Override
    public void call() {
        return;
    }

    @Override
    public void text() {
    return;
    }
}