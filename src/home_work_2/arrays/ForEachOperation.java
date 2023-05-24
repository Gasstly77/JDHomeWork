package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation{

    @Override
    public String allArray(int[] arr) {
        String allElem = "";
        int d = 0;
        for (int f : arr) {
            int secondElem = f;
            if (d == arr.length-1) {
                allElem =allElem + secondElem;
            } else {
                allElem =allElem + secondElem + ", ";
            }
            ++d;
        }
        return allElem;
    }

    @Override
    public String everySecondElement(int[] arr) {
        int s = 0; // если s==0, эелемент массива включается в выборку, если s==1 элемент пропускается
        String everySecond = "";
        int d = 0;
        for (int f : arr) {
            int secondElem = f;
            if (s == 0) {
                if (d == arr.length-1) {
                    everySecond = everySecond + secondElem;
                } else {
                    everySecond = everySecond + secondElem + ", ";
                }
                s=1;
            } else if (s==1) {
                s=0;
            }
            ++d;
        }
        return everySecond;
    }

    @Override
    public String elementsInReverse(int[] arr) {
        int nPos = (arr.length-1);
        int[] revArr = new int[arr.length];
        String reverse = "";
        int d = 0;

        for (int nf : arr) {
            revArr[nPos--] = nf;
        }
        for (int f : revArr) {
            int secondElem = f;
            if (d == arr.length-1) {
                reverse = reverse + secondElem;
            } else {
                reverse = reverse + secondElem + ", ";
            }
            ++d;
        }
        return reverse;
    }
}
