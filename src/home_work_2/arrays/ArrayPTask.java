package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class ArrayPTask {

    public static void main(String[] args) {
        long[] arr = {5,12,4,7,5,3,8,9,23,8};
        long[] arr2 = {5,5,16,4,5,9,5,4,5,5};
        System.out.println(arraySum(arr));
        System.out.println(maxElem(arr));
        System.out.println(Arrays.toString(lessElem(arr)));
        System.out.println(Arrays.toString(twoMinElem(arr)));
        System.out.println(Arrays.toString(twoMinSelfSort()));
        System.out.println(Arrays.toString(cutArr(arr)));
        System.out.println(Arrays.toString(cutArr2(arr2)));
        System.out.println(sumArray(arr));
    }

    /**
     * Суммирует четные положительные элементов массива
     * @param arr массив значений которые необходимо суммировать
     * @return Сумма четных положительных элементов массива
     */
    public static long arraySum (long[] arr) {

        long summEvenElem=0;

        for (long el : arr) {
            if (el >= 0 && el % 2 == 0) {
                summEvenElem = summEvenElem+el;
            }
        }
        return summEvenElem;

    }

    /**
     * Находит максимальный эелемент с четным индексом
     * @param arr Массив в котором необходимо найи максимальное число
     * @return Максимальный элемент массива с четным индексом
     */
    public static long maxElem (long[] arr) {
        long maxVal = 0;

        for (int i = 0; i < arr.length; i+=2) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    /**
     * Формирует новый массив их элементов переданного массива, которые меньше среднего арифметического
     * @param arr Массив в котором необходимо найти наименьшие элементы
     * @return Новый массив из элементов меньше среднего арифметического всех элементов
     */
    public static long[] lessElem (long[] arr) {

        long sumArr = 0;
        long midVal;
        long[] newArr = {};

        for (long sumEl : arr) {
            sumArr = sumArr + sumEl;
        }

        midVal = sumArr / arr.length;

        for  (long newEl : arr ) {
            if (newEl < midVal) {
                newArr = Arrays.copyOf(newArr, newArr.length+1);
                newArr[newArr.length-1] = newEl;
            }
        }
        return newArr;
    }

    /**
     * Формирует массив из наименьших элементов переданного массива
     * @param arr массив в котором необходимо найти наименьшие значения
     * @return Новый массив из двух наименьших значений
     */
    public static long[] twoMinElem (long[] arr) {
        long min1 = 0;
        long min2 = 0;

        Arrays.sort(arr);

        min1 = arr[0];
        min2 = arr[1];

        return new long[] {min1,min2};
    }

    /**
     * Находит 2 минимальных элемента массива используя метод из класса SortUtils
     * @return Возвращает новый массив из двух минимальных элементов
     */
    public static int[] twoMinSelfSort () {
        int[] arr = ArraysUtils.arrayRandom(8,50);

        SortsUtils.shake(arr);

        return new int[] {arr[0],arr[1]};
    }

    /**
     * Формирует новый массив, удаляя элементы, принадлежащие интервалу
     * @param arr массив который необходимо сжать
     * @return новый массив, кторый содержит элементы за пределеми интервала
     */
    public static long[] cutArr (long[] arr) {
        long[] interval = {4,7};
        long[] newArr={};

        for (long el : arr) {
            if (el < interval[0] || el > interval[1]) {
               newArr = Arrays.copyOf(newArr,newArr.length+1);
               newArr[newArr.length-1] = el;
            }
        }
        return newArr;
    }

    /**
     * Возвращает исходный массив, заменив элементы принадлежащие интервалу на 0, элементы равные 0 перемещаются в конец массива
     * @param arr массив который необходимо сжать
     * @return исходный массив, в котором, элементы из интервала равны 0 и перемещены в конец массива
     */
    public static long[] cutArr2 (long[] arr) {

        long[] interval = {4, 7};
        int right = arr.length-1;
        int haveChange;
        boolean needSort = false;

        for (int i = 0; i < arr.length;i++) {

            if (arr[i] < interval[0] || arr[i] > interval[1]) {
                needSort = true;
            } else {
                arr[i] = 0;
            }
        }

        if (needSort) {
            do {
                haveChange = 0;
                for (int i = 0; i <= right; i++) {
                    if ((arr[i] >= interval[0] && arr[i] <= interval[1]) || arr[i] == 0) {
                        long curElem = arr[right];
                        arr[i] = curElem;
                        arr[right] = 0;
                        haveChange = 1;
                        right--;
                    }
                }
            } while (haveChange == 1);
        }

        return arr;
    }

    /**
     * Сумма цифр массива
     * @param arr массив числа которого необходимо суммировать
     * @return возвращает сумму цифр массива
     */
    public static long sumArray (long[] arr) {
        long summ = 0;

        for (long el : arr) {
            if (el > 9) {
                summ = summ + summElem(el);
            } else {
                summ = summ + el;
            }
        }
        return summ;
    }

    /**
     * Метод суммирует все цифры числа
     * @param n число цифры которого необходимо суммировать
     * @return возвращает сумму цифр числа
     */
    public static long summElem (long n) {
        long result = 0;
        long nextVal;

        for (int i = String.valueOf(n).length(); i > 0; i--) {
            nextVal = n % 10;
            result = result + nextVal;
            n = n / 10;
        }
        return result;
    }
}
