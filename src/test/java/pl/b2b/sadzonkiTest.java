package pl.b2b;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pl.b2b.cfg.cfg;
import pl.b2b.cfg.orderDetails.orderData;
import pl.b2b.cfg.orderDetails.orderMethod;
import pl.b2b.cfg.shipmentDetails.shipmentMethod;

public class sadzonkiTest {

    static WebDriver driver;
    private pl.b2b.cfg.orderDetails.orderMethod orderMethod;

    @Before
    public void init(){
        driver = cfg.getDriver(cfg.CHROME);
        orderMethod = PageFactory.initElements(driver, orderMethod.class);

    }


    @Test
    public void startPage () {
        PageFactory.initElements(driver, this);
        driver.get(orderData.OLEANDER);
        orderMethod.makeOrder("Łopatka Ogrodowa","Musa Veluntina","20");
    }






    }






