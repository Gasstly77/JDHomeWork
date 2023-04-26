package home_work_1;

import java.util.Scanner;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        Scanner phoneNum = new Scanner(System.in);
        System.out.print("Insert 10 random numbers from 0-9: ");

        if (phoneNum.hasNextLong()) {

            long phone = phoneNum.nextLong();

            if ( String.valueOf(phone).length() == 10 ) {

                long firstThree = phone / 10000000;

                long secondThree = (phone / 10000) % 1000;

                long lastFour = phone % 10000;

                System.out.println("Your phone number is: ("+firstThree +") "+ secondThree+"-"+lastFour);
            }else {
            System.out.println("Wrong length, insert 10 numbers");
            }
        }else{
            System.out.println("Wrong input! Please, insert only numbers");
        }
    }
}
