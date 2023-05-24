package tests.home_work_2.loops;

import home_work_2.loops.MultiplyA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyATest {
    @Test
    public void CheckMultiplyNum (){
        int arg = 3;
        String expected = "результат умножения на 3 выполнений до переполнения = 4052555153018976267 результат выполнений после переполнения = -6289078614652622815";
        String actual = MultiplyA.multiplyString(arg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckMultiplyBigNum (){
        int arg = 188;
        String expected = "результат умножения на 188 выполнений до переполнения = 1560496482665168896 результат выполнений после переполнения = -1774566438301073408";
        String actual = MultiplyA.multiplyString(arg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckMultiplyNegative (){
        int arg = -19;
        String expected = "результат умножения на -19 выполнений до переполнения = -6706491611731658175 результат выполнений после переполнения = -1703867893065355987";
        String actual = MultiplyA.multiplyString(arg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckMultiplyOne (){
        int arg = 1;
        String expected = "Операция не имеет смысла, ответ останется - 1";
        String actual = MultiplyA.multiplyString(arg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckMultiplyZero (){
        int arg = 0;
        String expected = "Операция не имеет смысла, ответ останется - 0";
        String actual = MultiplyA.multiplyString(arg);
        Assertions.assertEquals(expected,actual);
    }
}
