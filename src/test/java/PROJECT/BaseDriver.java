package PROJECT;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseDriver {
    public static Logger logTutma= LogManager.getLogger();//Logları ekleyeceğim nesneyi başlattım.

    public  static WebDriver driver;
    public  static WebDriverWait wait;
    @BeforeClass
    public void BaslangicIslemleri (){


        driver = new ChromeDriver();
        driver.manage().window().maximize();//ekranı max yapar
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));// 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20 sn mühlet: elementi bulma mühleti
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));

        LoginTestMersys();

    }

    public void LoginTestMersys(){
        System.out.println("Test Başladı");
        driver.get("https://test.mersys.io/");

        WebElement id= driver.findElement(By.xpath("//input[@placeholder=\"Kullanıcı Adı\"]"));
        id.sendKeys("Student_5");

        WebElement pass=driver.findElement(By.xpath("//input[@placeholder=\"Parola\"]"));
        pass.sendKeys("S12345");

        WebElement btn=driver.findElement(By.xpath("//*[text()=' GİRİŞ YAP ']"));
        btn.click();


//        wait.until(ExpectedConditions.titleIs("user-courses"));
//
//        Assert.assertTrue(driver.getTitle().equals("user-courses"));
//        System.out.println("login test bitti");

        // logTutma.info("log işlemi tamamlandı");// normal bir bilgi
    }


    @AfterClass
    public void KapanisIslemleri(){
        System.out.println("kapanış işlemleri yapılıyor");//bekle kapat

        Tools.Bekle(3);
        driver.quit();

        logTutma.info("driver kapatıldı");

    }

    @BeforeMethod
    public void beforeMethod(){
        logTutma.info("metod başladı");
        logTutma.warn("WARN : Metod başladı , hata oluşmuş olsa idi");
    }

    @AfterMethod
    public void AfterMethod(ITestResult sonuc){
        logTutma.info(sonuc.getName()+  " Metod bitti "+ (sonuc.getStatus() ==1 ? "Passed" : "failed"));

        logTutma.warn("WARN : Metod bitti, hata oluşmuş olsa idi");
    }
}
