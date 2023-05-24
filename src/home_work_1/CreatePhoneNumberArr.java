package home_work_1;

import java.util.Scanner;

public class CreatePhoneNumberArr {
    public static void main(String[] args) {

        Scanner inputArr = new Scanner(System.in);
        System.out.print("Insert 10 random numbers in format 0 1 2 3 4 5 6 7 8 9 or 1,2,3,4,5,6,7,8,9,0: ");

        String phoneString = inputArr.nextLine();

        int [] phoneArr = makeArr(phoneString);

        if (phoneArr != null) {
            if (phoneArr.length == 10) {
                System.out.println("Your phone number is: " + createPhoneNumber(phoneArr));
            } else {
                System.out.println("Неверная длинна номера, телефон должен состоять из 10 символов");
            }
        }
    }

    public static String createPhoneNumber (int [] phoneArr) {
        String firstThree = "" + phoneArr[0] + phoneArr[1] + phoneArr[2];
        String secondThree = "" + phoneArr[3] + phoneArr[4] + phoneArr[5];
        String lastFour = "" + phoneArr[6] + phoneArr[7] + phoneArr[8] + phoneArr[9];
        return "("+firstThree +") "+ secondThree+"-"+lastFour;
    }

    public static int [] makeArr (String phoneString) {
        char [] numberArr = phoneString.toCharArray();
        boolean noLatters = true;
        int [] phoneArr = new int[10];
        int n = 0;
        for (char nextVal : numberArr) {
            if (Character.isLetter(nextVal)) {
                System.out.println("Ошибка ввода! Можно использовать только цифры!");
                noLatters = false;
            }
        }
        if (noLatters) {
            for (char num : numberArr) {
                if (Character.isDigit(num)) {
                    phoneArr[n] = Character.getNumericValue(num);
                    ++n;
                }
            }
            return phoneArr;
        } else {
            return null;
        }
    }
}
