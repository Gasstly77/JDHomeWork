package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    /**
     * Метод предназначен для создания массива указанной длинны и указанным набором элементов.
     * @return Возвращает новый массив длинна которого равна введенной пользователем. Элементы массива заполнены введенными данными.
     */
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

    /**
     * Метод предназначен для создания массива с случайным набором чисел
     * @param size параметр в котором укащывает длинна массива
     * @param maxValueExclusion параметр в котором указывает до какого числа генерировать рандомные числа
     * @return Возвращает новый массив указанной длинны и заполненный случайными числами в пределеах диапазона
     */
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
