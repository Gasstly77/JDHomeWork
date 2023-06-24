package home_work_6.utils;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        Matcher matcher = pattern.matcher(text);
        int wordCount = 0;
        while(matcher.find()) {
            wordCount++;
        }
        return wordCount;
    }
}
