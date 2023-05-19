package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    public double Exponentiation (double number, int extent) {
        return Math.pow(number,extent);
    }

    public double Module (double number) {
        return Math.abs(number);
    }

    public double Sqrt(double number) {
        return Math.sqrt(number);
    }
}
