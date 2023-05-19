package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
public class CalculatorWithCounterClassic extends CalculatorWithMathExtends{

    long countOperation = 0;
    public void incrementCountOperation() {
        ++countOperation;
    }
    public long getCountOperation() {
        return countOperation;
    }
}
