package tests.home_work_6;

import home_work_6.api.ISearchEngine;
import home_work_6.utils.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EngineSearchTest {
    @Test
    public void easySearchEngineSimpleWord (){
        String testText = "Мама мыла раму, маме было трудно, маму надо беречь, беретиге мам, мама у нас одна. Мойте раму сами.";
        ISearchEngine easySearch = new EasySearch();
        long expected = 1;
        long actual = easySearch.search(testText,"мама");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void easySearchEngineBigLatter (){
        String testText = "Мама мыла раму, маме было трудно, маму надо беречь, беретиге мам, мама у нас одна. Мойте раму сами.";
        ISearchEngine easySearch = new EasySearch();
        long expected = 1;
        long actual = easySearch.search(testText,"Мама");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void easySearchEngineDifEnding (){
        String testText = "Мама мыла раму, маме было трудно, маму надо беречь, беретиге мам, мама у нас одна. Мойте раму сами.";
        ISearchEngine easySearch = new EasySearch();
        long expected = 1;
        long actual = easySearch.search(testText,"маму");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void easySearchEnginePartWord (){
        String testText = "Мама мыла раму, маме было трудно, маму надо беречь, беретиге мам, мама у нас одна. Мойте раму сами.";
        ISearchEngine easySearch = new EasySearch();
        long expected = 1;
        long actual = easySearch.search(testText,"мам");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void easySearchEngineSeveralResults (){
        String testText = "Мама мыла раму, маме было трудно, маму надо беречь, беретиге мам, мама у нас одна. Мойте раму сами.";
        ISearchEngine easySearch = new EasySearch();
        long actual = easySearch.search(testText,"раму");
        long expected = 2;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void easySearchEngineLetter (){
        String testText = "Мама мыла раму, маме было трудно, маму надо беречь, беретиге мам, а мама у нас одна. Мойте раму сами.";
        ISearchEngine easySearch = new EasySearch();
        long actual = easySearch.search(testText,"а");
        long expected = 1;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void easySearchEngineLastWord (){
        String testText = "Мама мыла раму, маме было трудно, маму надо беречь, беретиге мам, мама у нас одна. Мойте раму сами";
        ISearchEngine easySearch = new EasySearch();
        long actual = easySearch.search(testText,"сами");
        long expected = 1;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void easySearchEngineNull (){
        String testText = "Мама мыла раму, маме было трудно, маму надо беречь, беретиге мам, мама у нас одна. Мойте раму сами.";
        ISearchEngine easySearch = new EasySearch();
        long actual = easySearch.search(testText,"маман");
        long expected = 0;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void easySearchEngineEmpty (){
        String testText = "Мама мыла раму, маме было трудно, маму надо беречь, беретиге мам, мама у нас одна. Мойте раму сами.";
        ISearchEngine easySearch = new EasySearch();
        long actual = easySearch.search(testText,"");
        long expected = 0;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void easySearchEngineHello (){
        String testText = "привет, как дела!";
        ISearchEngine easySearch = new EasySearch();
        long actual1 = easySearch.search(testText,"привет");
        long expected1 = 1;
        long actual2 = easySearch.search(testText,"как");
        long expected2 = 1;
        long actual3 = easySearch.search(testText,"дела");
        long expected3 = 1;
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
    }

    @Test
    public void easySearchEngineStrangeWord (){
        String testText = "привет;какдела!";
        ISearchEngine easySearch = new EasySearch();
        long actual1 = easySearch.search(testText,"привет");
        long expected1 = 1;
        long actual2 = easySearch.search(testText,"как");
        long expected2 = 0;
        long actual3 = easySearch.search(testText,"какдела");
        long expected3 = 1;
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
    }

    @Test
    public void easySearchEngineHyphen (){
        String testText = "Привет-привет";
        ISearchEngine easySearch = new EasySearch();
        long actual1 = easySearch.search(testText,"привет");
        long expected1 = 0;
        long actual2 = easySearch.search(testText,"Привет-привет");
        long expected2 = 1;
        long actual3 = easySearch.search(testText,"привет-привет");
        long expected3 = 0;
        long actual4 = easySearch.search(testText,"Привет");
        long expected4 = 0;
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
        Assertions.assertEquals(expected4,actual4);
    }

    @Test
    public void easySearchEngineFakeHyphen (){
        String testText = "Привет -привет";
        ISearchEngine easySearch = new EasySearch();
        long actual1 = easySearch.search(testText,"привет");
        long expected1 = 1;
        long actual2 = easySearch.search(testText,"Привет-привет");
        long expected2 = 0;
        long actual3 = easySearch.search(testText,"Привет");
        long expected3 = 1;
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
    }

    @Test
    public void easySearchEngineStartHyphen (){
        String testText = "-привет как-дела";
        ISearchEngine easySearch = new EasySearch();
        long actual1 = easySearch.search(testText,"привет");
        long expected1 = 1;
        long actual2 = easySearch.search(testText,"как");
        long expected2 = 0;
        long actual3 = easySearch.search(testText,"как-дела");
        long expected3 = 1;
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
    }

    @Test
    public void easySearchEngineEndHyphen (){
        String testText = "в книге слово встречается-";
        ISearchEngine easySearch = new EasySearch();
        long actual1 = easySearch.search(testText,"встречается");
        long expected1 = 1;
        long actual2 = easySearch.search(testText,"в-книге");
        long expected2 = 0;
        long actual3 = easySearch.search(testText,"слово");
        long expected3 = 1;
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
    }

    @Test
    public void easySearchEngineNumHyphen (){
        String testText = "4-х";
        ISearchEngine easySearch = new EasySearch();
        long actual1 = easySearch.search(testText,"4-х");
        long expected1 = 1;
        long actual2 = easySearch.search(testText,"4");
        long expected2 = 0;
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
    }

    @Test
    public void easySearchEngineNum (){
        String testText = "один и 1";
        ISearchEngine easySearch = new EasySearch();
        long actual1 = easySearch.search(testText,"один");
        long expected1 = 1;
        long actual2 = easySearch.search(testText,"и");
        long expected2 = 1;
        long actual3 = easySearch.search(testText,"1");
        long expected3 = 1;
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
    }

    @Test
    public void easySearchEngineGranny (){
        String testText = "бабушка бабушке бабушку";
        ISearchEngine easySearch = new EasySearch();
        long actual1 = easySearch.search(testText,"бабушка");
        long expected1 = 1;
        long actual2 = easySearch.search(testText,"бабушке");
        long expected2 = 1;
        long actual3 = easySearch.search(testText,"бабушку");
        long expected3 = 1;
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
    }

    @Test
    public void easySearchEngineNumeric (){
        String testText = "456 14 6 853";
        ISearchEngine easySearch = new EasySearch();
        long actual1 = easySearch.search(testText,"456");
        long expected1 = 1;
        long actual2 = easySearch.search(testText,"6");
        long expected2 = 1;
        long actual3 = easySearch.search(testText,"85");
        long expected3 = 0;
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
    }

    @Test
    public void easySearchEngineWow (){
        String testText = "ай-яй-яй";
        ISearchEngine easySearch = new EasySearch();
        long actual1 = easySearch.search(testText,"ай");
        long expected1 = 0;
        long actual2 = easySearch.search(testText,"яй");
        long expected2 = 0;
        long actual3 = easySearch.search(testText,"ай-яй-яй");
        long expected3 = 1;
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
        Assertions.assertEquals(expected3,actual3);
    }
}
