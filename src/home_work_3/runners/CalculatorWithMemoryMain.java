package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {

    public static void main(String[] args) {
        String testTask = "4.1 + 15 * 7 + (28 / 5) ^ 2";

        CalculatorWithMemory calculator1 = new CalculatorWithMemory(new CalculatorWithOperator());

        double multiply = calculator1.Multiplication(15, 7);
        double division = calculator1.Division(28, 5);
        double square = calculator1.Exponentiation(division, 2);
        calculator1.save();
        double firstSumm = calculator1.Addition(4.1, multiply);
        double finalSumm = calculator1.Addition(firstSumm, square);
        calculator1.save();

        String result = String.format("%.2f", finalSumm);

        System.out.println("Результат деления - " + division);
        System.out.println("Результат умножения - " + multiply);
        System.out.println("Результат возведения в квадрат - " + square);
        System.out.println("Результат сложения - " + firstSumm);
        System.out.println(testTask + " = " + result);
        System.out.println("результат последней операции - " + calculator1.load());
        System.out.println("результат последней операции - " + calculator1.load());

        System.out.println("--------------------------------");
    }
}
