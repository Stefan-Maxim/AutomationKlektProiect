package pages.RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage(){
    }

    public static RegisterPage getInstance(){
        RegisterPage instance = null;
        if (instance == null){
            instance = new RegisterPage();
        }
        return instance;
    }

    private By acceptCokies = By.id("rcc-confirm-button");
    private By clkUserIcon = By.xpath("//*[local-name()='svg' and @class='user-icon-custom']");
    private By clickSignUp = By.xpath("//div[text()='Sign Up']");
    private By inputFirstName = By.xpath("//input[@name='firstName']");
    private By inputLastName = By.xpath("//input[@name='lastName']");
    private By inputPhone = By.xpath("//input[@type='tel']");
    private By inputEmail = By.xpath("//input[@name='email' and @placeholder='']");
    private By inputPass = By.xpath("//input[@name='password']");
    private By clickCheckBox = By.xpath("//label[@for='checkbox-label-1']");
    private By clickFinalSignUp = By.xpath("//button[text()='Sign Up']");
    private By chekErrorMsg = By.xpath("//p[text()='The email address is not available.']");


    public void clickAcceptCokies() {
        LOG.info("click accept cokies");
        driver.findElement(acceptCokies).click();
    }

    public void clickUserIcon() {
        LOG.info("Click user icon");
        driver.findElement(clkUserIcon).click();
    }

    public void clickSignUp(){
        LOG.info("Click 'Sign up' button");
        driver.findElement(clickSignUp).click();
    }

    public void moveOnFNametxt() {
        LOG.info("Move mouse");
        WebElement elem = driver.findElement(By.xpath("//label[text()='First name']"));
        Actions action = new Actions(driver);
        action.moveToElement(elem).perform();
    }

    public void inputFirstLastName(String fName, String lName, String phone, String email, String pass){
        LOG.info("Input 'First Name' field");
        driver.findElement(inputFirstName).sendKeys(fName);
        driver.findElement(inputLastName).sendKeys(lName);
        driver.findElement(inputPhone).sendKeys(phone);
        driver.findElement(inputEmail).sendKeys(email);
        driver.findElement(inputPass).sendKeys(pass);
        driver.findElement(clickCheckBox).click();
        driver.findElement(clickFinalSignUp).click();
    }

    public boolean checkErrorMessage(){
        LOG.info("Check if the 'email' error message is displayed");
        return driver.findElement(chekErrorMsg).isDisplayed();
    }
}
