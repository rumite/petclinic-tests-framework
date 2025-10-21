import helper.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UITest extends BaseTest {

    @Before
    public void setUpTest() {
        setUp();
        driver.get("http://localhost:8080");
    }

    @Test
    public void mainPageTitleTest() {
        String title = driver.getTitle();
        assertEquals("PetClinic :: a Spring Framework demonstration", title);
    }

    @After
    public void tearDownTest() {
        tearDown();
    }
}
