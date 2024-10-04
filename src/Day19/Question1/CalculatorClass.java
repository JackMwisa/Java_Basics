package Day19.Question1;

import Day19.Question1.Calculator;

public class CalculatorClass implements Calculator {

    @Override
    public double sum(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        return num1 / num2;
    }


}

