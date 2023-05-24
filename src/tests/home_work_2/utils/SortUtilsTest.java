package tests.home_work_2.utils;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortUtilsTest {
    @Test
    public void checkArray(){
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = {6, 5, 4, 3, 2, 1};
        SortsUtils.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkNormalArray(){
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = {1, 2, 3, 4, 5, 6};
        SortsUtils.shake(actual);
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void checkSimilar(){
        int[] expected = {1, 1, 1, 1};
        int[] actual = {1, 1, 1, 1};
        SortsUtils.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void checkDifferentVal(){
        int[] expected = {1, 5, 9, 9, 9, 99};
        int[] actual = {9, 1, 5, 99, 9, 9};
        SortsUtils.shake(actual);
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void checkVoidArray(){
        int[] expected = {};
        int[] actual =  {};
        SortsUtils.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkNegativeVal(){
        int[] actual = {-598, -25, 9, 11, 27, 349};
        int[] expected = {-598, -25, 9, 11, 27, 349};
        SortsUtils.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkNegativeValShake(){
        int[] actual = {-598, -25, 9, 11, 27, 349};
        int[] expected = {-598, -25, 9, 11, 27, 349};
        SortsUtils.shake(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkSomeSimilar(){
        int[] actual = {13, 11, 9, 11, 13, 9};
        int[] expected = {9, 9, 11, 11, 13, 13};
        SortsUtils.shake(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkShort(){
        int[] actual = {9,4};
        int[] expected = {4,9};
        SortsUtils.shake(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkLongArr(){
        int[] actual = {12,15,89,63,57,156,89,55,1,45,69,32,47,55,9,953,-6,-56,0};
        int[] expected = {-56,-6,0,1,9,12,15,32,45,47,55,55,57,63,69,89,89,156,953};
        SortsUtils.shake(actual);
        Assertions.assertArrayEquals(expected, actual);
    }
}
