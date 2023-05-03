package home_work_2.loops;

import java.util.Scanner;

public class FactorialRecNorm {
    public static void main(String[] args) {

        if (args.length != 0) {

            Scanner input = new Scanner(args[0]);
            long arg = input.nextLong();

            if (arg >= 0 && arg < 21) {

                for (int t = 1; t <= arg; t++) {
                    if (t == arg) {
                        System.out.print(t + " = ");
                    } else {
                        System.out.print(t + " * ");
                    }
                }

                System.out.println(fuctorial(arg));
            } else {
                System.out.println("Неверный ввод, укажите положительное число не больше 20");
            }
        } else {
            System.out.println("Пустой аргумент! Введите значение от 0 до 20");
        }
    }

    /**
     * функция которая вычисляет факториал заданного числа
     * @param arg значение факториал которого необходимо получить
     * @return фактриал полученной переменной
     */
    public static long fuctorial (long arg) {
        long result;

        if (arg == 0) {
            return 1;
        } else {
            result = arg * fuctorial(arg - 1);
        }
        return result;
    }

}
