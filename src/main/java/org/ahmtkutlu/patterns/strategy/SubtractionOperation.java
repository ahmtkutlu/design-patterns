package org.ahmtkutlu.patterns.strategy;

public class SubtractionOperation implements CalculationStrategy{
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}