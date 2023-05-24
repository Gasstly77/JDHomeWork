package tests.home_work_1;

import home_work_1.KByteToByte;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KByteToByteTest {
    @Test
    public void CheckNormalCount (){
        int inputKbytes = 1;
        long expected = 1024;
        long actual = KByteToByte.kByteCalculation(inputKbytes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckMinus (){
        int inputKbytes = -20;
        long expected = 0;
        long actual = KByteToByte.kByteCalculation(inputKbytes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckZero (){
        int inputKbytes = 0;
        long expected = 0;
        long actual = KByteToByte.kByteCalculation(inputKbytes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckBigNum (){
        int inputKbytes = 1600;
        long expected = 1638400;
        long actual = KByteToByte.kByteCalculation(inputKbytes);
        Assertions.assertEquals(expected, actual);
    }
}
