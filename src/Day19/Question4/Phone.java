package Day19.Question4;

public interface Phone {
    void call();
    void text();

    void call(String contact);

    void text(String contact, String message);

    void showCallHistory();
    void showTextHistory();
}
