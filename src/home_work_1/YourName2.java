package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class YourName2 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");

        String n = name.nextLine();

        if (Objects.equals(n,"Вася")) {
            System.out.println("Привет!");
            System.out.println("Я так долго тебя ждал");
        }else if (Objects.equals(n,"Анастасия")){
            System.out.println("Я так долго тебя ждал");
        }else{
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
