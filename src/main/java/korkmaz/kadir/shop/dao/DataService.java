package korkmaz.kadir.shop.dao;


import korkmaz.kadir.shop.model.Coffee;
import korkmaz.kadir.shop.model.Ingredients;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    public Coffee findCoffee(int i) {
        Optional<Coffee> cf;
        switch (i) {
            case 1:
                cf = coffeeList.stream().filter(c -> c.getName().equals("Espresso")).findAny();
                return cf.get();
            case 2:
                cf = coffeeList.stream().filter(c -> c.getName().equals("Double Espresso")).findAny();
                return cf.get();
            case 3:
                cf = coffeeList.stream().filter(c -> c.getName().equals("Cappucino")).findAny();
                return cf.get();
            case 4:
                cf = coffeeList.stream().filter(c -> c.getName().equals("Caffe Latte")).findAny();
                return cf.get();
            case 5:
                cf = coffeeList.stream().filter(c -> c.getName().equals("Mocha")).findAny();
                return cf.get();
            case 6:
                cf = coffeeList.stream().filter(c -> c.getName().equals("Americano")).findAny();
                return cf.get();
            case 7:
                cf = coffeeList.stream().filter(c -> c.getName().equals("Hot Water")).findAny();
                return cf.get();
            default:
                return null;
        }
    }
}
