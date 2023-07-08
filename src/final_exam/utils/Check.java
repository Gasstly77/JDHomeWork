package final_exam.utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Check {
    private Map<String, String> orderList = new HashMap<>();

    /**
     * Метод для формирования нового имени для выдаваемого квитка
     * @param orderList список текущих активных квитков
     * @return имя присваиваемое квитку, используется как ключ
     */
    public static String getCheckName (Map orderList) {
        return "Заказ №" + (orderList.size()+1);
    }

    /**
     * Метод для получения списка квитков
     * @return возвращает набор квитков и времени выдачи
     */
    public Map<String, String> getOrderList() {
        return orderList;
    }

    /**
     * Метод для формирования квитка доступного для пользователя
     * @return возвращает имя квитка
     */
    public String createCheck() {
        LocalTime currTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String timeToCheck = currTime.format(formatter);
        String orderName = getCheckName(orderList);
        this.orderList.put(orderName,timeToCheck);
        return orderName;
    }

    /**
     * Метод для получения квитка на печать
     * @param order имя квитка
     * @return возвращает строку для печати квитка
     */
    public String getCheck (String order) {
        return "\nВаш Заказ:\n " + order + "\n Время приема заказа: "+this.orderList.get(order) + "\n";
    }
}
