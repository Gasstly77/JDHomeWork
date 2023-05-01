package home_work_2.arrays;

import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;

public class ArrayFromConsole {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();

        System.out.println(Arrays.toString(container));
    }
}
