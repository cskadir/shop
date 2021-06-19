package korkmaz.kadir.shop.model;

import java.util.Map;

public class Coffee {
    private String name;
    private Map<Ingredients, Integer> ingredients;
    private int cost;

    public Coffee(String name, int cost, Map<Ingredients, Integer> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Ingredients, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<Ingredients, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
