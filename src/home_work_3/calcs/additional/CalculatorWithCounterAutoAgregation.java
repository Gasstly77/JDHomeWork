package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
public class CalculatorWithCounterAutoAgregation {

    private CalculatorWithMathCopy calculator;
    long countOperation = 0;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
        this.calculator = calculator;
    }

    public double Addition(double term1, double term2) {
        ++countOperation;
        return calculator.Addition(term1, term2);
    }

    public double Multiplication (double multiplier1, double multiplier2) {
        ++countOperation;
        return calculator.Multiplication(multiplier1, multiplier2);
    }

    public double Subtraction (double subtrahend1, double subtrahend2) {
        ++countOperation;
        return calculator.Subtraction(subtrahend1, subtrahend2);
    }

    public double Division (double divider1, double divider2) {
        ++countOperation;
        return calculator.Division(divider1, divider2);
    }

    public double Exponentiation (double number, int extent) {
        ++countOperation;
        return calculator.Exponentiation(number, extent);
    }

    public double Module (double number) {
        ++countOperation;
        return calculator.Module(number);
    }

    public double Sqrt(double number) {
        ++countOperation;
        return calculator.Sqrt(number);
    }

    public long getCountOperation() {
        return countOperation;
    }
}
