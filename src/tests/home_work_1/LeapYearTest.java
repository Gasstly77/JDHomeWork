package tests.home_work_1;

import home_work_1.LeapYear;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    public void CheckNormalYear (){
        int normalYear = 2001;
        String expected = "Невисокосный";
        String actual = LeapYear.yearType(normalYear);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckYearFourH (){
        int normalYear = 400;
        String expected = "Високосный";
        String actual = LeapYear.yearType(normalYear);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckYearOneH (){
        int normalYear = 1800;
        String expected = "Невисокосный";
        String actual = LeapYear.yearType(normalYear);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckUniversalYear (){
        int normalYear = 1600;
        String expected = "Високосный";
        String actual = LeapYear.yearType(normalYear);
        Assertions.assertEquals(expected, actual);
    }
}
