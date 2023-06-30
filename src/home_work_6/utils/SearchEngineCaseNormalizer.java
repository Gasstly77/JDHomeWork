package home_work_6.utils;

import home_work_6.api.ISearchEngine;

import java.util.List;

public class SearchEngineCaseNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;
    private final static List<String> WORDENDING_SET = List.of("а", "е", "и", "о", "ы", "я", "ов", "ев", "ей", "у", "ю", "ам", "ям", "ой", "ою", "ею", "ом", "ем", "ами", "ями", "ах", "ях");
    private final static List<String> VOWELS = List.of("а", "е", "ё", "и", "о", "у", "ы", "э", "ю", "я");

    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Метод для поиска слова без учета падежа.
     *
     * @param text текст в котором необходимо произвести поиск слова.
     * @param word слово которое необходимо найти в заданном тексте.
     * @return Возвращает количество повторений переданного слова без учета падежа.
     */
    @Override
    public long search(String text, String word) {
        String rootWord;
        long count = 0;

        if (needCut(word)) {
            rootWord = cuttingVowelsInEnd(word);
        } else {
            rootWord = word;
        }

        for (int i = 0; i < WORDENDING_SET.size(); i++) {
            StringBuilder wordWithNewEnding = new StringBuilder(rootWord);
            wordWithNewEnding.append(WORDENDING_SET.get(i));
            count += searchEngine.search(text, wordWithNewEnding.toString());
        }
        return count;
    }

    /**
     * Метод для проверки заканчивается ли слово на гласную.
     *
     * @param word слово, которое проверяем на окончание.
     * @return возвращает boolean переменную которая говорит о том, заканчивается слово на гласную или нет.
     */
    private boolean needCut(String word) {
        for (String vowel : VOWELS) {
            if (word.endsWith(vowel)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод для удаления окончания слова для дальнейшего поиска.
     *
     * @param word слово которое необходимо обработать.
     * @return слово с вырезанным окончанием.
     */
    private String cuttingVowelsInEnd (String word) {
        String cutWord = null;
        for (String ending : WORDENDING_SET) {
            if (word.endsWith(ending)) {
                int endingIndex = word.lastIndexOf(ending);
                cutWord = word.substring(0, endingIndex);
                break;
            }
        }
        return cutWord;
    }
}
