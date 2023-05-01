package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation{

    @Override
    public void allArray(int[] arr) {
        for (int f : arr) {
            int secondElem = f;
            System.out.print(secondElem + " ");
        }
    }

    @Override
    public void everySecondElement(int[] arr) {
        int s = 0; // если s==0, эелемент массива включается в выборку, если s==1 элемент пропускается

        for (int f : arr) {
            int secondElem = f;
            if (s == 0) {
                System.out.print(secondElem + " ");
                s=1;
            } else if (s==1) {
                s=0;
            }
        }
    }

    @Override
    public void elementsInReverse(int[] arr) {
        int nPos = (arr.length-1);
        int[] revArr = new int[arr.length];

        for (int nf : arr) {
            revArr[nPos--] = nf;
        }
        for (int f : revArr) {
            int secondElem = f;
            System.out.print(secondElem + " ");
        }
    }
}
