package home_work_5;

import home_work_5.comparators.ComparatorStringContainer;

import java.util.Arrays;

public class CheckStringContainer {
    public static void main(String[] args) {
        String[] arr = {"Привет",null,"Работаю","Давай потом"};
        DataContainer <String> test = new DataContainer<>(arr);
        ComparatorStringContainer stringComparator = new ComparatorStringContainer();
        System.out.println(Arrays.toString(test.getItems()));
        System.out.println(test.toString());
        int index1 = test.add("Привет");
        int index2 = test.add("Как дела");
        int index3 = test.add("Работаю");
        int index4 = test.add("Давай потом");
        int index5 = test.add("8");
        test.get(9);
        test.delete(2);
        test.get(2);
        System.out.println(Arrays.toString(test.getItems()));
        test.delete("Работаю");
        System.out.println(Arrays.toString(test.getItems()));
        test.sort(stringComparator);
        System.out.println(Arrays.toString(test.getItems()));
    }
}
