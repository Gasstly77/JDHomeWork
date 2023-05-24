package tests.home_work_1;

import home_work_1.CheckLetter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckLetterTest {
    @Test
    public void CheckLetter (){
        String checkSymbol = "a";
        boolean actual = CheckLetter.checkLatter(checkSymbol);
        Assertions.assertTrue(actual);
    }
    @Test
    public void CheckNumber (){
        String checkSymbol = "7";
        boolean actual = CheckLetter.checkLatter(checkSymbol);
        Assertions.assertFalse(actual);
    }
    @Test
    public void CheckText (){
        String checkSymbol = "TExt";
        boolean actual = CheckLetter.checkLatter(checkSymbol);
        Assertions.assertFalse(actual);
    }
    @Test
    public void CheckSymbol (){
        String checkSymbol = ":";
        boolean actual = CheckLetter.checkLatter(checkSymbol);
        Assertions.assertFalse(actual);
    }
}
