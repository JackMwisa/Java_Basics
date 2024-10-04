package Day19;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorClass();

        double num1 = 10;
        double num2 = 5;

        System.out.println("Sum: " + calculator.sum(num1, num2));
        System.out.println("Subtract: " + calculator.subtract(num1, num2));
        System.out.println("Multiply: " + calculator.multiply(num1, num2));
        System.out.println("Divide: " + calculator.divide(num1, num2));
    }
}
