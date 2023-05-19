package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();

        String testTask = "4.1 + 15 * 7 + (28 / 5) ^ 2";

        double multiply = calculator.Multiplication(15,7);
        calculator.incrementCountOperation();
        double division = calculator.Division(28,5);
        calculator.incrementCountOperation();
        double square = calculator.Exponentiation(division,2);
        calculator.incrementCountOperation();
        double firstSumm = calculator.Addition(4.1,multiply);
        calculator.incrementCountOperation();
        double finalSumm = calculator.Addition(firstSumm,square);
        calculator.incrementCountOperation();

        String result = String.format("%.2f",finalSumm);

        System.out.println("Результат деления - "+division);
        System.out.println("Результат умножения - "+multiply);
        System.out.println("Результат возведения в квадрат - "+square);
        System.out.println("Результат сложения - "+firstSumm);
        System.out.println(testTask + " = "+ result);
        System.out.println("количетсво обращений к калькулятору - " + calculator.getCountOperation());
    }
}
