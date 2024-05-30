package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);

    @Test
    public void registerFill() {

        String fName = "Andrei";
        String lName = "Popescu";
        String phone = "724370346";
        String email = "test_klekt@mail.com";
        String pass = "Adidasi45)";

        sleep(3000);
        LOG.info("Click 'Accept' cokies");
        registerPage.clickAcceptCokies();

        LOG.info("Click 'user' icon");
        registerPage.clickUserIcon();

        LOG.info("Click 'Sign up' button");
        registerPage.clickSignUp();

        sleep(3000);

        LOG.info("Move mouse over 'First Name'");
        registerPage.moveOnFNametxt();

        LOG.info("Input 'First Name' field");
        registerPage.inputFirstLastName(fName, lName, phone, email, pass);

        LOG.info("Check if 'email' error message is displayed");
        Assert.assertTrue(registerPage.checkErrorMessage(), "Email error message is not displayed");

        sleep(5000);


    }
}
