package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private ICalculator calculator;
    private double savedResult;
    private double lastOperation;
    public CalculatorWithMemoryDecorator(ICalculator currCalculator) {
        this.calculator = currCalculator;
    }
    public ICalculator getCalculator() {
        return this.calculator;
    }

    @Override
    public double Addition(double term1, double term2) {
        this.lastOperation = calculator.Addition(term1, term2);
        return this.lastOperation;
    }

    @Override
    public double Multiplication(double multiplier1, double multiplier2) {
        this.lastOperation = calculator.Multiplication(multiplier1, multiplier2);
        return this.lastOperation;
    }

    @Override
    public double Subtraction(double subtrahend1, double subtrahend2) {
        this.lastOperation = calculator.Subtraction(subtrahend1, subtrahend2);
        return this.lastOperation;
    }

    @Override
    public double Division(double divider1, double divider2) {
        this.lastOperation = calculator.Division(divider1, divider2);
        return this.lastOperation;
    }

    @Override
    public double Exponentiation(double number, int extent) {
        this.lastOperation = calculator.Exponentiation(number, extent);
        return this.lastOperation;
    }

    @Override
    public double Module(double number) {
        this.lastOperation = calculator.Module(number);
        return this.lastOperation;
    }

    @Override
    public double Sqrt(double number) {
        this.lastOperation = calculator.Sqrt(number);
        return this.lastOperation;
    }

    public void save() {
        this.savedResult = lastOperation;
    }

    public double load() {
        double returnResult = savedResult;
        this.savedResult = 0;
        return returnResult;
    }
}
