package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory {
    private ICalculator calculator;
    private double savedResult;
    private double lastOperation;

    public CalculatorWithMemory(ICalculator currCalculator) {
        this.calculator = currCalculator;
    }

    public double Addition(double term1, double term2) {
        return this.lastOperation = calculator.Addition(term1, term2);
    }

    public double Multiplication (double multiplier1, double multiplier2) {
        return this.lastOperation = calculator.Multiplication(multiplier1, multiplier2);
    }

    public double Subtraction (double subtrahend1, double subtrahend2) {
        return this.lastOperation = calculator.Subtraction(subtrahend1, subtrahend2);
    }

    public double Division (double divider1, double divider2) {
        return this.lastOperation = calculator.Division(divider1, divider2);
    }

    public double Exponentiation (double number, int extent) {
        return this.lastOperation = calculator.Exponentiation(number, extent);
    }

    public double Module (double number) {
        return this.lastOperation = calculator.Module(number);
    }

    public double Sqrt(double number) {
        return this.lastOperation = calculator.Sqrt(number);
    }

    public void save() {
        this.savedResult = this.lastOperation;
    }

    public double load() {
        double returnResult = this.savedResult;
        this.savedResult = 0;
        return returnResult;
    }
}
