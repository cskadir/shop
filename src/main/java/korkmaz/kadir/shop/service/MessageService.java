package korkmaz.kadir.shop.service;

import korkmaz.kadir.shop.model.Coffee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    public void showMenu(List<Coffee> coffeeList) {
        String msg = "";
        int i = 1;
        for (Coffee coffee : coffeeList) {
            msg += i + ". " + coffee.getName() + " ( " + coffee.getCost() + " TL )\n";
            i++;
        }
        System.out.println(msg);
        System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz: ");
    }


}

