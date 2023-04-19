package home_work_1;

import java.util.Scanner;

public class CheckLetter {
    public static void main(String[] args) {
        Scanner letters = new Scanner(System.in);
        System.out.print("Ведите любую букву: ");

        String a = letters.nextLine();
        if (a.length() == 1) {
            char b = a.charAt(0);
            boolean isLatter = Character.isLetter(b);
            if (isLatter) {
                System.out.println("Введенный Вами символ - буква");
            } else {
                System.out.println("Вы ввели не букву");
            }
            ;
        }else{
            System.out.println("Вы ввесли слишком много символов");
        };
    }
}
