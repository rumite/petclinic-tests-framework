package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // STRINGS
    public static final String PAGE_TITLE = "PetClinic :: a Spring Framework demonstration";

    // LOCATORS

    // METHODS
    public void verifyTitle(String expectedTitle) {
        String title = driver.getTitle();
        if (!title.equals(expectedTitle)) {
            throw new AssertionError("Title does not match. Expected: " + expectedTitle + ", but got: " + title);
        }
    }
}
