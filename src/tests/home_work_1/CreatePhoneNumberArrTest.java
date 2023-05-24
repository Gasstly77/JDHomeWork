package tests.home_work_1;

import home_work_1.CreatePhoneNumberArr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreatePhoneNumberArrTest {
    @Test
    public void CheckPhoneNumberFormat (){
       int [] phoneNumber = {4,5,6,3,2,1,9,0,7,8};
       String expected = "(456) 321-9078";
       String actual = CreatePhoneNumberArr.createPhoneNumber(phoneNumber);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckValidation (){
        String numArr = "4, 5  ,6,3  2,1,9,   0,7 ,8";
        int [] expected = {4,5,6,3,2,1,9,0,7,8};
        int [] actual = CreatePhoneNumberArr.makeArr(numArr);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void CheckValidationNull (){
        String numArr = "4,5,6,3,2,1,9,f,7,8";
        int [] expected = null;
        int [] actual = CreatePhoneNumberArr.makeArr(numArr);
        Assertions.assertArrayEquals(expected, actual);
    }
}
