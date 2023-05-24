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
                    divisibilityPossibility(a,b);
                }
        } else {
            System.out.println("Wrong Input. Restart and try again");
        }
    }

    public static boolean divisibilityPossibility (int num1, int num2) {
        boolean possibility = false;
        if (num2 == 0) {
            System.out.println("На 0 делить нельзя!");
            possibility = false;
        }else if (num1 % num2 == 0) {
            System.out.println("Вы можете разделить число " + num1 + " на число " + num2);
            possibility = true;
        } else {
            System.out.println("Вы не можете разделить число " + num1 + " на число " + num2);
            possibility = false;
        }
        return possibility;
    }
}
