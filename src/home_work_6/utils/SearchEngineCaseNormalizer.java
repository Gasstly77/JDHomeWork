package home_work_6.utils;

import home_work_6.api.ISearchEngine;

public class SearchEngineCaseNormalizer implements ISearchEngine {

    private ISearchEngine searchEngine;
    private String castCase;
    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
        this.castCase = "именительный";
    }

    @Override
    public long search(String text, String word) {
        String newWord = word.substring(0, word.length() - 1);
        return searchEngine.search(text,newWord);
    }
}
