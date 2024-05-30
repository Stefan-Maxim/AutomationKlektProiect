package tests.SignInTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;


public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() {


        String email = "test_klekt@mail.com";
        String password = "Adidasi45)";

        sleep(3000);
        LOG.info("Click 'accept' cockies");
        signInPage.clickAcceptCokies();

        LOG.info("Click user icon");
        signInPage.clickUserIcon();

        LOG.info("Click 'Log in ' tab");
        signInPage.clickLogIn();

        sleep(3000);

        LOG.info("Move mouse");
        signInPage.moveEmailtxt();

        sleep(3000);

        LOG.info("Input 'email and pass' field than Log");
        signInPage.inputEmail(email, password);

        sleep(3000);

        LOG.info("Check profile info");
        signInPage.checkProfile();

        LOG.info("Check if the name is displayed");
        Assert.assertTrue(signInPage.checkNameOnProfile(), "Name is not displayed");

        sleep(5000);


    }
}