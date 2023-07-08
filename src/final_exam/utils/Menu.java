package final_exam.utils;

import java.util.Iterator;
import java.util.Set;

public class Menu {
    private String menu;

    private PizzaRecipe recipeList;

    public Menu(PizzaRecipe recipeList) {
        this.recipeList = recipeList;
    }

    /**
     * Метод для формирования меню
     * @return Возвращает строку с меню готовую для печати клиенту.
     */
    public String getMenu() {
        Set<String> pizzas = recipeList.pizzaList();

        String menuBeginning = " МЕНЮ\n\nПиццы:\n";

        StringBuilder finalMenu = new StringBuilder(menuBeginning);

        int pos = 1;

        Iterator<String> iterator = pizzas.iterator();
        while (iterator.hasNext()) {
            String pizzaName = iterator.next();
            finalMenu.append(pos + " . " + pizzaName + "\n");
            ++pos;
        }

        this.menu = finalMenu.toString();

        return this.menu;
    }
}
