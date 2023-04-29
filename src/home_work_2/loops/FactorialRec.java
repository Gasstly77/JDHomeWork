package home_work_2.loops;

import java.util.Scanner;

public class FactorialRec {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите число выполняемых перемножений: ");

        if (input.hasNextInt()) {

            long arg = input.nextLong();

            if (arg >= 0 && arg < 21) {

                System.out.println(fuctorial(arg, arg));
            } else {
                System.out.println("Неверный ввод, укажите положительное число не больше 20");
            }
        } else {
            System.out.println("Неверный ввод, укажите положительное число не больше 20");
        }
    }

    /**
     * функция которая вычисляет факториал заданной переменной
     * @param arg значение факториал которого необходимо получить
     * @param def значения факториала, для определения окончания работы цикла
     * @return выводит в консль все шаги выполнения умножения и возвращает факториал переданной переменной
     */
    public static long fuctorial (long arg, long def) {
        long result = 1;
        String multiply = arg + " * ";
        String equally = arg + " = ";

        StringBuffer culc = new StringBuffer();

        if (arg == 0) {
            return 1;
        }else {
            result = arg * fuctorial((arg - 1), def);
            if (arg == def ) {
                culc.insert(0,equally);
            }else{
                culc.insert(0,multiply);
            }
            System.out.print(culc);
            return result;
        }
    }
}
