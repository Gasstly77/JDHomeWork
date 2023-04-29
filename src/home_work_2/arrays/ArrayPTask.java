package home_work_2.arrays;

import java.util.Arrays;

public class ArrayPTask {

    public static void main(String[] args) {
        long[] arr = {5,7,15,4,5,6,7,8,9,10};
        System.out.println(arraySum(arr));
        System.out.println(maxElem(arr));
        System.out.println(Arrays.toString(twoMinElem(arr)));
        System.out.println(Arrays.toString(lessElem(arr)));
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
        long[] interval = {4,9};
        long[] newArr={};

        for (long el : arr) {
            if (el >= interval[0] && el <= interval[1]) {

            }
        }
        return newArr;
    }




}
