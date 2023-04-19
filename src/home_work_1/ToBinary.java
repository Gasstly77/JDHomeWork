package home_work_1;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {

        StringBuffer binStr = new StringBuffer();

        Scanner num = new Scanner(System.in);
        System.out.print("Введите число: ");

        if (num.hasNextLong()) {
            long a = num.nextLong();
            if (a < 0) {
                a = Math.abs(a);
                while (a >= 1) {

                    if (a % 2 == 1) {
                        binStr.insert(0, 0);
                    } else {
                        binStr.insert(0, 1);
                    }
                    a = a / 2;
                }
            } else {

                while (a >= 1) {

                    if (a % 2 == 1) {
                        binStr.insert(0, 1);
                    } else {
                        binStr.insert(0, 0);
                    }
                    a = a / 2;
                }
            }
            System.out.println(binStr);
        }else{
            System.out.println("Вы ввели неверное значение!");
        }
    }
}
