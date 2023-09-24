import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SpecialistsTesting extends Setup {
    @Test
public void setUp() {
    //Initialize driver
    ChromeOptions options = new ChromeOptions();
    options.addArguments("start-maximized");
    driver = WebDriverManager.chromedriver().capabilities(options).create();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    wait = new WebDriverWait(driver, Duration.ofSeconds(1));
    driver.get("https://famcare.app/specialists/");
}
    //ظهور صورة للاخصائي
    @Test(priority = 1)
    public void CheckThePresencePhototherapySpecialist() {
        WebElement overspecialisation = Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/a/img"));
        Assert.assertFalse(overspecialisation.isDisplayed());
    }
    //ظهور الاسم تحت الصورة
    @Test(priority = 2)
    public void TheNameAppearsUnderThePicture() {
        WebElement AppearsUnder = Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/h2/a"));
        Assert.assertTrue(AppearsUnder.isDisplayed());
    }
    @Test(priority = 3)
    public void ShowTheSpecialistIDevaluation() {
        WebElement overspecialisation = Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/span"));
        Assert.assertFalse(overspecialisation.isDisplayed());
    }
    //حجز موعد
    @Test(priority = 4)
    public void appointmentBookingButtonsVisible() {
        WebElement indivisibles = Setup.driver.findElement(By.xpath("//*[@id=\"bookNow\"]"));
        Assert.assertFalse(indivisibles.isDisplayed(), "حجز موعد");
    }
    //زر عرض المزيد
    @Test(priority = 5)
    public void ShowMoreButton() {
        WebElement morebutton = Setup.driver.findElement(By.xpath("/html/body/div[1]/a/div"));
        Assert.assertFalse(morebutton.isDisplayed(), "عرض المزيد");
    }
    //ظهور ايقونة حمل التطبيق
    @Test(priority = 6)
    public void Theapplicationdownloadiconappears() {
        WebElement dognapper = Setup.driver.findElement(By.xpath("//*[@id=\"stepsSection\"]/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div[1]/h4"));
        Assert.assertFalse(dognapper.isDisplayed());
    }
    @Test(priority = 7)
    public void Findaspecialist() {
        WebElement aspecialist = Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/label/input"));
        Assert.assertTrue(aspecialist.isDisplayed());
    }

}
