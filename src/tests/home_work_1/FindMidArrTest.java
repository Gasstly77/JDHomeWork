package tests.home_work_1;

import home_work_1.FindMidArr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMidArrTest {
    @Test
    public void CheckArr (){
        int[] checkArr = {1,3,5};
        int expected = 3;
        int actual = FindMidArr.findMidInArr(checkArr);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void CheckNegativeArr (){
        int[] checkArr = {-56,-23,-95};
        int expected = -56;
        int actual = FindMidArr.findMidInArr(checkArr);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void CheckMixArr (){
        int[] checkArr = {-80,13,5};
        int expected = 5;
        int actual = FindMidArr.findMidInArr(checkArr);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void CheckSimilar (){
        int[] checkArr = {5,5,5};
        int expected = 5;
        int actual = FindMidArr.findMidInArr(checkArr);
        Assertions.assertEquals(expected, actual);
    }
}
