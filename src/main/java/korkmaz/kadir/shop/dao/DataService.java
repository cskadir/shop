package korkmaz.kadir.shop.dao;


import korkmaz.kadir.shop.model.Coffee;
import korkmaz.kadir.shop.model.Ingredients;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class DataService {
    private List<Coffee> coffeeList;

    @PostConstruct
    public void init() {
        coffeeList = new ArrayList<>();

        coffeeList.add(new Coffee("Espresso", 7, Map.of(
                Ingredients.ESPRESSO, 1)
        ));
        coffeeList.add(new Coffee("Double Espresso", 12, Map.of(
                Ingredients.ESPRESSO, 2)
        ));
        coffeeList.add(new Coffee("Cappuccino", 12, Map.of(
                Ingredients.ESPRESSO, 2,
                Ingredients.HOTWATER, 2)
        ));
        coffeeList.add(new Coffee("Caffe Latte", 12, Map.of(
                Ingredients.ESPRESSO, 1,
                Ingredients.STEAMEDMILK, 3,
                Ingredients.MILKFOAM, 1)
        ));
        coffeeList.add(new Coffee("Mocha", 13, Map.of(
                Ingredients.ESPRESSO, 1,
                Ingredients.STEAMEDMILK, 2,
                Ingredients.MILKFOAM, 2,
                Ingredients.HOTCHOCOLATE, 2)
        ));
        coffeeList.add(new Coffee("Americano", 10, Map.of(
                Ingredients.ESPRESSO, 1,
                Ingredients.HOTWATER, 4)
        ));
        coffeeList.add(new Coffee("Hot Water", 3, Map.of(
                Ingredients.HOTWATER, 5)
        ));

    }

    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }
}
