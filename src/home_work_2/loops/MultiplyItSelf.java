package home_work_2.loops;

import java.util.Scanner;

public class MultiplyItSelf {
    public static void main(String[] args) {

        Scanner inVal = new Scanner(System.in);
        System.out.print("Введите целое число для перемножения: ");

        if (!inVal.hasNextDouble()) {
            System.out.println("Введено не число");
        }else {

            if (inVal.hasNextDouble() && inVal.hasNextLong()) {

                long a = inVal.nextLong();

                long result = 1;
                long nextVal;

                for (int i = String.valueOf(a).length(); i > 0; i--) {
                    nextVal = a % 10;
                    result = result * nextVal;
                    if (a / 10 != 0) {
                        System.out.print(nextVal + " * ");
                    } else {
                        System.out.print(nextVal + " = ");
                    }
                    a = a / 10;
                }

                System.out.println(result);
            } else {
                System.out.println("Введено не целое число");
            }
        }
    }
}
