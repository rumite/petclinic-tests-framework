package helper;

import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver = null;

    public void setUp() {
        driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.manage().window().maximize();
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
