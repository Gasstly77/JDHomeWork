package final_exam;

import final_exam.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Pizza {
    public static void main(String[] args) {
        AddMenuPos fullFillPizza = new AddMenuPos();
        PizzaRecipe pizzasRecipeList = fullFillPizza.fullFillMenu();

        Menu currMenu = new Menu(pizzasRecipeList);
        Check newCheck = new Check();
        OrderInfo orderList = new OrderInfo(currMenu,newCheck);

        PizzaCreation pizza = new PizzaCreation();

        newClient(pizzasRecipeList,orderList,newCheck,pizza);
        newClient(pizzasRecipeList,orderList,newCheck,pizza);

    }

    /**
     * Метод для получения наименования пиццы которую хочет заказать клиент.
     * @param pizzasRecipeList список доступных пицц (на которые есть рецепты)
     * @return возвращает наименование пиццы которую необходимо добавить в заказ.
     */
    private static String getPizza (PizzaRecipe pizzasRecipeList) {
        Set<String> pizzas = pizzasRecipeList.pizzaList();
        Scanner console = new Scanner(System.in);
        System.out.print("Какую пиццу вы хотите заказать? ");
        if (console.hasNext()) {
            String clientPizza = console.nextLine();
            if (pizzas.contains(clientPizza)) {
                return clientPizza;
            } else if (clientPizza.equals("все")) {
                return "end";
            }
            System.out.println("Такой пиццы нет в меню!");
        } else {
            System.out.println("Необходимо указать название пиццы!");
        }
        return getPizza(pizzasRecipeList);
    }

    /**
     * Метод для получения чека клиента
     * @return возвращает указанный клиентом чек для получения заказа
     */
    private static String getClientCheck () {
        Scanner console = new Scanner(System.in);
        System.out.print("Укажите Ваз заказ (вторая строчка чека): ");
        if (console.hasNext()){
            String clientCheck = console.nextLine();
            return clientCheck;
        } else {
            System.out.println("Необходимо указать Ваш заказ!");
        }
        return getClientCheck();
    }

    /**
     * Метод эмитирующий работу с клиентом пришедшим в пиццерию
     * @param pizzasRecipeList  список доступных пицц и рецептов
     * @param orderList список заказав текущей сессии
     * @param newCheck список чеков текущей сессии
     * @param pizza экземпляр реализации этапов приготовления пиццы
     */
    private static void newClient (PizzaRecipe pizzasRecipeList, OrderInfo orderList, Check newCheck, PizzaCreation pizza) {
        System.out.println(pizza.getMenu(pizzasRecipeList));

        List pizzasToOrder = new ArrayList<>();
        String clientPizza = null;
        do  {
            clientPizza = getPizza(pizzasRecipeList);
            if (pizzasToOrder.size() == 0 && clientPizza.equals("end")) {
                System.out.println("Вы не можете оставить заказ пустым");
                clientPizza = "";
            } else {
                if (!clientPizza.equals("end")) {
                    pizzasToOrder.add(clientPizza);
                }
            }
        } while (!clientPizza.equals("end"));

        String order = pizza.takeOrder(orderList, pizzasToOrder, newCheck);

        pizza.printOrderStatus(order, newCheck, pizzasRecipeList,orderList);

        pizza.orderFinish(getClientCheck(), newCheck);
    }
}
