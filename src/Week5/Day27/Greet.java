package Week5.Day27;


public class Greet{

    // fields  - properties  of the class

    public String name;
    public int age;
    public String message;


    public Greet(int  age, String name) {

        this.age = age;
        this.name = name;
    }



    // attributes - features  of the class


    public void sayHello(){
        System.out.println("Hello");

    }


    public void sayBye(){
        System.out.println("Bye");

    }


    public int howOldAreYou(int age){
        return age;
    }

}



/**
 * 
 * We are creating a greet class
 * it has 3 properties 
 * name
 * age
 * message
 * 3 functions
 * - sayHello
 * -sayBye
 * - how old are u? 
 * 
 */


