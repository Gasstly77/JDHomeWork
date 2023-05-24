package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class CheckInterface {
    public static void main(String[] args) {
        int[] arr = ArraysUtils.arrayRandom(10,50);

        IArraysOperation forEachSort = new ForEachOperation();
        String test1 = forEachSort.allArray(arr);
        System.out.println(test1);
        String test2 = forEachSort.everySecondElement(arr);
        System.out.println(test2);
        String test3 = forEachSort.elementsInReverse(arr);
        System.out.println(test3);

        System.out.println();

        IArraysOperation whileSort = new WhileOperation();
        String test4 = whileSort.allArray(arr);
        System.out.println(test4);
        String test5 = whileSort.everySecondElement(arr);
        System.out.println(test5);
        String test6 = whileSort.elementsInReverse(arr);
        System.out.println(test6);

        System.out.println();

        IArraysOperation doWhileSort = new DoWhileOperation();
        String test7 = doWhileSort.allArray(arr);
        System.out.println(test7);
        String test8 = doWhileSort.everySecondElement(arr);
        System.out.println(test8);
        String test9 = doWhileSort.elementsInReverse(arr);
        System.out.println(test9);

        System.out.println();

        IArraysOperation forSort = new ForOperation();
        String test10 = forSort.allArray(arr);
        System.out.println(test10);
        String test11 = forSort.everySecondElement(arr);
        System.out.println(test11);
        String test12 = forSort.elementsInReverse(arr);
        System.out.println(test12);
    }
}
