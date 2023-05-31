package tests.home_work_5;

import home_work_5.DataContainer;
import home_work_5.comparators.ComparatorIntegerContainer;
import home_work_5.comparators.ComparatorStringContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataContainerTest {
    @Test
    public void CheckStringAdd (){
        String [] arr = {"Тест"};
        DataContainer<String> container = new DataContainer<>(arr);
        container.add("Привет");
        container.add("Как дела");
        container.add("Работал");
        container.add("Давай потом");
        String actual = container.toString();
        String expected = "[Тест, Привет, Как дела, Работал, Давай потом]";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckIntegerAdd (){
        Integer [] arr = {1};
        DataContainer<Integer> container = new DataContainer<>(arr);
        container.add(2);
        container.add(15);
        container.add(26);
        container.add(11);
        String actual = container.toString();
        String expected = "[1, 2, 15, 26, 11]";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckIndex (){
        String [] arr = {"Тест"};
        DataContainer<String> container = new DataContainer<>(arr);
        int actual = container.add("Привет");
        int expected = 1 ;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckEmptyIndex (){
        String [] arr = {};
        DataContainer<String> container = new DataContainer<>(arr);
        int actual = container.add("Привет");
        int expected = 0 ;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckGetByIndex (){
        String [] arr = {};
        DataContainer<String> container = new DataContainer<>(arr);
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        String actual1 = container.get(index1);
        String actual2 = container.get(index2);
        String actual3 = container.get(index3);
        String actual4 = container.get(index4);
        String expected1 = "Привет" ;
        String expected2 = "Как дела" ;
        String expected3 = "Работаю" ;
        String expected4 = "Давай потом" ;
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
        Assertions.assertEquals(expected4,actual4);
    }

    @Test
    public void CheckGetArray (){
        Integer [] arr = {1};
        DataContainer<Integer> container = new DataContainer<>(arr);
        container.add(2);
        container.add(15);
        container.add(26);
        container.add(11);
        Integer [] actual = container.getItems();
        Integer [] expected = {1, 2, 15, 26, 11};
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void DeleteByElem (){
        Integer [] arr = {1};
        DataContainer<Integer> container = new DataContainer<>(arr);
        container.add(2);
        container.add(15);
        container.add(26);
        container.add(11);
        container.delete((Integer) 15);
        Integer [] actual = container.getItems();
        Integer [] expected = {1, 2, 26, 11};
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void DeleteByIndexFalse (){
        Integer [] arr = {1};
        DataContainer<Integer> container = new DataContainer<>(arr);
        container.add(2);
        container.add(15);
        container.add(26);
        container.add(11);
        boolean actual = container.delete( 15);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckDeleteNull (){
        String [] arr = {"Тест"};
        DataContainer<String> container = new DataContainer<>(arr);
        container.add("Привет");
        container.add("Как дела");
        container.add("Работал");
        container.add("Давай потом");
        Boolean actual = container.delete(null);
        Boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckSort (){
        String [] arr = {"Тест"};
        DataContainer<String> container = new DataContainer<>(arr);
        ComparatorStringContainer stringCompare = new ComparatorStringContainer();
        container.add("Привет");
        container.add("Как дела");
        container.add("Работал");
        container.add("Давай потом");

        container.sort(stringCompare);
        String actual = container.toString();
        String expected = "[Тест, Привет, Работал, Как дела, Давай потом]";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckExtraSort (){
        Integer [] arr = {1};
        DataContainer<Integer> container = new DataContainer<>(arr);
        ComparatorIntegerContainer intCompare = new ComparatorIntegerContainer();
        container.add(2);
        container.add(15);
        container.add(26);
        container.add(11);
        container.sort(container,intCompare);
        String actual = container.toString();
        String expected = "[1, 2, 11, 15, 26]";
        Assertions.assertEquals(expected,actual);
    }
}
