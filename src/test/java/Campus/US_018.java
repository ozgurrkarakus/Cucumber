package Campus;

import PROJECT.BaseDriver;
import PROJECT.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_018 extends BaseDriver {
    @Test
    public void test2() {

        Campus_Elements element = new Campus_Elements();

        LoginTestMersys();
        Tools.Bekle(2);
        element.Assignments.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(element.Assignments).perform();
        //Tools.Bekle(2);

        //wait.until(ExpectedConditions.visibilityOf(element.Assignments_Notification));

        Assert.assertTrue(element.Assignments_Notification.isDisplayed(), "Bildirim görüntülenemedi!");


    }
}
