package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();

        String testTask = "4.1 + 15 * 7 + (28 / 5) ^ 2";

        double multiply = calculator.Multiplication(15,7);
        double division = calculator.Division(28,5);
        double square = calculator.Exponentiation(division,2);
        double firstSumm = calculator.Addition(4.1,multiply);
        double finalSumm = calculator.Addition(firstSumm,square);

        String result = String.format("%.2f",finalSumm);

        System.out.println("Результат деления - "+division);
        System.out.println("Результат умножения - "+multiply);
        System.out.println("Результат возведения в квадрат - "+square);
        System.out.println("Результат сложения - "+firstSumm);
        System.out.println(testTask + " = "+ result);
    }
}
