package tests.home_work_1;

import home_work_1.YourName1;
import home_work_1.YourName2;
import home_work_1.YourName3;
import home_work_1.api.ICommunicationPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YourNameTest {
    @Test
    public void checkYourNameIfV (){
        String name = "Вася";
        String expected = "Привет! \n Я так долго тебя ждал";
        ICommunicationPrinter welcomMessage = new YourName1();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkYourNameIfA (){
        String name = "Анастасия";
        String expected = "Я так долго тебя ждал";
        ICommunicationPrinter welcomMessage = new YourName1();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkYourNameIfO (){
        String name = "Герман";
        String expected = "Добрый день, а вы кто?";
        ICommunicationPrinter welcomMessage = new YourName1();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkYourNameIfElseV (){
        String name = "Вася";
        String expected = "Привет! \n Я так долго тебя ждал";
        ICommunicationPrinter welcomMessage = new YourName2();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkYourNameIfElseA (){
        String name = "Анастасия";
        String expected = "Я так долго тебя ждал";
        ICommunicationPrinter welcomMessage = new YourName2();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkYourNameIfElseO (){
        String name = "Герман";
        String expected = "Добрый день, а вы кто?";
        ICommunicationPrinter welcomMessage = new YourName2();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkYourNameSwitchV (){
        String name = "Вася";
        String expected = "Привет! \n Я так долго тебя ждал";
        ICommunicationPrinter welcomMessage = new YourName3();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkYourNameSwitchA (){
        String name = "Анастасия";
        String expected = "Я так долго тебя ждал";
        ICommunicationPrinter welcomMessage = new YourName3();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkYourNameSwitchO (){
        String name = "Герман";
        String expected = "Добрый день, а вы кто?";
        ICommunicationPrinter welcomMessage = new YourName3();
        String actual = welcomMessage.welcom(name);
        Assertions.assertEquals(expected, actual);
    }
}
