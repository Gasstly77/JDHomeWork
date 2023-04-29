package home_work_2.loops;

import java.util.Scanner;

public class MultiplyItSelfOrd {
    public static void main(String[] args) {

        Scanner inVal = new Scanner(System.in);
        System.out.print("Введите целое число для перемножения: ");

        if (!inVal.hasNextDouble()) {
            System.out.println("Введено не число");
        }else {

            if (inVal.hasNextDouble() && inVal.hasNextInt()) {

                long a = inVal.nextLong();

                long result = 1;
                long nextVal = 1;

                StringBuilder culcFlow = new StringBuilder();

                for (int i = String.valueOf(a).length(); i > 0; i--) {
                    nextVal = a % 10;
                    result = result * nextVal;
                    if (!(nextVal == result)) {
                        culcFlow.insert(0,nextVal + " * ");
                    } else {
                        culcFlow.insert(0,nextVal + " = ");
                    }
                    a = a / 10;
                }

                System.out.print(culcFlow);
                System.out.println(result);
            } else {
                System.out.println("Введено не целое число");
            }
        }
    }
}
