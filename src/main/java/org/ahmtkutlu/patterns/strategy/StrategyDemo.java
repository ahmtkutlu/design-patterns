package org.ahmtkutlu.patterns.strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(new AdditionOperation());
        System.out.println(calculator.doOperation(12, 6));

        calculator = new Calculator(new SubtractionOperation());
        System.out.println(calculator.doOperation(12, 6));

    }

}