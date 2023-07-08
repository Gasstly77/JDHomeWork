package final_exam.api;

import final_exam.utils.Check;
import final_exam.utils.OrderInfo;
import final_exam.utils.PizzaRecipe;

import java.util.List;

public interface IPizzaCreation {
    String getMenu(PizzaRecipe recipeList);
    String takeOrder(OrderInfo orderList, List pizzasToOrder, Check checkList);
    void printOrderStatus(String order, Check checkList, PizzaRecipe recipeList, OrderInfo orderList);
    String orderFinish(String order, Check checkList);
}



