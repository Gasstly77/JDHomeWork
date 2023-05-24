
package home_work_1;

import home_work_1.api.ICommunicationPrinter;

import java.util.Objects;

public class YourName1 implements ICommunicationPrinter {
    @Override
    public String welcom(String name) {
        String welcomMessage;
        if ((Objects.equals(name,"Вася")) || (Objects.equals(name,"Анастасия"))) {
            if (Objects.equals(name,"Вася")) {
                welcomMessage = "Привет! \n Я так долго тебя ждал";
            }else{
                welcomMessage = "Я так долго тебя ждал";
            }
        }else{
            welcomMessage = "Добрый день, а вы кто?";
        }
        return welcomMessage;
    }
}