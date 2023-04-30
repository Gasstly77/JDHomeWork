package home_work_2.arrays;

public class WhileOperation implements IArraysOperation{

    @Override
    public void allArray(int[] arr) {
        int w = 0;

        while (w < arr.length) {
            int secondElem = arr[w];
            System.out.print(secondElem + " ");
            w++;
        }
    }

    @Override
    public void everySecondElement(int[] arr) {
        int w = 0;

        while (w < arr.length) {
            int secondElem = arr[w];
            System.out.print(secondElem + " ");
            w+=2;
        }
    }

    @Override
    public void elementsInReverse(int[] arr) {
        int w = arr.length-1;

        while (w >= 0 ) {
            int secondElem = arr[w];
            System.out.print(secondElem + " ");
            w--;
        }
    }
}
