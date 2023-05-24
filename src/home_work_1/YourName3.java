package home_work_1;


import home_work_1.api.ICommunicationPrinter;

public class YourName3  implements ICommunicationPrinter {

    @Override
    public String welcom(String name) {
        String welcomMessage;
        switch (name) {
            case "Вася":
                welcomMessage = "Привет! \n Я так долго тебя ждал";
                break;
            case "Анастасия":
                welcomMessage = "Я так долго тебя ждал";
                break;
            default:
                welcomMessage = "Добрый день, а вы кто?";
        }
        return welcomMessage;
    }
}
