
package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class YourName1 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");

        String n = name.nextLine();

        if ((Objects.equals(n,"Вася")) || (Objects.equals(n,"Анастасия"))) {
            if (Objects.equals(n,"Вася")) {
                System.out.println("Привет!");
                System.out.println("Я так долго тебя ждал");
            }else{
                System.out.println("Я так долго тебя ждал");
            }
        }else{
            System.out.println("Добрый день, а вы кто?");
        }
    }
}