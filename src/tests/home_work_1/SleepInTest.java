package tests.home_work_1;

import home_work_1.SleepIn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SleepInTest {
    @Test
    public void CheckWakeUp (){
        boolean weekday = true;
        boolean vacation = false;
        boolean actual = SleepIn.sleepIn(weekday,vacation);
        Assertions.assertFalse(actual);
    }
    @Test
    public void CheckVacationWeekDay (){
        boolean weekday = true;
        boolean vacation = true;
        boolean actual = SleepIn.sleepIn(weekday,vacation);
        Assertions.assertTrue(actual);
    }
    @Test
    public void CheckDayOff (){
        boolean weekday = false;
        boolean vacation = false;
        boolean actual = SleepIn.sleepIn(weekday,vacation);
        Assertions.assertTrue(actual);
    }
    @Test
    public void CheckVacation (){
        boolean weekday = false;
        boolean vacation = true;
        boolean actual = SleepIn.sleepIn(weekday,vacation);
        Assertions.assertTrue(actual);
    }
}
