package home_work_1;

import java.util.Scanner;

public class ByteOperationClass {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int a = console.nextInt();
        System.out.print("Введите число 2: ");
        int b = console.nextInt();

        int andResult = a & b;
        int orResult = a | b;

        StringBuilder finResultAnd =new StringBuilder();
        String result1 = Integer.toBinaryString(andResult);
        finResultAnd.insert(0,result1);
        if (result1.length() < 8) {
            int miss = 8 - result1.length();
            for (int i = 0; i < miss; i++) {
                finResultAnd.insert(0,0);
            }
        }


        StringBuilder finResultOr = new StringBuilder();
        String result2 = Integer.toBinaryString(orResult);
        finResultOr.insert(0,result2);
        if (result2.length() < 8) {
            int miss = 8 - result2.length();
            for (int i = 0; i < miss; i++) {
                finResultOr.insert(0,0);
            }
        }

        System.out.println(andResult+" = "+finResultAnd);
        System.out.println(orResult+" = "+finResultOr);
    }
}
