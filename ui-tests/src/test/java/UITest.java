import helper.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UITest extends BaseTest {

    @BeforeMethod
    public void setUpTest() {
        setUp();
        driver.get("http://localhost:8080");
    }

    @Test
    public void mainPageTitleTest() {
        String title = driver.getTitle();
        Assert.assertEquals(title,"PetClinic :: a Spring Framework demonstration");
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}
