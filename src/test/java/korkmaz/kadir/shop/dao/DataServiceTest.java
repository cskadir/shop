package korkmaz.kadir.shop.dao;

import korkmaz.kadir.shop.model.Coffee;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class DataServiceTest {

    @Autowired
    DataService dataService;

    @Test
    void getCoffeeList() {
        int size = dataService.getCoffeeList().size();
        Assert.assertEquals(size,7);
    }
    @Test
    void findCoffee() {
        Coffee res=  dataService.findCoffee(1);
        Assert.assertEquals("Espresso",res.getName());
    }
}