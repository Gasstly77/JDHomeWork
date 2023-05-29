package home_work_5;

import home_work_5.comparators.ComparatorIntegerContainer;

import java.util.Arrays;

public class CheckIntegerContainer {
    public static void main(String[] args) {
        ComparatorIntegerContainer integerComparator = new ComparatorIntegerContainer();
        Integer[] arr = {1,null,3,6};
        DataContainer <Integer> test = new DataContainer<>(arr);
        System.out.println(Arrays.toString(test.getItems()));
        System.out.println(test.toString());
        int index1 = test.add(121);
        int index2 = test.add(74);
        int index3 = test.add(53);
        int index4 = test.add(15);
        int index5 = test.add(32);
        test.get(9);
        System.out.println(Arrays.toString(test.getItems()));
        test.delete(2);
        System.out.println(Arrays.toString(test.getItems()));
        test.get(2);
        System.out.println(Arrays.toString(test.getItems()));
        test.delete((Integer) 32);
        System.out.println(Arrays.toString(test.getItems()));
        test.sort(integerComparator);
        System.out.println(Arrays.toString(test.getItems()));
    }
}
