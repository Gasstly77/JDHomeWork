package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends{

    private long countOperation = 0;

    public double Addition (double term1, double term2) {
        ++countOperation;
        return super.Addition(term1, term2);
    }

    public double Multiplication (double multiplier1, double multiplier2) {
        ++countOperation;
        return super.Multiplication(multiplier1, multiplier2);
    }

    public double Subtraction (double subtrahend1, double subtrahend2) {
        ++countOperation;
        return super.Subtraction(subtrahend1, subtrahend2);
    }

    public double Division (double divider1, double divider2) {
        ++countOperation;
        return  super.Division(divider1, divider2);
    }

    public double Exponentiation (double number, int extent) {
        ++countOperation;
        return super.Exponentiation(number,extent);
    }

    public double Module (double number) {
        ++countOperation;
        return super.Module(number);
    }

    public double Sqrt(double number) {
        ++countOperation;
        return super.Sqrt(number);
    }

    public long getCountOperation() {
        return countOperation;
    }
}
