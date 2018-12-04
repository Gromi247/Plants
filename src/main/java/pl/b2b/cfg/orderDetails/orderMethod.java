package pl.b2b.cfg.orderDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orderMethod {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public orderMethod(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 10);

}

   @FindBy(xpath =orderData.SEARCH_FIELD )
    private WebElement searchField;

    @FindBy(xpath = orderData.SEARCH_BUTTON)
    private WebElement searchButton;

    @FindBy(xpath = orderData.ADD_SHOVEL)
    private WebElement addShovel;

    @FindBy(xpath = orderData.CHECK_SEEDS)
    private WebElement checkSeeds;

    @FindBy(xpath = orderData.QUANTITY_SEEDS)
    private WebElement quantitySeeds;

    @FindBy(xpath = orderData.ADD_SEEDS)
    private WebElement addSeeds;

    @FindBy(xpath = orderData.FREE_SEEDS)
    private WebElement freeSeeds;

    @FindBy(xpath = orderData.ADD_FREE)
    private WebElement addFree;

    @FindBy(xpath = orderData.GO_CASHBOX)
    private WebElement goCashbox;







    private void searchShovel(String str){
        wait.until(ExpectedConditions.visibilityOf(searchField));
        searchField.clear();
        searchField.sendKeys(str);
        wait.until(ExpectedConditions.visibilityOf(searchButton));
        searchButton.click();
    }

    private void addShovel() {
        wait.until(ExpectedConditions.visibilityOf(addShovel));
        addShovel.click();

    }

    private void searchSeeds(String str) {
        wait.until(ExpectedConditions.visibilityOf(searchField));
        searchField.clear();
        searchField.sendKeys(str);
        wait.until(ExpectedConditions.visibilityOf(searchButton));
        searchButton.click();

    }

    private void checkSeeds() {
        wait.until(ExpectedConditions.visibilityOf(checkSeeds));
        checkSeeds.click();

    }

    private void addSeeds(String str) {
        wait.until(ExpectedConditions.visibilityOf(quantitySeeds));
        quantitySeeds.clear();
        quantitySeeds.sendKeys(str);
        wait.until(ExpectedConditions.visibilityOf(addSeeds));
        addSeeds.click();

    }

    private void freeSeeds() {
        wait.until(ExpectedConditions.visibilityOf(freeSeeds));
        freeSeeds.click();
    }


    private void addFree() {
        wait.until(ExpectedConditions.visibilityOf(addFree));
        addFree.click();

    }

    private void goCashbox() {
        wait.until(ExpectedConditions.visibilityOf(goCashbox));
        goCashbox.click();

    }








    public void makeOrder(String shovelName,String seedsName,String seedsQuantity) {
        searchShovel(shovelName);
        addShovel();
        searchSeeds(seedsName);
        checkSeeds();
        addSeeds(seedsQuantity);
        freeSeeds();
        addFree();
        goCashbox();

    }








}


