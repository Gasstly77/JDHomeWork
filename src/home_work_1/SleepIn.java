package home_work_1;

import java.util.Scanner;

public class SleepIn {
    public static void main(String[] args) {
        Scanner week = new Scanner(System.in);
        System.out.print("Is it weekday insert true or false: ");

        if (week.hasNextBoolean()) {
            boolean weekday = week.nextBoolean();

            Scanner vac = new Scanner(System.in);
            System.out.print("Is it vacation insert true or false: ");

            if (vac.hasNextBoolean()) {
                boolean vacation = vac.nextBoolean();

                boolean sleep = !(weekday && !vacation);

                System.out.println("You can continue to sleep: " + sleep);
            }else{
                System.out.println("Wrong input! Type true of false");
            }
        }else{
            System.out.println("Wrong input! Type true of false");
        }

    }
}
