package home_work_1;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        System.out.print("Input number:");

        if (numInput.hasNextInt()) {
            int a = numInput.nextInt();
            System.out.print("Input second number:");
                if (numInput.hasNextInt()) {
                    int b = numInput.nextInt();
                    if (a % b == 0) {
                        System.out.println("Вы можете разделить число " + a + " на число " + b);
                    } else {
                        System.out.println("Вы не можете разделить число " + a + " на число " + b);
                    }
                }
        } else {
            System.out.println("Wrong Input. Restart and try again");
        }

    }
}
