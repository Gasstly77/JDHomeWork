package tests.home_work_1;

import home_work_1.KByteToByte;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KByteToByteTest {
    @Test
    public void checkNormalCount (){
        int inputKbytes = 1;
        long expected = 1024;
        long actual = KByteToByte.kByteCalculation(inputKbytes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkMinus (){
        int inputKbytes = -20;
        long expected = 0;
        long actual = KByteToByte.kByteCalculation(inputKbytes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkZero (){
        int inputKbytes = 0;
        long expected = 0;
        long actual = KByteToByte.kByteCalculation(inputKbytes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkBigNum (){
        int inputKbytes = 1600;
        long expected = 1638400;
        long actual = KByteToByte.kByteCalculation(inputKbytes);
        Assertions.assertEquals(expected, actual);
    }
}
