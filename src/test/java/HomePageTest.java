import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTest extends Setup{
    WebElement loginButton;
    WebElement gmailButton;
    @Test
    public void setUp() {
        //Initialize driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = WebDriverManager.chromedriver().capabilities(options).create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.get("https://famcare.app/");
    }
    //التحقق من أن الشاشة الرئيسية تم فتحها بنجاح
    @Test(priority = 1)
    public void verifyThatHomeScreenIsOpenedSuccessfully() {
        WebElement heroSection = Setup.driver.findElement(By.id("heroSection"));
        Assert.assertTrue(heroSection.isDisplayed());
    }


    // تحقق من عرض زر الكاديمية
    @Test(priority = 2)
    public void verifyThatAcademyButtonIsDisplayed() {
        WebElement academyButton = Setup.driver.findElement(By.xpath("//a[@title='الأكاديمية']"));
        Assert.assertTrue(academyButton.isDisplayed());
    }

    // تحقق من عرض زر المدونة
    @Test(priority = 3)
    public void Checkthewidthoftheblogbutton() {
        WebElement blogbutton = Setup.driver.findElement(By.xpath("//*[@id=\"menu-item-2633\"]/a"));
        Assert.assertTrue(blogbutton.isDisplayed());
    }

    // تحقق من عرض زر المنظمات
    @Test(priority = 4)
    public void VerifythattheOrganizationsbuttonisdisplayed() {
        WebElement visitorganizations = Setup.driver.findElement(By.xpath("//*[@id=\"menu-item-2633\"]/a"));
        Assert.assertTrue(visitorganizations.isDisplayed());
    }

    // تحقق من عرض زر الاخصائيين
    @Test(priority = 5)
    public void ChecktheViewSpecialistsbutton() {
        WebElement specialistsbutton = Setup.driver.findElement(By.xpath("//*[@id=\"menu-item-1026\"]/a"));
        Assert.assertTrue(specialistsbutton.isDisplayed());
    }

    // تحقق من عرض زر فامكير
    @Test(priority = 6)
    public void CheckthedisplayoftheFamCarebutton() {
        WebElement famcarebutton = Setup.driver.findElement(By.xpath("//*[@id=\"menu-item-1026\"]/a"));
        Assert.assertTrue(famcarebutton.isDisplayed());
    }

    // تحقق من عرض زر انضم كاخصائي
    @Test(priority = 7)
    public void ChecktheViewJoinasSpecialistbutton() {
        WebElement joinasspecialistbutton = Setup.driver.findElement(By.xpath("//*[@id=\"navbarContent\"]/button"));
        Assert.assertTrue(joinasspecialistbutton.isDisplayed());
    }

    //تحقق من عرض زر من نحن
    @Test(priority = 8)
    public void VerifyButtonViewAboutUs() {
        WebElement viewaboutus = Setup.driver.findElement(By.xpath("//*[@id=\"menu-item-188\"]/a"));
        Assert.assertTrue(viewaboutus.isDisplayed());
    }

    //التاكد من زر احجز جلستك
    @Test(priority = 9)
    public void ChecktheBookYourFirstSessionbutton() {
        WebElement firstsessionbutton = Setup.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[3]/a"));
        Assert.assertTrue(firstsessionbutton.isDisplayed());
    }

    //التاكد من وجود نص
    @Test(priority = 10)
    public void MakeSureThereIsText() {
        WebElement suretheistext = Setup.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
        Assert.assertTrue(suretheistext.isDisplayed());
    }

    //التاكد من وجود صورة
    @Test(priority = 11)
    public void MakeSureThereIsAnImage() {
        WebElement surethereisimage = Setup.driver.findElement(By.xpath("//*[@id=\"heroSection\"]/div/div/div[1]/div/div[1]/img"));
        Assert.assertTrue(surethereisimage.isDisplayed());
    }

    //زر حجز موعد
    @Test(priority = 12)
    public void AppointmentBookingButtonIsVisible() {
        WebElement bookingbutton = Setup.driver.findElement(By.xpath("//*[@id=\"bookNow\"]"));
        Assert.assertFalse(bookingbutton.isDisplayed(), "حجز موعد");
    }

    //اظهار زر تواصل معنا
    @Test(priority = 13)
    public void ShowtheContactNowbutton() {
        WebElement contactnowbutton = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[4]/div/div/div/a"));
        Assert.assertTrue(contactnowbutton.isDisplayed());
    }

    //ظهور ايقونة حمل التطبيق
    @Test(priority = 14)
    public void TheApplicationDownloadIconAppears() {
        WebElement downloadiconappwars = Setup.driver.findElement(By.xpath("//*[@id=\"stepsSection\"]/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div[1]/h4"));
        Assert.assertFalse(downloadiconappwars.isDisplayed());
    }

    //تاكد من وجود نص بجوار الصورة
    @Test(priority = 15)
    public void Makesurethereistextnexttotheimage() {
        WebElement textnexttotheimage = Setup.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
        Assert.assertTrue(textnexttotheimage.isDisplayed(), "ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم");
    }

    //ظهور التطبيقات المتعددة
    @Test(priority = 16)
    public void Approvedapplicationsappear() {
        WebElement applicationsappear = Setup.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
        Assert.assertTrue(applicationsappear.isDisplayed(), "تطبيق معتمد من الجهات الرسمية");
    }

    //ظهور اسماء المتخصصين المرشحين
    @Test(priority = 17)
    public void Thenamesofthenominatedspecialistsappear() {
        WebElement specialistsappear = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]/h2"));
        Assert.assertFalse(specialistsappear.isDisplayed());
    }
    // تحقق من عرض زر الملف الشخصي
    @Test(priority = 17)
    public void Checkiftheprofilebuttonisdisplayed() {
        WebElement profilebutton = Setup.driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-99554b333bbcebf1\"]/div[6]/div/div[2]/a[1]"));
        Assert.assertTrue(profilebutton.isDisplayed());
    }
    @Test(priority = 19)
    public void ChecktheBeneficiariestext() {
        WebElement ficiariestext = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/div/div[2]/div/div[3]/p"));
        Assert.assertTrue(ficiariestext.isDisplayed(), "مستفيد ومستفيدة");
    }
    //وجود زر اقراء المزيد من المدونة
    @Test(priority = 20)
    public void ThereisaReadMoreBlogbutton() {
        WebElement specialistsappear = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[7]/div/div/div/div/div[4]/a"));
        Assert.assertTrue(specialistsappear.isDisplayed());
    }
    // تحقق من عرض زر اشتراك
    @Test(priority = 21)
    public void CheckwhethertheSubscribebuttonisdisplayed() {
        WebElement Subscribebutton = Setup.driver.findElement(By.xpath("//*[@id=\"mc4wp-form-2\"]/div[1]/div/input[2]"));
        Assert.assertTrue(Subscribebutton.isDisplayed());
    }
    // تحقق لوجود صورة لتطبيق بالاسفل
    @Test(priority = 22)
    public void Checkforanapplicationimagebelow() {
        WebElement licationimage = Setup.driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[2]/div/div[2]/img"));
        Assert.assertTrue(licationimage.isDisplayed());
    }
    // تحقق من عرض رمز الاستغرام
    @Test(priority = 23)
    public void CheckwhethertheInstagramiconisdisplayed() {
        WebElement Instagramiconisd = Setup.driver.findElement(By.xpath("/html/body/footer/div[2]/div/div/div[2]/ul/li[2]/a"));
        Assert.assertTrue(Instagramiconisd.isDisplayed());
    }
    // تحقق من عرض رمز تويتر
    @Test(priority = 24)
    public void CheckthewidtoftheTwittericon() {
        WebElement Twittericon = Setup.driver.findElement(By.xpath("/html/body/footer/div[2]/div/div/div[2]/ul/li[1]/a"));
        Assert.assertTrue(Twittericon.isDisplayed());
    }
    //تحقق من أن النقر على الايميل يفتح البريد
    @Test(priority = 25)
    public void Verifythatclickingontheemailopensthemail() {
        WebElement clickingontheemail = Setup.driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/div[2]/div[1]/div[2]/a"));
        Assert.assertTrue(clickingontheemail.isDisplayed());
    }



}

