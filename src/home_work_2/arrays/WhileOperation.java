package home_work_2.arrays;

public class WhileOperation implements IArraysOperation{

    @Override
    public String allArray(int[] arr) {
        int w = 0;
        String allElem = "";
        while (w < arr.length) {
            int secondElem = arr[w];
            if (w == arr.length-1) {
                allElem =allElem + secondElem;
            } else {
                allElem =allElem + secondElem + ", ";
            }
            w++;
        }
        return allElem;
    }

    @Override
    public String everySecondElement(int[] arr) {
        int w = 0;
        String everySecond = "";
        while (w < arr.length) {
            int secondElem = arr[w];
            if (w == arr.length-1) {
                everySecond = everySecond + secondElem;
            } else {
                everySecond = everySecond + secondElem + ", ";
            }
            w+=2;
        }
        return everySecond;
    }

    @Override
    public String elementsInReverse(int[] arr) {
        int w = arr.length-1;
        String reverse = "";

        while (w >= 0 ) {
            int secondElem = arr[w];
            if (w == 0) {
                reverse = reverse + secondElem;
            } else {
                reverse = reverse + secondElem + ", ";
            }
            w--;
        }
        return reverse;
    }
}
