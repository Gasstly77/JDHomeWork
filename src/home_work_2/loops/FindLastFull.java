package home_work_2.loops;

import java.util.Scanner;

public class FindLastFull {
    public static void main(String[] args) {

        if (args.length != 0) {

            Scanner input = new Scanner(args[0]);

            if (input.hasNextInt()) {
                long arg = input.nextLong();
                OverflowResults checkOverflow = checkFull(arg);

                if (arg >= 0) {

                    if (checkOverflow.notOverflow) {

                        for (int t = 1; t <= arg; t++) {
                            if (t == arg) {
                                System.out.print(t + " = ");
                            } else {
                                System.out.print(t + " * ");
                            }
                        }

                        System.out.println(checkOverflow.result);
                    } else {
                        System.out.println("Результат превышает размер типа переменой, значение до превышения = " + checkOverflow.beforeOverflow);
                    }
                } else {
                    System.out.println("Неверный ввод, укажите положительное число не больше 20");
                }
            } else {
                System.out.println("Неверный ввод, указано не число! Введите число от 0 до 20");
            }
        } else {
            System.out.println("Пустой аргумент! Введите значение от 0 до 20");
        }
    }

    /**
     *Метод вычисляет факториал полученного числа, а также проверят переполненность результата, в случае переполнения указывает последнее число факториал которого можно получить без переполнения
     * @param arg значение переменной факториал которой необходимо рассчитать
     * @return возвращает класс в котором хранится reuslt - результат вычисления факториала указанного числа,notOverflow - статус переполненности поля, beforeOverflow - последнее значение аргумента факториал которого можно получить без переполнения
     */
    public static OverflowResults checkFull(long arg) {
        long result = 1;
        boolean notFull = true;
        long oldResult;
        int i = 1;

        while (i <= arg ) {
            oldResult = result;
            result = result * i;
            if (oldResult > result || result == 0) {
                --i;
                notFull = false;
                break;
            }
            i++;
        }

        long lastArg = i;

        return new OverflowResults(result,notFull,lastArg);
    }

    /**
     * Класс преднахначен для хранени результатов вычисления метода checkFull, ожидает при вызове результат вычисления факториала, статус переполненности поля, значния аргумента факториал которого можно корректно рассчитать
     */
    private static class OverflowResults {

        public long result;
        public boolean notOverflow;
        public long beforeOverflow;

        OverflowResults (long result, boolean isOverflow, long beforeOverflow) {

            this.result = result;
            this.notOverflow = isOverflow;
            this.beforeOverflow = beforeOverflow;

        }
    }
}
