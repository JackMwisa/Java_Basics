package Day24;

public class Person {

    public String name;
    protected String secret;


    public void sayHi(){
        System.out.println("Hello, I'm " + name);
    }
    
    private void tellSecret() {
        System.out.println("the secret is " + secret);

    }

}
