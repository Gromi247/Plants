package pl.b2b.cfg.shipmentDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shipmentMethod {

    private WebDriver webDriver;
    private WebDriverWait wait;

    public shipmentMethod(WebDriver webDriver, Class<shipmentMethod> shipmentMethodClass) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 10);

    }

    @FindBy(xpath = shipmentData.GUEST_BUY)
    private WebElement guestBuy;








    private void guestBuy(){
        wait.until(ExpectedConditions.visibilityOf(guestBuy));
        guestBuy.click();
    }



    public void makeShipment() {
        guestBuy();

    }

}
