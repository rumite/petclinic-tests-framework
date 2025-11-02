package tests;

import config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(BaseTest.class);
    String baseUrl = Config.getBaseUrl();

    @BeforeMethod
    public void setUp() {
        boolean headless = Boolean.parseBoolean(Config.getProperty("headless"));

        ChromeOptions options = new ChromeOptions();

        if (headless) {
            logger.info("Running in headless mode.");
            options.addArguments("--headless=new");
        }

        driver = new ChromeDriver(options);

        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
