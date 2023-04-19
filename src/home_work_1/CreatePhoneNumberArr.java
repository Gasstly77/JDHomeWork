package home_work_1;

import java.util.Arrays;
import java.util.Scanner;

public class CreatePhoneNumberArr {
    public static void main(String[] args) {

        Scanner inputArr = new Scanner(System.in);
        System.out.print("Insert 10 random numbers in format 0 1 2 3 4 5 6 7 8 9: ");
        //int [] phoneNum = {1,2,3,4,5,6,7,8,9,0};

        String phoneArr = inputArr.nextLine();

        String [] phoneNum = phoneArr.split(" ");

        String phone1 = Arrays.toString(phoneNum);
        phone1 = phone1.substring(1,phone1.length()-1);
        phone1 = phone1.replaceAll(", ", "");

        long phone2 = Long.parseLong(phone1);

        if (phone2 / 100000000 > 10 && phone2 / 1000000000 < 10 ) {

            long firstThree = phone2 / 10000000;

            long secondThree = (phone2 / 10000) % 1000;

            long lastFour = phone2 % 10000;

            System.out.println("Your phone number is: ("+firstThree +") "+ secondThree+"-"+lastFour);
        }else {
            System.out.println("Wrong length, insert 10 numbers");
        }
    }
}
