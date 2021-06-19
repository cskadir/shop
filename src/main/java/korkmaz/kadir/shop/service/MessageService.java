package korkmaz.kadir.shop.service;

import korkmaz.kadir.shop.model.Coffee;
import korkmaz.kadir.shop.model.Ingredients;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    public void showMenu(List<Coffee> coffeeList) {
        String msg = "****************************************************************\n";
        int i = 1;
        for (Coffee coffee : coffeeList) {
            msg += i + ". " + coffee.getName() + " ( " + coffee.getCost() + " TL )\n";
            i++;
        }
        System.out.println(msg);
        System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");
    }

    public void showOrderDetail(Coffee coffee) {
        List<Ingredients> keys = new ArrayList<Ingredients>(coffee.getIngredients().keySet());
        List<Integer> values = new ArrayList<Integer>(coffee.getIngredients().values());

        String message = coffee.getName() + " seçtiniz. \nBu içeceğimiz " + values.get(0) + " doz " + keys.get(0).getDescription();
        if (keys.size() > 1) {
            for (int i = 1; i < keys.size(); i++) {
                message += " ve " + values.get(i) + " doz " + keys.get(i).getDescription();
            }
            message += " içermektedir. \nAfiyet Olsun";
        } else {
            message += " içermektedir.\nAfiyet Olsun";
        }
        System.out.println(message);
    }


}

