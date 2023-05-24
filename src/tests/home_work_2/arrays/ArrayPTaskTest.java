package tests.home_work_2.arrays;

import home_work_2.arrays.ArrayPTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static home_work_2.arrays.ArrayPTask.twoMinElem;

public class ArrayPTaskTest {
    @Test
    public void checkEvenSumm () {
        int[] arr = {5,12,4,7,5,3,8,9,23,8};
        long actual = ArrayPTask.arraySum(arr);
        long expected = 32;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkEvenSummNegative () {
        int[] arr = {5,-12,4,7,5,3,-8,9,23,8};
        long actual = ArrayPTask.arraySum(arr);
        long expected = 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMaxElemEvenIndex () {
        int[] arr = {5,12,4,7,5,3,8,9,23,8};
        long actual = ArrayPTask.maxElem(arr);
        long expected = 23;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMaxElemEvenIndexDif () {
        int[] arr = {5,50,-44,7,5,3,28,9,23,8};
        long actual = ArrayPTask.maxElem(arr);
        long expected = 28;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkNewArrLessMid () {
        int[] arr = {5,12,4,7,5,3,8,9,23,8};
        int[] actual = ArrayPTask.lessElem(arr);
        int[] expected = {5,4,7,5,3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkNewArrLessMidNegative () {
        int[] arr = {5,12,4,7,5,-3,8,9,23,8};
        int[] actual = ArrayPTask.lessElem(arr);
        int[] expected = {5,4,5,-3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkNewArrOutInterval () {
        int [] interval = {4,5,6,7}; // значения которые не будут включены
        int[] arr = {5,12,4,7,5,3,8,9,23,8};
        int[] actual = ArrayPTask.cutArr(arr);
        int[] expected = {12,3,8,9,23,8};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void checkNewDigitSumm () {
        int[] arr = {5,12,4,7,5,3,8,9,23,8};
        int actual = ArrayPTask.sumArray(arr);
        int expected = 57;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkTwoMinElem () {
        int[] arr = {5,12,4,7,5,3,8,9,23,8};
        ArrayPTask.StorageTwoMin twoMin = twoMinElem(arr);
        int [] expected = {3,4};
        int [] actual = {twoMin.min1, twoMin.min2};
        Assertions.assertArrayEquals(expected, actual);
    }
}
