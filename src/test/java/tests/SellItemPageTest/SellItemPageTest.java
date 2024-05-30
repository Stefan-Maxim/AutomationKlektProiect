package tests.SellItemPageTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class SellItemPageTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SellItemPageTest.class);

    @Test

    public void sellItem() {

        String email = "test_klekt@mail.com";
        String password = "Adidasi45)";
        String Sku = "DH6927-017";
        String price = "350";
        String cityy = "Constanta";
        String regionn = "Constanta";
        String postcodee = "900098";
        String flatt = "Austrului 4";


        LOG.info("Click 'accept' cockies");
        addToCart.clickAcceptCokies();

        LOG.info("Click user icon");
        addToCart.clickUserIcon();

        LOG.info("Click 'Log in ' tab");
        addToCart.clickLogIn();


        LOG.info("Move mouse");
        addToCart.moveEmailtxt();


        LOG.info("Input 'email and pass' field than Log");
        addToCart.inputEmail(email, password);

        sleep(3000);

        LOG.info("Click 'SELL' button");
        sellItemPage.clickSellButton();

        LOG.info("Search 'Item' by sku");
        sellItemPage.sendSKU(Sku);

        LOG.info("Submit item for selling");
        sellItemPage.submitItem(price);

        LOG.info("Check if size is displayed");
        Assert.assertTrue(sellItemPage.checkSize(), "Size is not displayed");

        LOG.info("Check is quantity is displayed");
        Assert.assertTrue(sellItemPage.checkQuantity(), "Quantity is not displayed");

        LOG.info("Finish selling process");
        sellItemPage.finishSelling(cityy, regionn, postcodee, flatt);

        LOG.info("Go back to hone page");
        sellItemPage.goToHomePage();


        sleep(5000);
    }
}
