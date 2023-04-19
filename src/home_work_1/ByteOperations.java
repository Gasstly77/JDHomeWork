package home_work_1;

import java.util.Scanner;

public class ByteOperations {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        System.out.print("Input first number:");

        if (numInput.hasNextInt()) {
            int a = numInput.nextInt();
            System.out.print("Input second number:");
            if (numInput.hasNextInt()) {
                int b = numInput.nextInt();
                int result1 = a & b;  // 39 & 12 - 100111 & 001100 = 000100 итоговое значение 4
                int result2 = a | b; // 42 | 6 - 101010 | 000110 = 101110 итоговое значение 46
                // побитовае операции возможны только с целочисленными типами, в связи с этим, операции с 42.5 невозможны
                System.out.println(String.join("\n", String.format("Result of & operation is %s", result1),
                        String.format("Result of | operation is %s", result2)));
                } else {
                System.out.println("Wrong Input. Restart and try again");

            }
        }else{
            System.out.println("Wrong Input. Restart and try again");
        }
    }
}

