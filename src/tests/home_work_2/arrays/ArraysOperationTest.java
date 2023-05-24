package tests.home_work_2.arrays;

import home_work_2.arrays.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysOperationTest {
    @Test
    public void checkDoWhileElemSort() {
        IArraysOperation sort = new DoWhileOperation();
        int [] array = {6,5,4,1,2,3,9,8,7};
        String expected = "6, 5, 4, 1, 2, 3, 9, 8, 7";
        String actual = sort.allArray(array);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkDoWhileSecondElem() {
        IArraysOperation sort = new DoWhileOperation();
        int [] array = {6,5,4,1,2,3,9,8,7};
        String expected = "6, 4, 2, 9, 7";
        String actual = sort.everySecondElement(array);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkDoWhileReverse() {
        IArraysOperation sort = new DoWhileOperation();
        int [] array = {6,5,4,1,2,3,9,8,7};
        String expected = "7, 8, 9, 3, 2, 1, 4, 5, 6";
        String actual = sort.elementsInReverse(array);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkForElemSort() {
        IArraysOperation sort = new ForOperation();
        int [] array = {6,5,4,1,2,3,9,8,7};
        String expected = "6, 5, 4, 1, 2, 3, 9, 8, 7";
        String actual = sort.allArray(array);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkForSecondElem() {
        IArraysOperation sort = new ForOperation();
        int [] array = {6,5,4,1,2,3,9,8,7};
        String expected = "6, 4, 2, 9, 7";
        String actual = sort.everySecondElement(array);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkForReverse() {
        IArraysOperation sort = new ForOperation();
        int [] array = {6,5,4,1,2,3,9,8,7};
        String expected = "7, 8, 9, 3, 2, 1, 4, 5, 6";
        String actual = sort.elementsInReverse(array);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkWhileAllElemSort() {
        IArraysOperation sort = new WhileOperation();
        int [] array = {6,5,4,1,2,3,9,8,7};
        String expected = "6, 5, 4, 1, 2, 3, 9, 8, 7";
        String actual = sort.allArray(array);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkWhileSecondElem() {
        IArraysOperation sort = new WhileOperation();
        int [] array = {6,5,4,1,2,3,9,8,7};
        String expected = "6, 4, 2, 9, 7";
        String actual = sort.everySecondElement(array);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkWhileReverse() {
        IArraysOperation sort = new WhileOperation();
        int [] array = {6,5,4,1,2,3,9,8,7};
        String expected = "7, 8, 9, 3, 2, 1, 4, 5, 6";
        String actual = sort.elementsInReverse(array);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkForEachElemSort() {
        IArraysOperation sort = new ForEachOperation();
        int [] array = {6,5,4,1,2,3,9,8,7};
        String expected = "6, 5, 4, 1, 2, 3, 9, 8, 7";
        String actual = sort.allArray(array);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkForEachSecondElem() {
        IArraysOperation sort = new ForEachOperation();
        int [] array = {6,5,4,1,2,3,9,8,7};
        String expected = "6, 4, 2, 9, 7";
        String actual = sort.everySecondElement(array);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkForEachReverse() {
        IArraysOperation sort = new ForEachOperation();
        int [] array = {6,5,4,1,2,3,9,8,7};
        String expected = "7, 8, 9, 3, 2, 1, 4, 5, 6";
        String actual = sort.elementsInReverse(array);
        Assertions.assertEquals(expected,actual);
    }
}
