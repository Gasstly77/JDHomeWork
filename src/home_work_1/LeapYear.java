package home_work_1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.print("Введите год: ");

        if (year.hasNextInt()) {
            int y = year.nextInt();
            if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
                System.out.println(y + " - вискосный год");
            } else {
                System.out.println(y + " - невискосный год");
            }
        }else{
            System.out.println("Неверный формат даты, введите год цифрами");
        }
    }
}
