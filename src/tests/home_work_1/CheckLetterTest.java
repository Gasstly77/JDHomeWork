package tests.home_work_1;

import home_work_1.CheckLetter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckLetterTest {
    @Test
    public void checkLetter (){
        String checkSymbol = "a";
        boolean actual = CheckLetter.checkLatter(checkSymbol);
        Assertions.assertTrue(actual);
    }
    @Test
    public void checkNumber (){
        String checkSymbol = "7";
        boolean actual = CheckLetter.checkLatter(checkSymbol);
        Assertions.assertFalse(actual);
    }
    @Test
    public void checkText (){
        String checkSymbol = "TExt";
        boolean actual = CheckLetter.checkLatter(checkSymbol);
        Assertions.assertFalse(actual);
    }
    @Test
    public void checkSymbol (){
        String checkSymbol = ":";
        boolean actual = CheckLetter.checkLatter(checkSymbol);
        Assertions.assertFalse(actual);
    }
}
