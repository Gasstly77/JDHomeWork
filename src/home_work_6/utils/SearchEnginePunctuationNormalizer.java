package home_work_6.utils;

import home_work_6.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;
    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        String newText = text.replaceAll("[^a-zA-Z0-9aа-яА-Я-]+", "").replace("-{2,}","");
        return searchEngine.search(newText,word);
    }
}
