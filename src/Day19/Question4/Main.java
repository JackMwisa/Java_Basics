package Day19.Question4;

public class Main {
    public static void main(String[] args) {
        JackPhone myPhone = new JackPhone("John", "Hello");

        myPhone.makeCall();

        myPhone.makeCall();

        myPhone.sendText();

        myPhone.showCallHistory();
    }
}