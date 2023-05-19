package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {

        double result = 4.1 + 15 * 7 + (((double) 28 / 5) * ((double) 28 / 5)); // 4.1 + 105 + 31.36 = 140.46
        int multiply = 15 * 7; // результат умножения - 105
        double square = ((double) 28 / 5) * ((double) 28 / 5); // результат возведения в квадрат - 5.6 * 5.6 = 31.36
        double firstSumm = 4.1 + multiply; // резульат сложения первых слогаемых - 4.1 + 105 = 109.1
        double finalSumm = firstSumm + square; // итоговый результат сложения - 109.1 + 31.36 = 140.46

        String resultAll  = String.format("%.2f",result);
        String resultByActions = String.format("%.2f",finalSumm);

        System.out.println(resultAll);
        System.out.println(resultByActions);
    }
}
