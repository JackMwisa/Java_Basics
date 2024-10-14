package Week1.Day3;

public class TextBox {
    public String text = "";

//    Methods
    public void setText(String myText){
        this.text = myText;
    }

    public void clear() {
        this.text = "";
    }


    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Box one");
        System.out.println(textBox1.text);

        var textBox2 = new TextBox();
        textBox2.setText("Box Two");
        System.out.println(textBox2.text);

    }
}


