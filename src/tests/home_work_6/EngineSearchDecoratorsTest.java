package tests.home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.utils.EasySearch;
import home_work_6.utils.SearchEngineCaseNormalizer;
import home_work_6.utils.SearchEngineLowerCase;
import home_work_6.utils.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EngineSearchDecoratorsTest {
    @Test
    public void testCaseNormalizer (){
        String testText = "Мама мыла раму, Маме было   мамам трудно, маму! надо  беречь, беретиге мам,   мама у нас одна. Мойте раму сами.";
        ISearchEngine searchEngineCaseNormalizer = new SearchEngineCaseNormalizer(new EasySearch());
        long expected = 3;
        long actual = searchEngineCaseNormalizer.search(testText,"мама");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSearchEngineLowerCase (){
        String testText = "Мама мыла раму, маме было трудно, маму надо беречь, беретиге мам, мама у нас одна. Мойте раму сами.";
        ISearchEngine searchEngineLowerCase = new SearchEngineLowerCase(new EasySearch());
        long expected = 2;
        long actual = searchEngineLowerCase.search(testText,"мама");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSearchEnginePunctuationNormalizer (){
        String testText = "Мама мыла раму, Маме было   трудно, маму! надо  беречь, беретиге мам,   мама у нас одна.  Мойте раму сами.";
        ISearchEngine searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer(new EasySearch());
        long expected1 = 0;
        long actual1 = searchEnginePunctuationNormalizer.search(testText,"  ");
        long expected2 = 0;
        long actual2 = searchEnginePunctuationNormalizer.search(testText,",");
        long expected3 = 0;
        long actual3 = searchEnginePunctuationNormalizer.search(testText,"!");
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
    }
}
