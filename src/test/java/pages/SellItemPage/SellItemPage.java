package pages.SellItemPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import static pages.BasePage.sleep;

public class SellItemPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SellItemPage.class);
    public static SellItemPage instance;

    private SellItemPage(){
    }

    public static SellItemPage getInstance() {
        SellItemPage instance = null;
        if (instance == null) {
            instance = new SellItemPage();
        }
        return instance;
    }

    private By sellButton = By.xpath("//a[@class='u-cursor sell-button']");
    private By searchSellBar = By.xpath("//input[@placeholder='Search by SKU or Product Name']");
    private By selectItem = By.xpath("//div[@class='c-product-pod-sell-search']");
    private By selectUsSize = By.xpath("//div[text()='Select US size']");
    private By uS11 = By.xpath("//div[text()='US11']");
    private By inputPrice = By.xpath("//input[@placeholder='Enter your price']");
    private By selectPeriod = By.xpath("//div[@class='c-react-select__single-value']");
    private By select1Month= By.xpath("//div[text()='1 month']");
    private By clickPreview = By.xpath("//button[text()='Preview']");
    private By checkSize = By.xpath("//span[text()='US11']");
    private By checkQuantity = By.xpath("//p/span[text()='1']");
    private By clcikNextStep = By.xpath("//button[text()='Next step']");
    private By enterAdresMan = By.xpath("//p[text()='Enter Address Manually']");
    private By city = By.xpath("//input[@placeholder='City']");
    private By region = By.xpath("//input[@placeholder='Province']");
    private By postcod = By.xpath("//input[@placeholder='Postcode']");
    private By flat = By.xpath("//input[@placeholder='Flat and / or house number and street name']");
    private By homePage = By.id("top");



    public void clickSellButton(){
        LOG.info("Click 'SELL' button");
        driver.findElement(sellButton).click();
    }

    public void sendSKU(String Sku){
        LOG.info("Search 'Item' by sku");
        driver.findElement(searchSellBar).sendKeys(Sku);
        sleep(2000);
        driver.findElement(selectItem).click();

    }

    public void submitItem(String price){
        LOG.info("Submit item for sale");
        driver.findElement(selectUsSize).click();
        sleep(2000);
        driver.findElement(uS11).click();
        driver.findElement(inputPrice).sendKeys(price);
        sleep(2000);
        driver.findElement(selectPeriod).click();
        sleep(2000);
        driver.findElement(select1Month).click();
        driver.findElement(clickPreview).click();
    }

    public boolean checkSize(){
        LOG.info("Check if size is displayed");
        return driver.findElement(checkSize).isDisplayed();
    }

    public boolean checkQuantity(){
        LOG.info("Check if quantity is dispalyed");
        return driver.findElement(checkQuantity).isDisplayed();
    }

    public void finishSelling(String cityy, String regionn, String postcodee, String flatt){
        LOG.info("Finish the selling process");
        driver.findElement(clcikNextStep).click();
        driver.findElement(enterAdresMan).click();
        driver.findElement(city).sendKeys(cityy);
        driver.findElement(region).sendKeys(regionn);
        driver.findElement(postcod).sendKeys(postcodee);
        driver.findElement(flat).sendKeys(flatt);
        sleep(4000);
    }

    public void goToHomePage(){
        LOG.info("Go back to home page");
        driver.findElement(homePage).click();
    }
}
