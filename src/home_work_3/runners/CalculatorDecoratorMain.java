package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorDecoratorMain {

    public static void main(String[] args) {
        String testTask = "4.1 + 15 * 7 + (28 / 5) ^ 2";

        ICalculator calculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        double multiply = calculator.Multiplication(15, 7);
        double division = calculator.Division(28, 5);
        double square = calculator.Exponentiation(division, 2);
        ((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calculator).getCalculator()).save();
        double firstSumm = calculator.Addition(4.1, multiply);
        double finalSumm = calculator.Addition(firstSumm, square);

        String result = String.format("%.2f", finalSumm);

        System.out.println("Результат деления - " + division);
        System.out.println("Результат умножения - " + multiply);
        System.out.println("Результат возведения в квадрат - " + square);
        System.out.println("Результат сложения - " + firstSumm);
        System.out.println(testTask + " = " + result);
        System.out.println("количетсво обращений к калькулятору - " + ((CalculatorWithCounterAutoDecorator) calculator).getCountOperation());
        System.out.println("результат последней операции - " + (((CalculatorWithMemoryDecorator) ((CalculatorWithCounterAutoDecorator) calculator).getCalculator()).load()));
    }
}
