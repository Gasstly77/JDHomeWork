package home_work_1;

import java.util.Scanner;

public class CreatePhoneExtra {
    public static void main(String[] args) {
        Scanner inputArr = new Scanner(System.in);
        System.out.print("Insert 10 random numbers through a space or ',' example 1 2 3 4 5 6 7 8 9 0: ");

        String phoneArr = inputArr.nextLine();

        if (phoneArr.contains(" ")) {
            phoneArr = phoneArr.replaceAll(" ","");
        } else if (phoneArr.contains(",")) {
            phoneArr = phoneArr.replaceAll(",","");
        }

        int phone2 = Integer.parseInt(phoneArr);

        if (String.valueOf(phone2).length() == 10 ) {

            System.out.println(сreatePhoneNumber(phone2));
        }else{
            System.out.println("Wrong length, insert 10 numbers");
        }
    }

    /**
     * Метод обрабатывает полученные от пользователя цифры и форматирует их согласно требованиям
     * @param phone - отформатированный набор цифр введенных пользователем
     * @return Возвращаяет строку с номер телефона в формате (XXX)XXX-XXXX
     */
    public static String сreatePhoneNumber (long phone) {

        long firstThree = phone / 10000000;

        long secondThree = (phone / 10000) % 1000;

        long lastFour = phone % 10000;

        String resultNumber= "("+firstThree+") "+secondThree + "-"+lastFour;

        return resultNumber;
    }

}
