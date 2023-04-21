package home_work_1;

import java.util.Scanner;

public class CreatePhoneEZ {
    public static void main(String[] args) {
        Scanner numArr = new Scanner(System.in);
        System.out.print("Введите массив чисел: ");

        if (numArr.hasNextInt()) {

            int a0 = numArr.nextInt();
            int a1 = numArr.nextInt();
            int a2 = numArr.nextInt();
            int a3 = numArr.nextInt();
            int a4 = numArr.nextInt();
            int a5 = numArr.nextInt();
            int a6 = numArr.nextInt();
            int a7 = numArr.nextInt();
            int a8 = numArr.nextInt();
            int a9 = numArr.nextInt();

            System.out.println("(" + a0 + a1 + a2 + ")-" + a3 + a4 + a5 + "-" + a6 + a7 + a8 + a9);
        }else{
            System.out.println("НЕВЕРНЫЙ ВВОД! напишите цифры в формате 0 1 2 3 4 5 6 7 8 9 без использования дополнительных символов");
        }
    }
}
