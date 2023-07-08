package final_exam.utils;

import final_exam.api.IPizzaCreation;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PizzaCreation implements IPizzaCreation {
    /**
     * Метод для получения меню
     * @param recipeList список доступных рецептов
     * @return Возвращает строку с меню готовым для печати
     */
    @Override
    public String getMenu(PizzaRecipe recipeList) {
        Menu currMenu = new Menu(recipeList);
        return currMenu.getMenu();
    }

    /**
     * Метод для приема заказа клиента
     * @param orderList экземпляр списка заказов текущей сессии работы
     * @param pizzasToOrder список доступных для заказа пицц
     * @param checkList список квитков текущей сессии работы
     * @return возвращает строку с именем заказа
     */
    @Override
    public String takeOrder(OrderInfo orderList, List pizzasToOrder, Check checkList) {
        String order = orderList.makeOrder(pizzasToOrder);
        System.out.println(checkList.getCheck(order));
        return order;
    }

    /**
     * Метод для вывода информации о текущей работе пиццерии
     * @param order заказ с которым ведется работа
     * @param checkList список квитков текущей сессии работы
     * @param recipeList список доступных рецептов
     * @param orderList экземпляр списка заказов текущей сессии работы
     */
    @Override
    public void printOrderStatus(String order, Check checkList, PizzaRecipe recipeList, OrderInfo orderList) {
        String orderStartTime = checkList.getOrderList().get(order);
        String startText = "Заказ принят - " + orderStartTime;
        System.out.println(startText);
        LocalTime timeToIncrease = LocalTime.parse(orderStartTime);
        timeToIncrease = timeToIncrease.plusMinutes(2);
        String nextLine1 = "Начало приготовления заказа - " + timeToIncrease;
        System.out.println(nextLine1);

        List <String> currOrder = orderList.getOrderList().get(order);
        for (String nextPos : currOrder) {
            System.out.println("\nПриготовление пиццы - " + nextPos);
            Map pizzaSteps = recipeList.getPizza().get(nextPos);

            Set<String> steps = pizzaSteps.keySet();

            for (String step : steps) {
                int stepTime = (int) pizzaSteps.get(step);
                timeToIncrease = timeToIncrease.plusMinutes(stepTime);
                String toPrint = "Шаг: " + step + " выполнен в " + timeToIncrease;
                System.out.println(toPrint);
            }

        }
        timeToIncrease = timeToIncrease.plusMinutes(3);
        String orderPackage = "\nЗаказ упакован в " + timeToIncrease;
        System.out.println(orderPackage);

        timeToIncrease = timeToIncrease.plusMinutes(3);
        String orderReady = "Заказ готов к выдаче в " + timeToIncrease + "\n";
        System.out.println(orderReady);
    }

    /**
     * Метод для выдачи заказа клиенту
     * @param order имя заказа
     * @param checkList список активных квитков
     * @return возвращает строку с информацией, какая фраза была отображена клиенту
     */
    @Override
    public String orderFinish(String order, Check checkList) {
        if (checkList.getOrderList().containsKey(order)) {
            String finalPhrase = "\n" + order + " выдан клиенту";
            System.out.println(finalPhrase);
            checkList.getOrderList().remove(order);
            checkList.getOrderList().put(order + "Выдан", "Не активен");
            System.out.println("*********************************\n");
            return finalPhrase;
        }
        System.out.println("\nТакого заказа нет!");
        System.out.println("*********************************\n");
        return null;
    }
}
