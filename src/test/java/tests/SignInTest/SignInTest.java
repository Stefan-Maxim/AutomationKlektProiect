package tests.SignInTest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;


public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() {


        String email = "nimic@yahoo.com";

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

        LOG.info("Input 'email' field");
        signInPage.inputEmail(email);


    }
}