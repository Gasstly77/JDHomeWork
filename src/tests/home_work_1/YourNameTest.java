package tests.home_work_1;

import home_work_1.YourName1;
import home_work_1.YourName2;
import home_work_1.YourName3;
import home_work_1.api.ICommunicationPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YourNameTest {
    @Test
    public void CheckYourNameIfV (){
        String name = "Вася";
        String expected = "Привет! \n Я так долго тебя ждал";
        ICommunicationPrinter welcomMessage = new YourName1();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckYourNameIfA (){
        String name = "Анастасия";
        String expected = "Я так долго тебя ждал";
        ICommunicationPrinter welcomMessage = new YourName1();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckYourNameIfO (){
        String name = "Герман";
        String expected = "Добрый день, а вы кто?";
        ICommunicationPrinter welcomMessage = new YourName1();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckYourNameIfElseV (){
        String name = "Вася";
        String expected = "Привет! \n Я так долго тебя ждал";
        ICommunicationPrinter welcomMessage = new YourName2();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckYourNameIfElseA (){
        String name = "Анастасия";
        String expected = "Я так долго тебя ждал";
        ICommunicationPrinter welcomMessage = new YourName2();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckYourNameIfElseO (){
        String name = "Герман";
        String expected = "Добрый день, а вы кто?";
        ICommunicationPrinter welcomMessage = new YourName2();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckYourNameSwitchV (){
        String name = "Вася";
        String expected = "Привет! \n Я так долго тебя ждал";
        ICommunicationPrinter welcomMessage = new YourName3();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckYourNameSwitchA (){
        String name = "Анастасия";
        String expected = "Я так долго тебя ждал";
        ICommunicationPrinter welcomMessage = new YourName3();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CheckYourNameSwitchO (){
        String name = "Герман";
        String expected = "Добрый день, а вы кто?";
        ICommunicationPrinter welcomMessage = new YourName3();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }
}
