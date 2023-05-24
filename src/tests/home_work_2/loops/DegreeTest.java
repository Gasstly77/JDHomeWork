package tests.home_work_2.loops;

import home_work_2.loops.Degree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DegreeTest {
    @Test
    public void CheckCalculation (){
        int deg = 3;
        double num = 3;
        double expected = 27.0;
        double actual = Degree.degree(num,deg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckResultString (){
        int deg = 3;
        double num = 3;
        String expected = "3.0 ^ 3 = 27.0";
        String actual = Degree.degreeResult(num,deg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckCalculationZeroDeg (){
        int deg = 0;
        double num = 3;
        double expected = 1.0;
        double actual = Degree.degree(num,deg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckResultStringZeroDeg (){
        int deg = 0;
        double num = 3;
        String expected = "3.0 ^ 0 = 1.0";
        String actual = Degree.degreeResult(num,deg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckResultStringOneDeg (){
        int deg = 1;
        double num = 3;
        String expected = "3.0 ^ 1 = 3.0";
        String actual = Degree.degreeResult(num,deg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckCalculationTask1 (){
        int deg = 2;
        double num = 7.5;
        double expected = 56.25;
        double actual = Degree.degree(num,deg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckCalculationZeroNum (){
        int deg = 2;
        double num = 0;
        double expected = 0.0;
        double actual = Degree.degree(num,deg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckResultStringTask1 (){
        int deg = 2;
        double num = 7.5;
        String expected = "7.5 ^ 2 = 56.25";
        String actual = Degree.degreeResult(num,deg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckCalculationTask2 (){
        int deg = 5;
        double num = 18;
        double expected = 1889568.0;
        double actual = Degree.degree(num,deg);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CheckResultStringTask2 (){
        int deg = 5;
        double num = 18;
        String expected = "18.0 ^ 5 = 1889568.0";
        String actual = Degree.degreeResult(num,deg);
        Assertions.assertEquals(expected,actual);
    }
}
