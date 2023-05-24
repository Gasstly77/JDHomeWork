package home_work_1;

import home_work_1.api.ICommunicationPrinter;
import java.util.Objects;

public class YourName2 implements ICommunicationPrinter {

    @Override
    public String welcom(String name) {
        String welcomMessage;
        if (Objects.equals(name, "Вася")) {
            welcomMessage = "Привет! \n Я так долго тебя ждал";
        } else if (Objects.equals(name, "Анастасия")) {
            welcomMessage = "Я так долго тебя ждал";
        } else {
            welcomMessage = "Добрый день, а вы кто?";
        }
        return welcomMessage;
    }
}
