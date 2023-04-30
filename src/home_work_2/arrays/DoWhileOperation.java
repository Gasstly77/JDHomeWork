package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {
    @Override
    public void allArray(int[] arr) {
        int d = 0;

        do {
            int secondElem = arr[d];
            System.out.print(secondElem + " ");
            d++;
        } while (d < arr.length);
    }

    @Override
    public void everySecondElement(int[] arr) {
        int d = 0;

        do {
            int secondElem = arr[d];
            System.out.print(secondElem + " ");
            d+=2;
        } while (d < arr.length);
    }

    @Override
    public void elementsInReverse(int[] arr) {
        int d = arr.length-1;

        do {
            int secondElem = arr[d];
            System.out.print(secondElem + " ");
            d--;
        } while (d >= 0);
    }
}
