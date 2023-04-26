package home_work_1;

import java.util.Scanner;

public class CreatePhoneNumberArr {
    public static void main(String[] args) {

        Scanner inputArr = new Scanner(System.in);
        System.out.print("Insert 10 random numbers in format 0 1 2 3 4 5 6 7 8 9 or 1,2,3,4,5,6,7,8,9,0: ");

        String phoneArr = inputArr.nextLine();

        if (phoneArr.contains(" ")) {
            phoneArr = phoneArr.replaceAll(" ","");
        } else if (phoneArr.contains(",")) {
            phoneArr = phoneArr.replaceAll(",","");
        }

        int phone2 = Integer.parseInt(phoneArr);

       if (String.valueOf(phone2).length() == 10 ) {

          long firstThree = phone2 / 10000000;

          long secondThree = (phone2 / 10000) % 1000;

          long lastFour = phone2 % 10000;

          System.out.println("Your phone number is: ("+firstThree +") "+ secondThree+"-"+lastFour);
       }else{
           System.out.println("Wrong length, insert 10 numbers");
       }
    }
}
