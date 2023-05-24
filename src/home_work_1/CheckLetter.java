package home_work_1;

import java.util.Scanner;

public class CheckLetter {
    public static void main(String[] args) {
        Scanner letters = new Scanner(System.in);
        System.out.print("Ведите любую букву: ");
        String a = letters.nextLine();
        checkLatter(a);
    }

    public static boolean checkLatter (String letter) {
        boolean isLatter = false;
        if (letter.length() == 1) {
            char checkSymbol = letter.charAt(0);
            isLatter = Character.isLetter(checkSymbol);
            if (isLatter) {
                System.out.println("Введенный Вами символ - буква");
            } else {
                System.out.println("Вы ввели не букву");
            }
        }else{
            System.out.println("Вы ввесли слишком много символов");
        }
        return isLatter;
    }
}
