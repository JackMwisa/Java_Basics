package Day19.Question1;

//1- Create 'Calculator' interface. in this interface there should be 4 functions: Sum, Subtract, Multiply, Divide.
//        implement this interface from 'CalculatorClass' and implement necessary functions.
//
//        All the classes and interface and main function should be in separate files.


public interface Calculator {
    double sum(double num1, double num2);
    double subtract(double num1, double num2);
    double multiply(double num1, double num2);
    double divide(double num1, double num2);
}
