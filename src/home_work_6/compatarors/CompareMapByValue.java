package home_work_6.compatarors;

import java.util.Comparator;
import java.util.Map;

public class CompareMapByValue implements Comparator<Map.Entry<String, Integer>> {
    /**
     * Компаратор который сравнивает количество использований слова в тексте.
     * @param a the first object to be compared.
     * @param b the second object to be compared.
     * @return возвращает результат сравнени количества использований слова.
     */
    @Override
    public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
        return b.getValue() - a.getValue();
    }
}
