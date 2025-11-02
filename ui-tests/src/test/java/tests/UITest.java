package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class UITest extends BaseTest {

    @Test
    public void mainPageTitleTest() {
        HomePage homePage = new HomePage(driver);
        homePage.verifyTitle(HomePage.PAGE_TITLE);
    }




}
