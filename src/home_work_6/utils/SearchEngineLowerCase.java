package home_work_6.utils;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEngineLowerCase implements ISearchEngine {
    private ISearchEngine searchEngine;
    public SearchEngineLowerCase(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }
    @Override
    public long search(String text, String word) {
        long wordCount = 0;
        if (this.searchEngine instanceof RegExSearch) {
            Pattern pattern = Pattern.compile("(?u)\\b" + word + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()) {
                wordCount++;
            }
        }
        if (this.searchEngine instanceof EasySearch) {
            String lowText = text.toLowerCase();
            String lowWord = word.toLowerCase();
            wordCount = searchEngine.search(lowText, lowWord);
        }
        return wordCount;
    }
}
