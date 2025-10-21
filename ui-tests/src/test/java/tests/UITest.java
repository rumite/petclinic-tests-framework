package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UITest extends BaseTest {

    @Test
    public void mainPageTitleTest() {
        String title = driver.getTitle();
        Assert.assertEquals(title,"PetClinic :: a Spring Framework demonstration");
    }
}
