package final_exam.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PizzaRecipe {
    private Map<String, Map> pizza = new HashMap<>();

    public Map<String, Map> getPizza() {
        return pizza;
    }

    public void setPizza(String name, Map recipe) {
        this.pizza.put(name, recipe);
    }

    /**
     * Получения списка доступных рецептов
     * @return возвращает список доступных рецептов пиццы
     */
    public Set pizzaList() {
        Set<String> pizzas = this.pizza.keySet();
        return pizzas;
    }
}
