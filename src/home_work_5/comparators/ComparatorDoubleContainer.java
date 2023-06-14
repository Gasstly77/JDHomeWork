package home_work_5.comparators;

import java.util.Comparator;

public class ComparatorDoubleContainer implements Comparator<Double> {
    @Override
    public int compare(Double o1, Double o2) {
        return (int) (o1-o2);
    }
}
