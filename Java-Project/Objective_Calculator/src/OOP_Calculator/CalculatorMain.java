package OOP_Calculator;

import OOP_Calculator.factory.CalculatorFactory;

public class CalculatorMain {
    public static void main(String[] args) {

        CalculatorFactory calculatorFactory = new CalculatorFactory();
        calculatorFactory.start();
    }
}