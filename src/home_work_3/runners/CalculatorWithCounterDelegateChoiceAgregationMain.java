package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        String testTask = "4.1 + 15 * 7 + (28 / 5) ^ 2";

        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());

        double multiply = calculator1.Multiplication1(15,7);
        double division = calculator1.Division1(28,5);
        double square = calculator1.Exponentiation1(division,2);
        double firstSumm = calculator1.Addition1(4.1,multiply);
        double finalSumm = calculator1.Addition1(firstSumm,square);

        String result = String.format("%.2f",finalSumm);

        System.out.println("Результат деления - "+division);
        System.out.println("Результат умножения - "+multiply);
        System.out.println("Результат возведения в квадрат - "+square);
        System.out.println("Результат сложения - "+firstSumm);
        System.out.println(testTask + " = "+ result);
        System.out.println("количетсво обращений к калькулятору - " + calculator1.getCountOperation1());

        System.out.println("--------------------------------");

        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());

        double multiply2 = calculator2.Multiplication2(15,7);
        double division2 = calculator2.Division2(28,5);
        double square2 = calculator2.Exponentiation2(division2,2);
        double firstSumm2 = calculator2.Addition2(4.1,multiply2);
        double finalSumm2 = calculator2.Addition2(firstSumm2,square2);

        String result2 = String.format("%.2f",finalSumm2);

        System.out.println("Результат деления - "+division2);
        System.out.println("Результат умножения - "+multiply2);
        System.out.println("Результат возведения в квадрат - "+square2);
        System.out.println("Результат сложения - "+firstSumm2);
        System.out.println(testTask + " = "+ result2);
        System.out.println("количетсво обращений к калькулятору - " + calculator2.getCountOperation2());

        System.out.println("--------------------------------");

        CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());

        double multiply3 = calculator3.Multiplication3(15,7);
        double division3 = calculator3.Division3(28,5);
        double square3 = calculator3.Exponentiation3(division3,2);
        double firstSumm3 = calculator3.Addition3(4.1,multiply3);
        double finalSumm3 = calculator3.Addition3(firstSumm3,square3);

        String result3 = String.format("%.2f",finalSumm3);

        System.out.println("Результат деления - "+division3);
        System.out.println("Результат умножения - "+multiply3);
        System.out.println("Результат возведения в квадрат - "+square3);
        System.out.println("Результат сложения - "+firstSumm3);
        System.out.println(testTask + " = "+ result3);
        System.out.println("количетсво обращений к калькулятору - " + calculator3.getCountOperation3());

    }
}
