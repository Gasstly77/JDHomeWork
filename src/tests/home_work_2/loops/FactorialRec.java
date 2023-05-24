package tests.home_work_2.loops;

import home_work_2.loops.FactorialRecNorm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialRec {
    @Test
    public void CheckCalculation (){
        int arg = 5;
        long expected = 120;
        double actual = FactorialRecNorm.fuctorial(arg);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void CheckResultString (){
        int arg = 5;
        String expected = "1 * 2 * 3 * 4 * 5 = 120";
        String actual = FactorialRecNorm.factorialCalc(arg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckResultStringNegative (){
        int arg = -5;
        String expected = "Неверный ввод, укажите положительное число не больше 20";
        String actual = FactorialRecNorm.factorialCalc(arg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckResultStringOver (){
        int arg = 22;
        String expected = "Неверный ввод, укажите положительное число не больше 20";
        String actual = FactorialRecNorm.factorialCalc(arg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckResultStringZero (){
        int arg = 0;
        String expected = "0";
        String actual = FactorialRecNorm.factorialCalc(arg);
        Assertions.assertEquals(expected,actual);
    }
}
