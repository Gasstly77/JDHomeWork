package home_work_2.loops;

import java.util.Scanner;

public class FindLastFull {
    public static void main(String[] args) {

        Scanner input = new Scanner(args[0]);

        if (input.hasNextInt()) {
            long arg = input.nextLong();

            if (arg >= 0) {

                if (checkFull(arg)[1] == 0) {

                    for (int t = 1; t <= arg; t++) {
                        if (t == arg) {
                            System.out.print(t + " = ");
                        } else {
                            System.out.print(t + " * ");
                        }
                    }

                    System.out.println(checkFull(arg)[0]);
                } else {
                    System.out.println("Результат превышает размер типа переменой, значение до превышения = "+checkFull(arg)[2]);
                }
            } else {
                System.out.println("Неверный ввод, укажите положительное число не больше 20");
            }
        } else {
            System.out.println("Неверный ввод, указано не число! Введите число от 0 до 20");
        }
    }

    /**
     *Метод вычисляет факториал полученного числа, а также проверят переполненность результата, в случае переполнения указывает последнее число факториал которого можно получить без переполнения
     * @param arg значение переменной факториал которой необходимо рассчитать
     * @return возвращает массив который содержит факториал указанного числа, статус переполненности поля, если значение 0 - поле нормального размера, если значение 1 - поле переполнено, результат вычисления будет некорретный, а также последнее значение аргумента факториал которого можно получить без переполнения
     */
    public static long[] checkFull(long arg) {
        long result = 1;
        long isFull = 0;
        long oldResult;
        int i = 1;

        while (i <= arg ) {
            oldResult = result;
            result = result * i;
            if (oldResult > result || result == 0) {
                --i;
                isFull = 1;
                break;
            }
            i++;
        }

        long lastArg = i;

        return new long[]{result,isFull,lastArg};
    }
}
