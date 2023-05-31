package tests.home_work_2.loops;

import home_work_2.loops.MultiplyItSelfOrd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyItSelfOrdTest {
    @Test
    public void checkResultString (){
        String arg = "181232375";
        String expected = "1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080";
        String actual = MultiplyItSelfOrd.multiplyItSelf(arg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkResultStringZero (){
        String arg = "0181232375";
        String expected = "0 * 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 0";
        String actual = MultiplyItSelfOrd.multiplyItSelf(arg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkFractionalNumber (){
        String arg = "99.2";
        String expected = "Введено не целое число";
        String actual = MultiplyItSelfOrd.multiplyItSelf(arg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void checkNegativeResult (){
        String arg = "99.ag";
        String expected = "Введено не число";
        String actual = MultiplyItSelfOrd.multiplyItSelf(arg);
        Assertions.assertEquals(expected,actual);
    }
}
