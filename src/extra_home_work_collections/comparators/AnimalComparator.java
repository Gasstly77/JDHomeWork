package extra_home_work_collections.comparators;

import extra_home_work_collections.dto.Animal;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare (Animal animal1, Animal animal2) {
        int cmp  = animal1.getAge() - animal2.getAge();
        if (cmp != 0) {
            return cmp;
        }
        return animal1.getNick().compareTo(animal2.getNick());
    }
}
