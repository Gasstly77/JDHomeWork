package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class CheckInterface {
    public static void main(String[] args) {
        int[] arr = ArraysUtils.arrayRandom(10,50);

        IArraysOperation forEachSort = new ForEachOperation();
        forEachSort.allArray(arr);
        System.out.println();
        forEachSort.everySecondElement(arr);
        System.out.println();
        forEachSort.elementsInReverse(arr);

        System.out.println();
        System.out.println();

        IArraysOperation whileSort = new WhileOperation();
        whileSort.allArray(arr);
        System.out.println();
        whileSort.everySecondElement(arr);
        System.out.println();
        whileSort.elementsInReverse(arr);

        System.out.println();
        System.out.println();

        IArraysOperation doWhileSort = new DoWhileOperation();
        doWhileSort.allArray(arr);
        System.out.println();
        doWhileSort.everySecondElement(arr);
        System.out.println();
        doWhileSort.elementsInReverse(arr);

        System.out.println();
        System.out.println();

        IArraysOperation forSort = new ForOperation();
        forSort.allArray(arr);
        System.out.println();
        forSort.everySecondElement(arr);
        System.out.println();
        forSort.elementsInReverse(arr);
    }
}
