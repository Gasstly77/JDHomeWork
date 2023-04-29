package home_work_2.arrays;

import java.util.Arrays;

public class ArraysIteration {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        allElem(array);
        System.out.println();
        allSecondElem(array);
        System.out.println();
        allReverseElem(array);
    }

    private static StringBuilder allElem (int[] arr) {
        StringBuilder arrElem = new StringBuilder();

        int[] array = arr;

        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            System.out.print(elem + " ");
            arrElem.insert(i, elem);
        }

        System.out.println();

        for (int f : array) {
            int secondElem = f;
            System.out.print(secondElem + " ");
        }

        System.out.println();

        int w = 0;

        while (w < array.length) {
            int secondElem = array[w];
            System.out.print(secondElem + " ");
            w++;
        }

        System.out.println();

        int d = 0;

        do {
            int secondElem = array[d];
            System.out.print(secondElem + " ");
            d++;
        } while (d < array.length);

        return arrElem;
    }

    private static StringBuilder allSecondElem (int[] arr) {

        StringBuilder arrSecondElem = new StringBuilder();

        int pos = 0;

        int[] array = arr;

        for (int i = 0; i < array.length; i+=2) {
            int secondElem = array[i];
            System.out.print(secondElem + " ");
            arrSecondElem.insert(pos++, secondElem);
        }

        System.out.println();

        int w = 0;

        while (w < array.length) {
            int secondElem = array[w];
            System.out.print(secondElem + " ");
            w+=2;
        }

        System.out.println();

        int d = 0;

        do {
            int secondElem = array[d];
            System.out.print(secondElem + " ");
            d+=2;
        } while (d < array.length);

        System.out.println();

        int s = 0; // если s==0, эелемент массива включается в выборку, если s==1 элемент пропускается

        for (int f : array) {
            int secondElem = f;
            if (s == 0) {
                System.out.print(secondElem + " ");
                s=1;
            } else if (s==1) {
                s=0;
            }
        }

        return arrSecondElem;
    }

    private static StringBuilder allReverseElem (int[] arr) {

        StringBuilder arrReverseElem = new StringBuilder();

        int pos = 0;
        int[] array = arr;

        for (int i = array.length-1; i >= 0; i--) {
            int reverseElem = array[i];
            System.out.print(reverseElem + " ");
            arrReverseElem.insert(pos++, reverseElem);
        }

        System.out.println();

        int w = array.length-1;

        while (w >= 0 ) {
            int secondElem = array[w];
            System.out.print(secondElem + " ");
            w--;
        }

        System.out.println();

        int d = array.length-1;

        do {
            int secondElem = array[d];
            System.out.print(secondElem + " ");
            d--;
        } while (d >= 0);

        System.out.println();

        int nPos = (array.length-1);
        int[] revArr = new int[array.length];

        for (int nf : array) {
            revArr[nPos--] = nf;
        }
        for (int f : revArr) {
            int secondElem = f;
            System.out.print(secondElem + " ");
        }

        return arrReverseElem;
    }

}
