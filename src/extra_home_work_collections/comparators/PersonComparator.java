package extra_home_work_collections.comparators;

import extra_home_work_collections.dto.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare (Person person1, Person person2) {
        int cmp  = person1.getPassword().length() - person1.getPassword().length();
        if (cmp != 0) {
            return cmp;
        }
        return person1.getNick().compareTo(person2.getNick());
    }
}
