package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {

    public String allArray(int[] arr) {
        int d = 0;
        String allElem = "";
        do {
            int secondElem = arr[d];
            if (d == arr.length-1) {
                allElem = allElem + secondElem;
            } else {
                allElem = allElem + secondElem + ", ";
            }
            d++;
        } while (d < arr.length);
        return allElem;
    }

    @Override
    public String everySecondElement(int[] arr) {
        int d = 0;
        String everySecond = "";
        do {
            int secondElem = arr[d];
            if (d == arr.length-1) {
                everySecond = everySecond + secondElem;
            } else {
                everySecond = everySecond + secondElem + ", ";
            }
            d+=2;
        } while (d < arr.length);
        return everySecond;
    }

    @Override
    public String elementsInReverse(int[] arr) {
        int d = arr.length-1;
        String reverse = "";
        do {
            int secondElem = arr[d];
            if (d == 0) {
                reverse = reverse + secondElem;
            } else {
                reverse = reverse + secondElem + ", ";
            }
            d--;
        } while (d >= 0);
        return reverse;
    }
}
