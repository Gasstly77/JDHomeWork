package home_work_2.arrays;

public class ForOperation implements IArraysOperation{
    @Override
    public void allArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            System.out.print(elem + " ");
        }
    }

    @Override
    public void everySecondElement(int[] arr) {
        for (int i = 0; i < arr.length; i+=2) {
            int secondElem = arr[i];
            System.out.print(secondElem + " ");
        }
    }

    @Override
    public void elementsInReverse(int[] arr) {
        for (int i = arr.length-1; i >= 0; i--) {
            int reverseElem = arr[i];
            System.out.print(reverseElem + " ");
        }
    }
}
