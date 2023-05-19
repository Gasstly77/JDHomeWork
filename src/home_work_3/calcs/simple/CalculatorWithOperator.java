package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    public double Addition (double term1, double term2) {
        return term1 + term2;
    }

    public double Multiplication (double multiplier1, double multiplier2) {
        return multiplier1 * multiplier2;
    }

    public double Subtraction (double subtrahend1, double subtrahend2) {
        return subtrahend1 - subtrahend2;
    }

    public double Division (double divider1, double divider2) {
        return (double) divider1 / divider2;
    }

    public double Exponentiation (double number, int extent) {
        double result = 0;
        for (int i = 0; i < extent; i++) {
            result = number * number;
        }
        return result;
    }

    public double Module (double number) {
        double result;
        if (number < 0) {
            result = number * (-1);
        } else {
            result = number;
        }
        return result;
    }

    public double Sqrt(double number) {
        double n;
        double squareRoot = number / 2;
        do {
            n = squareRoot;
            squareRoot = (n + (number / n)) / 2;
        } while ((n - squareRoot) != 0);

        return squareRoot;
    }
}