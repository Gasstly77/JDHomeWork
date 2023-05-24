package home_work_2.loops;

public class FactorialFor {

    public static String factorialForCalculation (int arg) {

        String factorial = "";

        if (arg >= 0 && arg < 21) {

            long result = factorialForResult(arg);

            if (arg == 0) {
                factorial = "0";
            } else {
                for (int t = 1; t <= arg; t++) {
                    if (t == arg) {
                        factorial = factorial + t + " = " + result;
                    } else {
                        factorial = factorial + t + " * ";
                    }
                }
            }
        } else {
            factorial = "Неверный ввод, укажите положительное число не больше 20";
        }
        return factorial;
    }

    public static long factorialForResult (int arg) {
        long result = 1;

        for (int i = 1; i <= arg; i++) {
            result = result * i;
        }
        return result;
    }
}
