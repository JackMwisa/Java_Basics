package Day19.Question4;

import java.util.ArrayList;
import java.util.List;

abstract class SimplePhone implements Phone {
    String contact;
    String message;
    List<String> callHistory = new ArrayList<>();
    List<String> textHistory = new ArrayList<>();

    public SimplePhone(String contact, String message) {
        this.contact = contact;
        this.message = message;
        this.callHistory = callHistory;
        this.textHistory = textHistory;
    }

    @Override
    public void call(String contact) {
        callHistory.add(contact);
        System.out.println("Calling " + contact + "...");
    }

    @Override
    public void text(String contact, String message) {
        textHistory.add("To: " + contact + " - Message: " + message);
        System.out.println("Texting " + contact + ": " + message);
    }

    @Override
    public void showCallHistory() {
        System.out.println("Call History:");
        for (String call : callHistory) {
            System.out.println(call);
        }
    }

    @Override
    public void showTextHistory() {
        System.out.println("Text History:");
        for (String text : textHistory) {
            System.out.println(text);
        }
    }
}
