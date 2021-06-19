package korkmaz.kadir.shop;

import korkmaz.kadir.shop.service.CoffeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ShopApplication implements CommandLineRunner {

    private final CoffeeService coffeeService;

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        while (true){
            coffeeService.run();
        }

    }
}
