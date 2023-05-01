package home_work_2.arrays;

import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayRandom;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] container = arrayRandom(5, 100);

        System.out.println(Arrays.toString(container));
    }
}
