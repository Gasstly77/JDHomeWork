package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class YourName3 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");

        String n = name.nextLine();

        switch (n) {
            case "Вася" :
                System.out.println("Привет!");
                System.out.println("Я так долго тебя ждал");
                break;
            case "Анастасия":
                System.out.println("Я так долго тебя ждал");
                break;

            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
