package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() throws IOException {
        Properties props = new Properties();
        props.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
        boolean headless = Boolean.parseBoolean(props.getProperty("headless", "true"));

        ChromeOptions options = new ChromeOptions();

        if (headless) {
            options.addArguments("--headless=new");
        }

        driver = new ChromeDriver(options);

        driver.get("http://localhost:8080");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
