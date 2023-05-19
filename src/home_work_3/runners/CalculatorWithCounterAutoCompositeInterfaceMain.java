package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    public static void main(String[] args) {
        String testTask = "4.1 + 15 * 7 + (28 / 5) ^ 2";

        CalculatorWithCounterAutoAgregationInterface calculator1 = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());

        double multiply = calculator1.Multiplication(15,7);
        double division = calculator1.Division(28,5);
        double square = calculator1.Exponentiation(division,2);
        double firstSumm = calculator1.Addition(4.1,multiply);
        double finalSumm = calculator1.Addition(firstSumm,square);

        String result = String.format("%.2f",finalSumm);

        System.out.println("Результат деления - "+division);
        System.out.println("Результат умножения - "+multiply);
        System.out.println("Результат возведения в квадрат - "+square);
        System.out.println("Результат сложения - "+firstSumm);
        System.out.println(testTask + " = "+ result);
        System.out.println("количетсво обращений к калькулятору - " + calculator1.getCountOperation());

        System.out.println("--------------------------------");

        CalculatorWithCounterAutoAgregationInterface calculator2 = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());

        double multiply2 = calculator2.Multiplication(15,7);
        double division2 = calculator2.Division(28,5);
        double square2 = calculator2.Exponentiation(division2,2);
        double firstSumm2 = calculator2.Addition(4.1,multiply2);
        double finalSumm2 = calculator2.Addition(firstSumm2,square2);

        String result2 = String.format("%.2f",finalSumm2);

        System.out.println("Результат деления - "+division2);
        System.out.println("Результат умножения - "+multiply2);
        System.out.println("Результат возведения в квадрат - "+square2);
        System.out.println("Результат сложения - "+firstSumm2);
        System.out.println(testTask + " = "+ result2);
        System.out.println("количетсво обращений к калькулятору - " + calculator2.getCountOperation());

        System.out.println("--------------------------------");

        CalculatorWithCounterAutoAgregationInterface calculator3 = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());

        double multiply3 = calculator3.Multiplication(15,7);
        double division3 = calculator3.Division(28,5);
        double square3 = calculator3.Exponentiation(division3,2);
        double firstSumm3 = calculator3.Addition(4.1,multiply3);
        double finalSumm3 = calculator3.Addition(firstSumm3,square3);

        String result3 = String.format("%.2f",finalSumm3);

        System.out.println("Результат деления - "+division3);
        System.out.println("Результат умножения - "+multiply3);
        System.out.println("Результат возведения в квадрат - "+square3);
        System.out.println("Результат сложения - "+firstSumm3);
        System.out.println(testTask + " = "+ result3);
        System.out.println("количетсво обращений к калькулятору - " + calculator3.getCountOperation());

    }
}
