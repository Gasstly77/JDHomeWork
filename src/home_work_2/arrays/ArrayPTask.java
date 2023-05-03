package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class ArrayPTask {

    public static void main(String[] args) {

        int[] arr = {5,12,4,7,5,3,8,9,23,8};
        int[] arr2 = {5,5,16,4,5,9,5,4,5,5};
        cutArr2(arr2);

        StorageTwoMin twoMin = twoMinElem(arr);
        StorageTwoMin twoMinShake = twoMinSelfSort();

        System.out.println("Сумма четных положительных: "+arraySum(arr));
        System.out.println("максимальный эелемент с четным индексом : "+maxElem(arr));
        System.out.println("Массив из элементов меньше средего : "+Arrays.toString(lessElem(arr)));
        System.out.println("Первое минимальное значение : "+twoMin.min1+", второе минимальное значение : "+twoMin.min2);
        System.out.println("Шейкерная сортировка. Первое минимальное значение : "+twoMinShake.min1+", второе минимальное значение : "+twoMinShake.min2);
        System.out.println("Массив элементов не входящих в заданный интервал : "+Arrays.toString(cutArr(arr)));
        System.out.println("Отсортированный массив, знечения в интервале заменены на 0 : "+Arrays.toString(arr2));
        System.out.println("Сумма цир массива : "+sumArray(arr));
    }

    /**
     * Суммирует четные положительные элементов массива
     * @param arr массив значений которые необходимо суммировать
     * @return Сумма четных положительных элементов массива
     */
    public static long arraySum (int[] arr) {

        int summEvenElem=0;

        for (int el : arr) {
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
    public static long maxElem (int[] arr) {
        int maxVal = 0;

        for (int i = 0; i < arr.length; i+=2) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    /**
     * Формирует новый массив из элементов переданного массива, которые меньше среднего арифметического
     * @param arr Массив в котором необходимо найти наименьшие элементы
     * @return Новый массив из элементов меньше среднего арифметического всех элементов
     */
    public static int[] lessElem (int[] arr) {

        int sumArr = 0;
        int midVal;
        int[] newArr = {};

        for (int sumEl : arr) {
            sumArr = sumArr + sumEl;
        }

        midVal = sumArr / arr.length;

        for  (int newEl : arr ) {
            if (newEl < midVal) {
                newArr = Arrays.copyOf(newArr, newArr.length+1);
                newArr[newArr.length-1] = newEl;
            }
        }
        return newArr;
    }

    /**
     * Находит два минимальных эелемента переданного массива
     * @param arr массив в котором необходимо найти наименьшие значения
     * @return Возвращает класс в котором хранится два минимальных элемента массива
     */
    public static StorageTwoMin twoMinElem (int[] arr) {
        int min1 = 0;
        int min2 = 0;

        Arrays.sort(arr);

        min1 = arr[0];
        min2 = arr[1];

        return new StorageTwoMin(min1,min2);
    }

    /**
     * Находит 2 минимальных элемента массива используя метод из класса SortUtils
     * @return Возвращает новый массив из двух минимальных элементов
     */
    public static StorageTwoMin twoMinSelfSort () {
        int[] arr = ArraysUtils.arrayRandom(8,50);

        SortsUtils.shake(arr);

        return new StorageTwoMin (arr[0],arr[1]);
    }

    /**
     * Класс для хранения результатов вычисления метода twoMinElem, принимает и хранит первый и второй минимальный элемент массива
     */
    public static class StorageTwoMin {
        private int min1;
        private int min2;

        StorageTwoMin (int min1, int min2) {
            this.min1 = min1;
            this.min2 = min2;
        }
    }

    /**
     * Формирует новый массив, удаляя элементы, принадлежащие интервалу
     * @param arr массив который необходимо сжать
     * @return новый массив, кторый содержит элементы за пределеми интервала
     */
    public static int[] cutArr (int[] arr) {
        int[] interval = {4,7};
        int[] newArr={};

        for (int el : arr) {
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
     */
    public static void cutArr2 (int[] arr) {

        int[] interval = {4, 7};
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
                        int curElem = arr[right];
                        arr[i] = curElem;
                        arr[right] = 0;
                        haveChange = 1;
                        right--;
                    }
                }
            } while (haveChange == 1);
        }
    }

    /**
     * Сумма цифр массива
     * @param arr массив числа которого необходимо суммировать
     * @return возвращает сумму цифр массива
     */
    public static int sumArray (int[] arr) {
        int summ = 0;

        for (int el : arr) {
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
    public static int summElem (int n) {
        int result = 0;
        int nextVal;

        for (int i = String.valueOf(n).length(); i > 0; i--) {
            nextVal = n % 10;
            result = result + nextVal;
            n = n / 10;
        }
        return result;
    }
}
