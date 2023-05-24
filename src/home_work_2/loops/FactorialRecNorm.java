package home_work_2.loops;

public class FactorialRecNorm {
    public static String factorialCalc (int arg) {

        String factorial = "";

        if (arg >= 0 && arg < 21) {

            long result = fuctorial(arg);

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

    /**
     * функция которая вычисляет факториал заданного числа
     * @param arg значение факториал которого необходимо получить
     * @return фактриал полученной переменной
     */
    public static long fuctorial (int arg) {
        long result;

        if (arg == 0) {
            return 1;
        } else {
            result = arg * fuctorial(arg - 1);
        }
        return result;
    }

}
