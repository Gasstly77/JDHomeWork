package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    public static void main(String[] args) {
        int[] newArr1 = arrayRandom(3,20);
        int[] newArr = arrayFromConsole();

        System.out.println("{"+newArr1[0]+","+newArr1[1]+","+newArr1[2]+"}");
        System.out.println("{"+newArr[0]+","+newArr[1]+","+newArr[2]+"}");
    }
    public static int[] arrayFromConsole() {
        Scanner arrLen = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");

            int l = arrLen.nextInt();
            int[] arr = new int[l];

            for (int i = 0; i < l; i++) {
                Scanner nextElem = new Scanner(System.in);
                System.out.print("Введите значение элемента массива: ");
                arr[i] = nextElem.nextInt();
            }
            return arr;

    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            Random randNumber = new Random();
            int nextEl = randNumber.nextInt(maxValueExclusion) + 1;

            arr[i] = nextEl;
        }

        return arr;

    }

}
