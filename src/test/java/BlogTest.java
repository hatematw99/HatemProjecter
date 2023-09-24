import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BlogTest extends Setup {
    @Test
    public void setUp() {
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.get("https://famcare.app/blog-2/");
    }

    //تاكد من وجود نص
    @Test(priority = 1)
    public void ThePresenceofText() {
        WebElement telepresence = Setup.driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-34f5d9198a8f91e8\"]/div[3]/div/div[1]/div/a"));
        Assert.assertTrue(telepresence.isDisplayed());
    }
    //تاكم من وجود صورة
    @Test(priority = 2)
    public void HavingAnImage(){
        WebElement animate = Setup.driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-34f5d9198a8f91e8\"]/div[3]/div/div[2]/div/img"));
        Assert.assertFalse(animate.isDisplayed());
    }
    //تحقق من ايقونة بحث المدونة
    @Test(priority = 3)
    public void BlogSearchIcon() {
        WebElement searching = Setup.driver.findElement(By.xpath("/html/body/section[2]/div/form/div/div[1]/div/input"));
        Assert.assertTrue(searching.isDisplayed());
    }
    //تحقق من زر بحث
    @Test(priority = 4)
    public void CheckTheSearchButton() {
        WebElement searchebutton = Setup.driver.findElement(By.xpath("/html/body/section[2]/div/form/div/div[3]/div/button"));
        Assert.assertTrue(searchebutton.isDisplayed(), "بحـــث");
    }
    //زر جميع التصنيفات
    @Test(priority = 5)
    public void AllCategoriesIcon() {
        WebElement categorization = Setup.driver.findElement(By.xpath("//*[@id=\"search-all-categories\"]"));
        Assert.assertTrue(categorization.isDisplayed());
    }
    //تحقق من زر تفاصيل
    @Test(priority = 6)
    public void ChecktheDetailsButton() {
        WebElement Detailsbutton = Setup.driver.findElement(By.xpath("/html/body/section[3]/div/div/article[1]/div[2]/div[2]/div/a"));
        Assert.assertTrue(Detailsbutton.isDisplayed());
    }
    //تحقق من زر عرض المزيد
    @Test(priority = 7)
    public void CheckOuttheShowMoreButton() {
        WebElement theshow = Setup.driver.findElement(By.xpath("/html/body/section[3]/div/div/a/span"));
        Assert.assertTrue(theshow.isDisplayed());
    }
    // تحقق من عرض رمز الاستغرام
    @Test(priority = 8)
    public void CheckwhethertheinstagramIconisdisplayed() {
        WebElement Instagramiconisd = Setup.driver.findElement(By.xpath("/html/body/footer/div[2]/div/div/div[2]/ul/li[2]/a"));
        Assert.assertTrue(Instagramiconisd.isDisplayed());
    }
    // تحقق من عرض رمز تويتر
    @Test(priority = 9)
    public void CheckthewidtofThetwittericon() {
        WebElement Twitterizer = Setup.driver.findElement(By.xpath("/html/body/footer/div[2]/div/div/div[2]/ul/li[1]/a"));
        Assert.assertTrue(Twitterizer.isDisplayed());
    }
    //تحقق من أن النقر على الايميل يفتح البريد
    @Test(priority = 10)
    public void Verifythatclickingontheemailopensthemail() {
        WebElement clickingontheemail = Setup.driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/div[2]/div[1]/div[2]/a"));
        Assert.assertTrue(clickingontheemail.isDisplayed());
    }




}
