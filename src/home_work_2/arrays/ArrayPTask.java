package home_work_2.arrays;

import java.util.Arrays;

public class ArrayPTask {

    public static void main(String[] args) {
        long[] arr = {5,8,15,4,8,6,7,14,9,10};
        System.out.println(arraySum(arr));
        System.out.println(maxElem(arr));
        System.out.println(Arrays.toString(lessElem(arr)));
        System.out.println(Arrays.toString(twoMinElem(arr)));
        System.out.println(Arrays.toString(cutArr(arr)));
        System.out.println(Arrays.toString(cutArr2(arr)));
        System.out.println(sumArray(arr));
    }

    public static long arraySum (long[] arr) {

        long summEvenElem=0;

        for (long el : arr) {
            if (el >= 0 && el % 2 == 0) {
                summEvenElem = summEvenElem+el;
            }
        }
        return summEvenElem;

    }

    public static long maxElem (long[] arr) {
        long maxVal = 0;

        for (int i = 0; i < arr.length; i+=2) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static long[] lessElem (long[] arr) {

        long sumArr = 0;
        long midVal;
        long[] newArr = {};

        for (long sumEl : arr) {
            sumArr = sumArr + sumEl;
        }

        midVal = sumArr / arr.length;

        for  (long newEl : arr ) {
            if (newEl < midVal) {
                newArr = Arrays.copyOf(newArr, newArr.length+1);
                newArr[newArr.length-1] = newEl;
            }
        }
        return newArr;
    }

    public static long[] twoMinElem (long[] arr) {
        long min1 = 0;
        long min2 = 0;

        Arrays.sort(arr);

        min1 = arr[0];
        min2 = arr[1];

        return new long[] {min1,min2};
    }

    public static long[] cutArr (long[] arr) {
        long repPos = arr.length-1;
        long[] interval = {4,7};
        long[] newArr={};

        for (long el : arr) {
            if (el < interval[0] || el > interval[1]) {
               newArr = Arrays.copyOf(newArr,newArr.length+1);
               newArr[newArr.length-1] = el;
            }
        }
        return newArr;
    }

    public static long[] cutArr2 (long[] arr) {

        long[] interval = {4, 7};
        int right = arr.length;
        int haveChange;

        do {
            haveChange = 0;
            for (int i = 0; i < right;i++) {
                if ((arr[i] >= interval[0] && arr[i] <= interval[1]) || arr[i] == 0) {
                    long curElem = arr[right];
                    arr[i] = curElem;
                    arr[right] = 0;
                    haveChange = 1;
                    right--;
                }
            }
        } while (haveChange == 1);
        return arr;
    }

    public static long sumArray (long[] arr) {
        long summ = 0;

        for (long el : arr) {
            if (el > 9) {
                summ = summ + summElem(el);
            } else {
                summ = summ + el;
            }
        }
        return summ;
    }



    public static long summElem (long n) {
        long result = 0;
        long nextVal;

        for (int i = String.valueOf(n).length(); i > 0; i--) {
            nextVal = n % 10;
            result = result + nextVal;
            n = n / 10;
        }
        return result;
    }




}
