package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GWD {
    public static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null){
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        }

        return driver;
    }
}
