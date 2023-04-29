package home_work_2.loops;

import java.util.Scanner;

public class Degree {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите число для возведения в степень: ");

        if (num.hasNextDouble()) {
            Scanner deg = new Scanner(System.in);
            System.out.print("Введите степень возведения: ");
            if (deg.hasNextInt()) {

                int b = deg.nextInt();

                if (b >= 0) {

                    double a = num.nextDouble();
                    double result = 1;

                    int i = 0;

                    while (i < b) {
                        result = result * a;
                        i++;
                    }
                    System.out.println(a + " ^ " + b + " = " + result);
                } else {
                    System.out.println("Степень дожна быть положительной!");
                }
            }else {
                System.out.println("Степень должна быть целым числом!");
            }
        } else {
            System.out.println("Неверный ввод, Вы ввели не число!");
        }
    }
}
