package home_work_1;

import java.util.Scanner;

public class KByteToByte {
    public static void main(String[] args) {
        Scanner kBytes = new Scanner(System.in);
        System.out.print("Input number of Kbytes:");

        if (kBytes.hasNextInt()) {
            long a = kBytes.nextInt();
            long numBytes = a * 1024;
            System.out.println("В " + a + " Kbs " + numBytes + " B");


        } else {
            System.out.println("Wrong Input. Restart and try again");
        }
    }
}


