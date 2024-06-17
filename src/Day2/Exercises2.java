package Day2;

public class Exercises2 {
    public static void main(String[] args) {
        exerciseOne();
        experciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();
    }

    public static void exerciseOne() {
        System.out.println("Exercise One");

        int age = 32;
        age += 1;
        age -= 1;
        System.out.println("My age is " + age);



    }

    public static void experciseTwo(){
        System.out.println("\nExercise Two");


        double number = 4 * 2;
        System.out.println("First number: " + number);

        double numTwo = number / 2;
        System.out.println("Second number: " + numTwo);

    }

    public static void exerciseThree(){
        System.out.println("\nEXERCISE Three");


        double celcius = 32;
        double fahrenheit = (celcius * 1.8) + 32;
        System.out.println("Temperature in celcius: "+ celcius);
        System.out.println("Temperature in fahrenheit: "+ fahrenheit);


    }

    public static void exerciseFour(){
        System.out.println("\nExercise Four");

        int age = 10;
        age++;
        age++;
        age++;
        age++;
        age++;

        System.out.println("The age is: " + age);

    }

    public static void exerciseFive(){
        System.out.println("\nExercise Five");

        int age = 50;
        age -= 50;
        System.out.println(age);

        int secondAge = 50;
        secondAge -=20;
        secondAge -=15;
        secondAge -=15;

        System.out.println(secondAge);


    }
}

