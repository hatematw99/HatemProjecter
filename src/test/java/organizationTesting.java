import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class organizationTesting extends Setup {
    @Test
    public void setUp() {
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.get("https://famcare.app/%d9%81%d8%a7%d9%85%d9%83%d9%8a%d8%b1-%d9%84%d9%84%d9%85%d9%86%d8%b8%d9%85%d8%a7%d8%aa/");
    }
    //تحقق وجود نص
    @Test(priority = 1)
    public void MakeSureThereIsText() {
        WebElement theretext = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[1]/div/div[2]/h2"));
        Assert.assertTrue(theretext.isDisplayed());
    }
    //تحقق وجود صورة
    @Test(priority = 2)
    public void Checkifhereisanimage() {
        WebElement animate = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[2]/div/div[2]/img"));
        Assert.assertTrue(animate.isDisplayed());
    }
    @Test(priority = 3)
    public void ChecktheRequestServicebutton() {
        WebElement RequestService = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[2]/button"));
        Assert.assertTrue(RequestService.isDisplayed());
    }


}


