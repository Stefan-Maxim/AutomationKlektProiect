package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp(){
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver" , "C://WebDrivers/chromedriver121.exe");
        driver = new ChromeDriver();
        String url = "https://www.klekt.com/";
        driver.get(url);
        LOG.info("Open browser maximize");
        driver.manage().window().maximize();
    }

    public static void tearDown(){
        LOG.info ("Close the browser");
        driver.quit();
    }

    public static String returnBaseUrl(){
        return "https://www.klekt.com/";
    }

    public static String getBaseUrl(){
        String BaseUrl = returnBaseUrl();
        if (BaseUrl != null){
            return BaseUrl.replace("Index.html"," ");
        }
        return BaseUrl;

    }
}
