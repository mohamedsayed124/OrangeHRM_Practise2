import com.shaft.driver.SHAFT;
import org.testng.annotations.*;

public class BaseTest {
    SHAFT.GUI.WebDriver driver;
    @BeforeClass
    public void setup() {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
