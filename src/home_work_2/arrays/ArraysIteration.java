package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {

    public static void main(String[] args) {

        int[] array = ArraysUtils.arrayFromConsole();

        allElem(array);

        System.out.println();
        System.out.println();

        allSecondElem(array);

        System.out.println();
        System.out.println();

        allReverseElem(array);
    }

    /**
     * Выводит в консоль все элементы массива
     * @param arr массив элементы которого необходимо отобразить
     */
    private static void allElem (int[] arr) {

        int[] array = arr;

        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            System.out.print(elem + " ");
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
    }

    /**
     * Выводит в консоль каждый второй элемент массива
     * @param arr массив элементы которого необходимо отобразить
     */
    private static void allSecondElem (int[] arr) {

        int pos = 0;

        int[] array = arr;

        for (int i = 1; i < array.length; i+=2) {
            int secondElem = array[i];
            System.out.print(secondElem + " ");
        }

        System.out.println();

        int w = 1;

        while (w < array.length) {
            int secondElem = array[w];
            System.out.print(secondElem + " ");
            w+=2;
        }

        System.out.println();

        int d = 1;

        do {
            int secondElem = array[d];
            System.out.print(secondElem + " ");
            d+=2;
        } while (d < array.length);

        System.out.println();

        int s = 1; // если s==0, эелемент массива включается в выборку, если s==1 элемент пропускается

        for (int f : array) {
            int secondElem = f;
            if (s == 0) {
                System.out.print(secondElem + " ");
                s=1;
            } else if (s==1) {
                s=0;
            }
        }
    }

    /**
     * Метод выводит все элементы массива в консоль в обратном порядке
     * @param arr массив элементы которого необходимо отобразить
     */
    private static void allReverseElem (int[] arr) {

        int[] array = arr;

        for (int i = array.length-1; i >= 0; i--) {
            int reverseElem = array[i];
            System.out.print(reverseElem + " ");
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
    }

}
