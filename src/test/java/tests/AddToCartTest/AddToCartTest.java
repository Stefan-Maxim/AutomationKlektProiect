package tests.AddToCartTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class AddToCartTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(AddToCartTest.class);

    @Test
    public void addToCart(){

        String email = "test_klekt@mail.com";
        String password = "Adidasi45)";
        String adresa = "Aleea Austrului 4";
        String oras = "Constanta";
        String provincie = "Constanta";
        String postal = "900098";

        sleep(3000);
        LOG.info("Click 'accept' cockies");
        addToCart.clickAcceptCokies();

        LOG.info("Click user icon");
        addToCart.clickUserIcon();

        LOG.info("Click 'Log in ' tab");
        addToCart.clickLogIn();

        sleep(3000);

        LOG.info("Move mouse");
        addToCart.moveEmailtxt();

        sleep(3000);

        LOG.info("Input 'email and pass' field than Log");
        addToCart.inputEmail(email, password);

        sleep(3000);

        LOG.info("Select product to add to cart");
        addToCart.selectProduct();

        sleep(3000);

        LOG.info("Select 'AirJordan' brand");
        addToCart.selectAirJordaan();

        sleep(2000);

        LOG.info("Select 'Play off' model");
        addToCart.selectPlayOff();

        sleep(2000);

        LOG.info("Check if size 11 is available");
        Assert.assertTrue(addToCart.checkSize11(), "Size in not available");

        LOG.info("Add j12 size 11 to cart");
        addToCart.addToCartJ12();

        sleep(15000);

        LOG.info("Remove accesories");
        addToCart.popUpAccesories(adresa, oras, provincie, postal);

        sleep(5000);

        LOG.info("Select 'payment' method");
        addToCart.payMethod();




        sleep(5000);

    }
}
