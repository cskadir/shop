package korkmaz.kadir.shop.service;

import korkmaz.kadir.shop.dao.DataService;
import korkmaz.kadir.shop.model.Coffee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class CoffeeService {

    private final DataService dataService;
    private final MessageService messageService;


    public int getOrder() {

        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        while (ch < 1 || ch > 7) {
            System.out.println("Hatalı giriş tekrar deneyiniz\n");
            ch = sc.nextInt();
        }
        System.out.println("Teşekkürler kahveniz hazırlanıyor..");
        return ch;
    }

    public Coffee getCoffee(int ch) {
        return dataService.findCoffee(ch);
    }

    public void run() {
        messageService.showMenu(dataService.getCoffeeList());
        int ch = getOrder();
        Coffee selected=getCoffee(ch);
        messageService.showOrderDetail(selected);
    }

}
