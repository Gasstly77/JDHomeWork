package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithOperator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoChoiceAgregation {
    private long countOperation1 = 0;
    private long countOperation2 = 0;
    private long countOperation3 = 0;
    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator currCalculator) {
        this.calculator1 = currCalculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy currCalculator) {
        this.calculator2 = currCalculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends currCalculator) {
        this.calculator3 = currCalculator;
    }

    public double Addition1(double term1 , double term2) {
        ++countOperation1;
        return calculator1.Addition(term1, term2);
    }

    public double Multiplication1 (double multiplier1, double multiplier2) {
        ++countOperation1;
        return calculator1.Multiplication(multiplier1, multiplier2);
    }

    public double Subtraction1 (double subtrahend1, double subtrahend2) {
        ++countOperation1;
        return calculator1.Subtraction(subtrahend1, subtrahend2);
    }

    public double Division1 (double divider1, double divider2) {
        ++countOperation1;
        return calculator1.Division(divider1, divider2);
    }

    public double Exponentiation1 (double number, int extent) {
        ++countOperation1;
        return calculator1.Exponentiation(number, extent);
    }

    public double Module1 (double number) {
        ++countOperation1;
        return calculator1.Module(number);
    }

    public double Sqrt1(double number) {
        ++countOperation1;
        return calculator1.Sqrt(number);
    }

    public long getCountOperation1() {
        return countOperation1;
    }

    public double Addition2(double term1 , double term2) {
        ++countOperation2;
        return calculator2.Addition(term1, term2);
    }

    public double Multiplication2 (double multiplier1, double multiplier2) {
        ++countOperation2;
        return calculator2.Multiplication(multiplier1, multiplier2);
    }

    public double Subtraction2 (double subtrahend1, double subtrahend2) {
        ++countOperation2;
        return calculator2.Subtraction(subtrahend1, subtrahend2);
    }

    public double Division2 (double divider1, double divider2) {
        ++countOperation2;
        return calculator2.Division(divider1, divider2);
    }

    public double Exponentiation2 (double number, int extent) {
        ++countOperation2;
        return calculator2.Exponentiation(number, extent);
    }

    public double Module2 (double number) {
        ++countOperation2;
        return calculator2.Module(number);
    }

    public double Sqrt2(double number) {
        ++countOperation2;
        return calculator2.Sqrt(number);
    }

    public long getCountOperation2() {
        return countOperation2;
    }

    public double Addition3(double term1 , double term2) {
        ++countOperation3;
        return calculator3.Addition(term1, term2);
    }

    public double Multiplication3 (double multiplier1, double multiplier2) {
        ++countOperation3;
        return calculator3.Multiplication(multiplier1, multiplier2);
    }

    public double Subtraction3 (double subtrahend1, double subtrahend2) {
        ++countOperation3;
        return calculator3.Subtraction(subtrahend1, subtrahend2);
    }

    public double Division3 (double divider1, double divider2) {
        ++countOperation3;
        return calculator3.Division(divider1, divider2);
    }

    public double Exponentiation3 (double number, int extent) {
        ++countOperation3;
        return calculator3.Exponentiation(number, extent);
    }

    public double Module3 (double number) {
        ++countOperation3;
        return calculator3.Module(number);
    }

    public double Sqrt3(double number) {
        ++countOperation3;
        return calculator3.Sqrt(number);
    }

    public long getCountOperation3() {
        return countOperation3;
    }
}
