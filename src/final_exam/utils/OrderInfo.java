package final_exam.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderInfo {
    private Map<String, List> orderList = new HashMap<>();
    private Menu menu;
    private Check checkList;

    public OrderInfo(Menu menu, Check checkList) {
        this.menu = menu;
        this.checkList = checkList;
    }

    /**
     * Метод для формирования текущего заказа
     * @param pizzasToOrder имя пиццы которая будет добавлена в заказ
     * @return возвращает строку с именем заказа
     */
    public String makeOrder(List pizzasToOrder) {
        String orderName = this.checkList.createCheck();
        this.orderList.put(orderName, pizzasToOrder);
        return orderName;
    }

    /**
     * Метод для получения списка заказов
     * @return возвращает список заказов
     */
    public Map<String, List> getOrderList() {
        return orderList;
    }
}
