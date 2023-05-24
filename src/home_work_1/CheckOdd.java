package home_work_1;

import java.util.Scanner;

public class CheckOdd {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        System.out.print("Input number:");

        if (numInput.hasNextInt()) {
            int a = numInput.nextInt();
            numberType(a);
        } else {
            System.out.println("Wrong Input. Restart and try again");
        }
    }

    public static String numberType (int a) {
        if (a%2==0) {
            System.out.println("Число " + a + " - четное");
            return "четное";
        } else {
            System.out.println("Число " + a + " - нечетное");
            return "нечетное";
        }
    }
}
