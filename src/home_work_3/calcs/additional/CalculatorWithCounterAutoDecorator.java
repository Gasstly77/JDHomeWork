package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {

    private ICalculator calculator;
    private long countOperation = 0;

    public CalculatorWithCounterAutoDecorator(ICalculator currCalculator) {
        this.calculator = currCalculator;
    }
    public ICalculator getCalculator() {
        return this.calculator;
    }

    @Override
    public double Addition(double term1, double term2) {
        ++countOperation;
        return calculator.Addition(term1, term2);
    }

    @Override
    public double Multiplication(double multiplier1, double multiplier2) {
        ++countOperation;
        return calculator.Multiplication(multiplier1, multiplier2);
    }

    @Override
    public double Subtraction(double subtrahend1, double subtrahend2) {
        ++countOperation;
        return calculator.Subtraction(subtrahend1, subtrahend2);
    }

    @Override
    public double Division(double divider1, double divider2) {
        ++countOperation;
        return calculator.Division(divider1, divider2);
    }

    @Override
    public double Exponentiation(double number, int extent) {
        ++countOperation;
        return calculator.Exponentiation(number, extent);
    }

    @Override
    public double Module(double number) {
        ++countOperation;
        return calculator.Module(number);
    }

    @Override
    public double Sqrt(double number) {
        ++countOperation;
        return calculator.Sqrt(number);
    }

    public long getCountOperation() {
        return countOperation;
    }
}
