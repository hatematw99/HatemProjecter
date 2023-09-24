import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AcademyTest extends Setup {
    @Test
    public void setUp() {
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.get("https://academy.famcare.app/");
    }

    //تحقق ايقونة الجانب النفسي
    @Test(priority = 1)
    public void CheckthepSychologicalaSpectIcon() {
        WebElement palaeontological = Setup.driver.findElement(By.xpath("/html/body/main/div/div/div/div/section[2]/div[2]/div/div/section[2]/div/div[1]/div/div/div/a/div/div/div[1]/figure"));
        Assert.assertTrue(palaeontological.isDisplayed());
    }
    //تحقق من ايقونة الجانب الاجتماعي
    @Test(priority = 2)
    public void Checkthesocialaspecticon() {
        WebElement overspecialisation = Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[2]/div[2]/div/div/section[2]/div/div[2]/div/div"));
        Assert.assertTrue(overspecialisation.isDisplayed());
    }
    //تجقق من الجانب التربوي
    @Test(priority = 3)
    public void Checktheeducationalaspecticon() {
        WebElement educational = Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[2]/div[2]/div/div/section[2]/div/div[3]"));
        Assert.assertTrue(educational.isDisplayed());
    }
    //تجقق من ايقونة للممارسين
    @Test(priority = 4)
    public void Checkpractitionersicon() {
        WebElement practitionersicon = Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[2]/div[2]/div/div/section[2]/div/div[4]/div/div"));
        Assert.assertTrue(practitionersicon.isDisplayed());
    }
    //الحصول ع زر تسجيل الدخول
    @Test(priority = 5)
    public void  GetLoginButton(){
        WebElement getlogin = Setup.driver.findElement(By.xpath("/html/body/header/div[3]/div/div[1]/div/div/div[3]/div/div[2]/span/a[1]"));
        Assert.assertTrue(getlogin.isDisplayed());
    }
    //وجود بكس بالاعلى
    @Test(priority = 6)
    public void CheckifThereIsaBoxAbove() {
        WebElement thereisboxabove = Setup.driver.findElement(By.xpath("/html/body/header/div[3]/div/div[1]/div/div/div[1]/div/div"));
        Assert.assertTrue(thereisboxabove.isDisplayed());
    }
    //تاكد وجود المختصين
    @Test(priority = 7)
    public void MakesureThereareSpecialists() {
        WebElement overspecialisation = Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[3]/div/div/div/div[3]"));
        Assert.assertTrue(overspecialisation.isDisplayed());
    }
    //وجود نص كيف تحصل على الشهادة بالاسف
    @Test(priority = 8)
    public void ThereisaTextonHowtoobTainacertificateunForTunately() {
        WebElement obtainacertificateunfortunately = Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[5]/div[2]/div[2]/div/div[2]/div/p/strong"));
        Assert.assertTrue(obtainacertificateunfortunately.isDisplayed());
    }
    //قائمة المدربين
    @Test(priority = 9)
    public void CheckForTheTrainersIcon() {
        WebElement containerisation = Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[7]/div/div/div/div[1]"));
        Assert.assertTrue(containerisation.isDisplayed());
    }
    //تحقق من زر تطبيق فامكير للاندرويد
    @Test(priority = 10)
    public void ChecktheFamcareAppButtonforAndroid() {
        WebElement buttonbarAndroid = Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[11]/div[2]/div/div/section/div/div[2]/div/div[3]/div/div/a"));
        Assert.assertFalse(buttonbarAndroid.isDisplayed());
    }
    //تحقق من زر تطبيق فامكير للايفون
    @Test(priority = 11)
    public void CheckmateCarePhonetician() {
        WebElement iPhonetician = Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[11]/div[2]/div/div/section/div/div[2]/div/div[4]/div/div/a"));
        Assert.assertFalse(iPhonetician.isDisplayed());
    }
    //ظهور صورة الموقع بالاسفل
    @Test(priority = 12)
    public void Checkoutthesitephotosbelow() {
        WebElement photospheres = Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[11]/div[2]/div/div/section/div/div[1]/div/div/div/img"));
        Assert.assertFalse(photospheres.isDisplayed());
    }
    //تحقق من ظهور المعتمدين بالاسفل
    @Test(priority = 13)
    public void Checktheappearanceofapprovedusersbelow() {
        WebElement approvedusersbelow = Setup.driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/section[10]/div[2]/div/div"));
        Assert.assertTrue(approvedusersbelow.isDisplayed());
    }
    //تحقق من النقر على زر تسجيل الدخول يفتح صفحة تسجيل الدخول
    @Test(priority = 14)
    public void verifyClickingLoginButtonOpensSignInPage(){
        WebElement pageTitle = Setup.driver.findElement(By.xpath("/html/body/header/div[3]/div/div[1]/div/div/div[3]/div/div[2]/span/a[1]"));
        Assert.assertTrue(pageTitle.isDisplayed());
    }
    //تحقق من زر
    @Test(priority = 15)
    public void Verifythatthenewregistrationbuttontextiscorrect(){
        WebElement registration = Setup.driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[7]/button"));
        Assert.assertFalse(registration.isDisplayed());
    }
    @Test(priority = 16)
    public void Checktheloginbutton(){
        WebElement loginbutton = Setup.driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/button"));
        Assert.assertFalse(loginbutton.isDisplayed());
    }
    //تحقق من زر نسيت كلمة المرور
    @Test(priority = 17)
    public void ChecktheForgotPasswordbutton() {
        WebElement forgotpassbutoon = Setup.driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/a"));
        Assert.assertTrue(forgotpassbutoon.isDisplayed());
    }
    //تحقق من زر الاشتراك بنشراتنا
    @Test(priority = 18)
    public void Checkoutthesubscribebuttonforournewsletters(){
        WebElement forournewsletters = Setup.driver.findElement(By.xpath("//*[@id=\"mailchimp_woocommerce_newsletter\"]"));
        Assert.assertFalse(forournewsletters.isDisplayed());
    }

}
