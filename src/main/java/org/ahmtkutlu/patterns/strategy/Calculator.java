package org.ahmtkutlu.patterns.strategy;

public class Calculator {

    private CalculationStrategy strategy;

    public Calculator(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public int  doOperation(int num1, int num2){
        return strategy.calculate(num1, num2);
    }
}
