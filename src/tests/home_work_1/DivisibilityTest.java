package tests.home_work_1;

import home_work_1.Divisibility;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisibilityTest {
    @Test
    public void CheckPositive (){
        int dividend = 6;
        int divisor = 2;
        boolean actual = Divisibility.divisibilityPossibility(dividend, divisor);
        Assertions.assertTrue(actual);
    }
    @Test
    public void CheckNegative (){
        int dividend = 5;
        int divisor = 2;
        boolean actual = Divisibility.divisibilityPossibility(dividend, divisor);
        Assertions.assertFalse(actual);
    }
    @Test
    public void CheckZero (){
        int dividend = 6;
        int divisor = 0;
        boolean actual = Divisibility.divisibilityPossibility(dividend, divisor);
        Assertions.assertFalse(actual);
    }
    @Test
    public void CheckAnotherZero (){
        int dividend = 0;
        int divisor = 2;
        boolean actual = Divisibility.divisibilityPossibility(dividend, divisor);
        Assertions.assertTrue(actual);
    }
}
