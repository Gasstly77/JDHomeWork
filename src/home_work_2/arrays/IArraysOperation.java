package home_work_2.arrays;

public interface IArraysOperation {

    /**
     * Выводит в консоль все элементы массива
     *
     * @param arr массив элементы которого необходимо отобразить
     */
    String allArray(int[] arr);

    /**
     * Выводит в консоль каждый второй элемент массива
     * @param arr массив элементы которого необходимо отобразить
     */
    String everySecondElement(int[] arr);

    /**
     * Метод выводит все элементы массива в консоль в обратном порядке
     * @param arr массив элементы которого необходимо отобразить
     */
    String elementsInReverse(int[] arr);
}
