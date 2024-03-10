package pages.AddToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class AddToCart extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(AddToCart.class);
    public static AddToCart instance;

    private AddToCart() {
    }

    public static AddToCart getInstance() {
        AddToCart instance = null;
        if (instance == null) {
            instance = new AddToCart();
        }
        return instance;
    }
    private By clickLogIn = By.xpath("//div[text()='Log In']");
    private By clkUserIcon = By.xpath("//*[local-name()='svg' and @class='user-icon-custom']");
    private By acceptCokies = By.id("rcc-confirm-button");
    private By emailTxt = By.xpath("//label[text()='Email']");
    private By emailField = By.xpath("//input[@placeholder='Email...']");
    private By passField = By.xpath("//input[@type='password']");
    private By clickLogIn2 = By.xpath("//button[text()='Log In']");
    private By clickSneakers = By.xpath("//a[text()='SNEAKERS']");
    private By slectAirJordanBrand = By.xpath("//a[@class='c-accordion__title']/div[text()='Air Jordan']");
    private By selectJordan12 = By.xpath("//a[text()='Jordan 12']");
    private By select12PlayOff= By.xpath("//a[@aria-label='12 Playoffs (2022)']");
    private By selectSize11 = By.xpath("//label[@for='31']");
    private By clickSize=By.xpath("//div[text()='Size']");
    private By clickSize11 = By.xpath("//span[text()='US11']");
    private By buyNow = By.xpath("//button[@class='c-btn u-materia-primary1-1000-fg  c-btn--naked u-flex u-flex--justify-center u-cursor c-btn--block pdp-buy-button u-margin-bottom-small u-subheader ']");
    private By removeAccesory = By.xpath("//p[@class='crep-quantity-minus u-margin-none ']");
    private By shippingDetails = By.xpath("//p[text()='Shipping Details']");
    private By shippingAdresManualy = By.xpath("//p[text()='Enter Address Manually']");
    private By streetLine = By.xpath("//input[@placeholder='Flat and / or house number and street name']");
    private By city = By.xpath("//input[@placeholder='City']");
    private By province = By.xpath("//input[@placeholder='Province']");
    private By codPostal = By.xpath("//input[@placeholder='Postcode']");
    private By selectShipping = By.xpath("//button[text()='Shipping']");
    private By paymentMethod = By.xpath("//div[text()='Select']");
    private By chooseCard = By.xpath("//div[@aria-label='Paying with Card']");
    private By havePromoCode = By.xpath("//label[@for='promo-checkbox']");



    public void clickAcceptCokies() {
        LOG.info("click accept cokies");
        driver.findElement(acceptCokies).click();
    }

    public void clickUserIcon() {
        LOG.info("Click user icon");
        driver.findElement(clkUserIcon).click();
    }

    public void clickLogIn() {
        LOG.info("Click 'Log in' tab");
        driver.findElement(clickLogIn).click();
    }

    public void moveEmailtxt() {
        LOG.info("Move mouse");
        WebElement ele = driver.findElement(By.xpath("//label[text()='Email']"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
    }

    public void inputEmail(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passField).sendKeys(password);
        driver.findElement(clickLogIn2).click();
    }

    public void selectProduct(){
        LOG.info("click 'SNEAKERS' tab");
        driver.findElement(clickSneakers).click();
    }

    public void selectAirJordaan(){
        LOG.info("Select AirJordan brand");
        driver.findElement(slectAirJordanBrand).click();
        driver.findElement(selectJordan12).click();
    }

    public void selectPlayOff(){
        LOG.info("Select 'PlayOff' model, size 11");
        driver.findElement(clickSize).click();
        driver.findElement(selectSize11).click();
        driver.findElement(select12PlayOff).click();
    }

    public boolean checkSize11(){
        LOG.info("Check if size 11 is available");
        return driver.findElement(clickSize11).isDisplayed();
    }

    public void addToCartJ12(){
        LOG.info("add 'J12' size 11us to cart");
        driver.findElement(clickSize11).click();
        driver.findElement(buyNow).click();
    }

    public void popUpAccesories(String adresa, String oras, String provincie, String postal){
        LOG.info("Remove accesosries");
        driver.findElement(removeAccesory).click();
//        driver.findElement(shippingDetails).click();
//        driver.findElement(shippingAdresManualy).click();
//        driver.findElement(streetLine).sendKeys(adresa);
//        driver.findElement(city).sendKeys(oras);
//        driver.findElement(province).sendKeys(provincie);
//        driver.findElement(codPostal).sendKeys(postal);
//        driver.findElement(selectShipping).click();
        driver.findElement(paymentMethod).click();
    }

    public void payMethod() {
        LOG.info("Select 'Payment' method");
        driver.findElement(chooseCard).click();
        driver.findElement(havePromoCode).click();
    }




}
