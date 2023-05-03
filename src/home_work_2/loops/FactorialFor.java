package home_work_2.loops;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {

        if (args.length != 0) {

            Scanner input = new Scanner(args[0]);

            if (input.hasNextInt()) {

                long arg = input.nextLong();

                if (arg >= 0 && arg < 21) {

                    long result = 1;

                    for (int i = 1; i <= arg; i++) {
                        result = result * i;
                    }

                    for (int t = 1; t <= arg; t++) {
                        if (t == arg) {
                            System.out.print(t + " = ");
                        } else {
                            System.out.print(t + " * ");
                        }
                    }

                    System.out.println(result);
                } else {
                    System.out.println("Неверный ввод, укажите положительное число не больше 20");
                }
            } else {
                System.out.println("Неверный ввод! Необходимо указывать число в диапозоне от 0 до 20");
            }
        } else {
            System.out.println("Пустой аргумент! Введите значение от 0 до 20");
        }
    }
}
