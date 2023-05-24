package home_work_2.arrays;

public class ForOperation implements IArraysOperation{

    @Override
    public String allArray(int[] arr) {
        String allElem = "";
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            if (i == arr.length-1) {
                allElem =allElem + elem;
            } else {
                allElem =allElem + elem + ", ";
            }
        }
        return allElem;
    }

    @Override
    public String everySecondElement(int[] arr) {
        String everySecond = "";
        for (int i = 0; i < arr.length; i+=2) {
            int secondElem = arr[i];
            if (i == arr.length-1) {
                everySecond = everySecond + secondElem;
            } else {
                everySecond = everySecond + secondElem + ", ";
            }
        }
        return everySecond;
    }

    @Override
    public String elementsInReverse(int[] arr) {
        String reverse = "";
        for (int i = arr.length-1; i >= 0; i--) {
            int reverseElem = arr[i];
            if (i == 0) {
                reverse = reverse + reverseElem;
            } else {
                reverse = reverse + reverseElem + ", ";
            }
        }
        return reverse;
    }
}
