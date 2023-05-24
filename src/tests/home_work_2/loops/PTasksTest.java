package tests.home_work_2.loops;


import home_work_2.loops.PTasks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PTasksTest {
    @Test
    public void checkMaxDig () {
        long n = 123;
        long expected = 3;
        long actual = PTasks.maxDig(n);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkRandomPos () {
        Assertions.assertTrue(PTasks.randomTrue());
    }

    @Test
    public void checkEvenCount () {
        long n = 34658;
        long expected = 3;
        long actual = PTasks.returnEven(n);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkOddCount () {
        long n = 34658;
        long expected = 2;
        long actual = PTasks.returnOdd(n);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkFeb () {
        long l = 6;
        String expected = "0,1,1,2,3,5,8";
        String actual = PTasks.feb(l);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkStepNumber () {
        long s = 2;
        long l = 10;
        String expected = "0,2,4,6,8,10,12,14,16,18,20,22";
        String actual = PTasks.stepNumber(l,s);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkReverse () {
        long n = 654321;
        long expected = 123456;
        long actual = PTasks.reverse(n);
        Assertions.assertEquals(expected, actual);
    }
}
