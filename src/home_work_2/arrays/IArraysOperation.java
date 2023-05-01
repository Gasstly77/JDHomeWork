package home_work_2.arrays;

public interface IArraysOperation {

    /**
     * Выводит в консоль все элементы массива
     * @param arr массив элементы которого необходимо отобразить
     */
    void allArray(int[] arr);

    /**
     * Выводит в консоль каждый второй элемент массива
     * @param arr массив элементы которого необходимо отобразить
     */
    void everySecondElement(int[] arr);

    /**
     * Метод выводит все элементы массива в консоль в обратном порядке
     * @param arr массив элементы которого необходимо отобразить
     */
    void elementsInReverse(int[] arr);
}
