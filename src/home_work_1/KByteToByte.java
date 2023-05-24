package home_work_1;

import java.util.Scanner;

public class KByteToByte {
    public static void main(String[] args) {
        Scanner kBytes = new Scanner(System.in);
        System.out.print("Input number of Kbytes:");

        if (kBytes.hasNextInt()) {
            int a = kBytes.nextInt();
            kByteCalculation(a);
        } else {
            System.out.println("Wrong Input. Restart and try again");
        }
    }

    public static long kByteCalculation (int kByte) {
        long numBytes = 0;
        if (kByte >= 0) {
            numBytes = kByte * 1024;
            System.out.println("В " + kByte + " Kbs " + numBytes + " B");
        } else {
            System.out.println("Wrong Input. Restart and try again");
        }
        return numBytes;
    }
}


