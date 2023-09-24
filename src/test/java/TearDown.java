import org.testng.annotations.AfterClass;

public class TearDown {
    @AfterClass
    public void tearDown() {
        Setup.driver.quit();
    }
}
