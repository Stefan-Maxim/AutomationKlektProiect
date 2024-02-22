package pages.SignInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        SignInPage instance = null;
        if (instance == null) {
            instance = new SignInPage();

        }
        return instance;
    }

    private By clickLogIn = By.xpath("//div[text()='Log In']");
    private By clkUserIcon = By.xpath("//*[local-name()='svg' and @class='user-icon-custom']");
    private By acceptCokies = By.id("rcc-confirm-button");
    private By emailTxt = By.xpath("//label[text()='Email']");
    private By emailField = By.xpath("//input[@placeholder='Email...']");


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

    public void inputEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }


}