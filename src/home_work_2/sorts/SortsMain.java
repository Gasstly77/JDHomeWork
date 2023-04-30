package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6};
        System.out.println("Before sort: "+Arrays.toString(arr1));
        SortsUtils.sort(arr1);
        System.out.println("After sort:"+Arrays.toString(arr1));
        arr1 = new int[]{1,2,3,4,5,6};
        System.out.println("Before sort: "+Arrays.toString(arr1));
        SortsUtils.shake(arr1);
        System.out.println("After shake:"+Arrays.toString(arr1));
        System.out.println();

        int[] arr2 =new int[]{1,1,1,1};
        System.out.println("Before sort: "+Arrays.toString(arr2));
        SortsUtils.sort(arr2);
        System.out.println("After sort:"+Arrays.toString(arr2));
        arr2 =new int[]{1,1,1,1};
        System.out.println("Before sort: "+Arrays.toString(arr2));
        SortsUtils.shake(arr2);
        System.out.println("After shake:"+Arrays.toString(arr2));
        System.out.println();

        int[] arr3 =new int[]{9,1,5,99,9,9};
        System.out.println("Before sort: "+Arrays.toString(arr3));
        SortsUtils.sort(arr3);
        System.out.println("After sort:"+Arrays.toString(arr3));
        arr3 =new int[]{9,1,5,99,9,9};
        System.out.println("Before sort: "+Arrays.toString(arr3));
        SortsUtils.shake(arr3);
        System.out.println("After shake:"+Arrays.toString(arr3));
        System.out.println();

        int[] arr4 =new int[]{};
        System.out.println("Before sort: "+Arrays.toString(arr4));
        SortsUtils.sort(arr4);
        System.out.println("After sort:"+Arrays.toString(arr4));
        arr4 =new int[]{};
        System.out.println("Before sort: "+Arrays.toString(arr4));
        SortsUtils.shake(arr4);
        System.out.println("After shake:"+Arrays.toString(arr4));
        System.out.println();

        int[] arr5 =new int[]{6,5,4,3,2,1};
        System.out.println("Before sort: "+Arrays.toString(arr5));
        SortsUtils.sort(arr5);
        System.out.println("After sort:"+Arrays.toString(arr5));
        arr5 =new int[]{6,5,4,3,2,1};
        System.out.println("Before sort: "+Arrays.toString(arr5));
        SortsUtils.shake(arr5);
        System.out.println("After shake:"+Arrays.toString(arr5));
        System.out.println();

        int[] randomArray = ArraysUtils.arrayRandom(50,100);
        System.out.println("Before sort: "+Arrays.toString(randomArray));
        SortsUtils.sort(randomArray);
        System.out.println("After sort:"+Arrays.toString(randomArray));
        int[] copyRandom = ArraysUtils.arrayRandom(50,100);
        System.out.println("Before sort: "+Arrays.toString(copyRandom));
        SortsUtils.shake(copyRandom);
        System.out.println("After shake:"+Arrays.toString(copyRandom));
        System.out.println();

        int[] consoleArray = ArraysUtils.arrayFromConsole();
        System.out.println("Before sort: "+Arrays.toString(consoleArray));
        SortsUtils.sort(consoleArray);
        System.out.println("After sort:"+Arrays.toString(consoleArray));
        int[] copyConsole = ArraysUtils.arrayFromConsole();
        System.out.println("Before sort: "+Arrays.toString(copyConsole));
        SortsUtils.shake(copyConsole);
        System.out.println("After shake:"+Arrays.toString(copyConsole));
    }
}
