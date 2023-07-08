package final_exam.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class AddMenuPos {
    /**
     * Метод для наполнения рецептами меню пиццерии
     * @return экземпляр списка доступных рецептов
     */
    public PizzaRecipe fullFillMenu() {

        Map<String, Integer> margaritaRecipe = new LinkedHashMap<>();
        margaritaRecipe.put("Подготовить основу", 1);
        margaritaRecipe.put("Подготовить соус", 1);
        margaritaRecipe.put("Подготовить сыр", 1);
        margaritaRecipe.put("Намазать основу соусом", 2);
        margaritaRecipe.put("Равномерно выложить сыр", 2);
        margaritaRecipe.put("Положить в печь", 1);
        margaritaRecipe.put("Запекать в печи", 15);


        Map<String, Integer> peperoniRecipe = new LinkedHashMap<>();
        peperoniRecipe.put("Подготовить основу", 1);
        peperoniRecipe.put("Подготовить соус", 1);
        peperoniRecipe.put("Подготовить сыр", 1);
        peperoniRecipe.put("Подготовить пеперони", 2);
        peperoniRecipe.put("Намазать основу соусом", 2);
        peperoniRecipe.put("Равномерно выложить сыр", 2);
        peperoniRecipe.put("Равномерно выложить пеперони", 5);
        peperoniRecipe.put("Положить в печь", 1);
        peperoniRecipe.put("Запекать в печи", 15);

        Map<String, Integer> bbqRecipe = new LinkedHashMap<>();
        bbqRecipe.put("Подготовить основу", 1);
        bbqRecipe.put("Подготовить соус", 1);
        bbqRecipe.put("Подготовить сыр", 1);
        bbqRecipe.put("Подготовить мясо", 5);
        bbqRecipe.put("Намазать основу соусом", 2);
        bbqRecipe.put("Равномерно выложить сыр", 2);
        bbqRecipe.put("Равномерно выложить мясо", 3);
        bbqRecipe.put("Положить в печь", 1);
        bbqRecipe.put("Запекать в печи", 15);

        Map<String, Integer> bavariaRecipe = new LinkedHashMap<>();
        bavariaRecipe.put("Подготовить основу", 1);
        bavariaRecipe.put("Подготовить соус", 1);
        bavariaRecipe.put("Подготовить сыр", 1);
        bavariaRecipe.put("Подготовить колбаски", 4);
        bavariaRecipe.put("Намазать основу соусом", 2);
        bavariaRecipe.put("Равномерно выложить сыр", 2);
        bavariaRecipe.put("Равномерно выложить колбаски", 5);
        bavariaRecipe.put("Положить в печь", 1);
        bavariaRecipe.put("Запекать в печи", 15);

        PizzaRecipe pizzasRecipeList = new PizzaRecipe();

        pizzasRecipeList.setPizza("Маргарита", margaritaRecipe);
        pizzasRecipeList.setPizza("Пеперони", peperoniRecipe);
        pizzasRecipeList.setPizza("Барбекю", bbqRecipe);
        pizzasRecipeList.setPizza("Баварская", bavariaRecipe);

        return pizzasRecipeList;
    }
}
