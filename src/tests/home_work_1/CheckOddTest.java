package tests.home_work_1;

import home_work_1.CheckOdd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckOddTest {
    @Test
    public void CheckEven (){
        int checkNumber = 6;
        String expected = "четное";
        String actual = CheckOdd.numberType(checkNumber);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void CheckOdd (){
        int checkNumber = 7;
        String expected = "нечетное";
        String actual = CheckOdd.numberType(checkNumber);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void CheckOne (){
        int checkNumber = 1;
        String expected = "нечетное";
        String actual = CheckOdd.numberType(checkNumber);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void CheckNegative (){
        int checkNumber = -6;
        String expected = "четное";
        String actual = CheckOdd.numberType(checkNumber);
        Assertions.assertEquals(expected,actual);
    }
}
