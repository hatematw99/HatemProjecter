import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestWhoWeAre extends Setup {
    @Test
    public void setUp() {
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.get("https://famcare.app/%d9%85%d9%86-%d9%86%d8%ad%d9%86/");
    }
    //وجود نص بالصفحة
    @Test(priority = 1)
    public void MakeSSureThereIsText() {
        WebElement thereText = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[1]/div/div[2]"));
        Assert.assertTrue(thereText.isDisplayed());
    }
    //وجود صورة بالصفحة
    @Test(priority = 2)
    public void CheckerMismanage() {
        WebElement animate = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[2]/div/div/img"));
        Assert.assertTrue(animate.isDisplayed());
    }
    //تحقق من نص انضم كمستشار
    @Test(priority = 3)
    public void TextTeleconsultation() {
        WebElement sultation = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[3]/div"));
        Assert.assertTrue(sultation.isDisplayed());
    }
    //تحقق من نص قيمتنا
    @Test(priority = 4)
    public void OurValueText() {
        WebElement ValueText = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div"));
        Assert.assertTrue(ValueText.isDisplayed());
    }
    //تحقق من نص رؤيتنا
    @Test(priority = 5)
    public void Contextualisation() {
        WebElement ligation = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[1]"));
        Assert.assertTrue(ligation.isDisplayed());
    }
    // تحقق لوجود صورة لتطبيق بالاسفل
    @Test(priority = 6)
    public void Checkforanapplicationimagebelow() {
        WebElement licationimage = Setup.driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[2]/div/div[2]/img"));
        Assert.assertTrue(licationimage.isDisplayed());
    }
    // تحقق من عرض زر اشتراك

    //تحقق من أن النقر على الايميل يفتح البريد
    @Test(priority = 8)
    public void Verifythatclickingontheemailopensthemail() {
        WebElement clickingontheemail = Setup.driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/div[2]/div[1]/div[2]/a"));
        Assert.assertTrue(clickingontheemail.isDisplayed());
    }

}

