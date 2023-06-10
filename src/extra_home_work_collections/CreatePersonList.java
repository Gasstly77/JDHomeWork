package extra_home_work_collections;

import extra_home_work_collections.comparators.PersonComparator;
import extra_home_work_collections.dto.Person;

import java.util.*;

public class CreatePersonList {
    public static void main(String[] args) throws Exception {

        List<Person> persons1 = new ArrayList<>();
        List<Person> persons2 = new LinkedList<>();
        HashSet<Person> persons3 = new HashSet<>();
        TreeSet<Person> persons4 = new TreeSet<>();


        long time1 = createPerson(persons1, 100_000);
        long time2 = createPerson(persons2, 100_000);
        long time3 = createPerson(persons3, 100_000);
        long time4 = createPerson(persons4, 100_000);

        System.out.println("Операция: Наполнение. Заняла " + time1 + " мс");
        System.out.println("Операция: Наполнение. Заняла " + time2 + " мс");
        System.out.println("Операция: Наполнение. Заняла " + time3 + " мс");
        System.out.println("Операция: Наполнение. Заняла " + time4 + " мс");

        Collections.sort(persons1);
        Collections.sort(persons2);

        PersonComparator cmp = new PersonComparator();

        sort(persons1, cmp);
        sort(persons2, cmp);


        long time5 = iterationForI(persons1);
        long time6 = iterationForI(persons2);

        System.out.println("Операция: Итерирование через fori. Заняла " + time5 + " мс");
        System.out.println("Операция: Итерирование через fori. Заняла " + time6 + " мс");

        long time7 = iterationIterator(persons1);
        long time8 = iterationIterator(persons2);

        System.out.println("Операция: Итерирование через итератор. Заняла " + time7 + " мс");
        System.out.println("Операция: Итерирование через итератор. Заняла " + time8 + " мс");

        long time9 = removeElements(persons1);
        long time10 = removeElements(persons2);

        System.out.println("Операция: Удаления элементов. Заняла " + time9 + " мс");
        System.out.println("Операция: Удаления элементов. Заняла " + time10 + " мс");
    }

    private static long createPerson (Collection<Person> persons, int count) throws Exception {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            persons.add(new Person());
        }
        long stop = System.currentTimeMillis();

        return stop - start;
    }

    public static void sort (List <Person> persons, Comparator <Person> comparator ) {
        boolean haveChanges;
        do {
            haveChanges = false;
            for (int i = 0; i < persons.size()-1; i++) {
                if (comparator.compare(persons.get(i),persons.get(i + 1)) > 0) {
                    Collections.swap(persons, i, i + 1);
                    haveChanges = true;
                }
            }
        } while (haveChanges);
    }

    private static long iterationForI(List<Person> persons){
        long start = System.currentTimeMillis();
        int size = persons.size();

        for (int i = 0; i < size; i++) {
            persons.get(i);
        }

        long stop = System.currentTimeMillis();

        return stop - start;
    }

    private static long iterationIterator(List<Person> persons) {
        long start = System.currentTimeMillis();

        Iterator<Person> itr = persons.iterator();

        while (itr.hasNext()) {
            itr.next();
        }

        long stop = System.currentTimeMillis();

        return stop - start;
    }

    private static long removeElements (List<Person> persons) {
        long start = System.currentTimeMillis();
        int size = persons.size();

        for (int i = size-1; i >=0; i--) {
            persons.remove(i);
        }

        long stop = System.currentTimeMillis();

        return stop - start;
    }
}
