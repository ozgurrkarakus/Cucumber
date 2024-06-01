package Campus;

import PROJECT.BaseDriver;
import PROJECT.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US_020 extends BaseDriver {
    @Test

    public void test() throws AWTException {


        Campus_Elements element = new Campus_Elements();
        LoginTestMersys();
        Tools.Bekle(2);

        element.Assignments.click();
        WebElement AssignmentsElement = element.Assignments;
        boolean isAssignmentsVisible = wait.until(ExpectedConditions.visibilityOf(AssignmentsElement)).isDisplayed();
        if (isAssignmentsVisible) {
            System.out.println("Ödevler (Assignments) Göründü");
        } else {
            System.out.println("Ödevler (Assignments) Görünmedi");

        }


        Tools.Bekle(1);
        // element.Space.click();


        element.Semester.click();
        element.All.click();
        Tools.Bekle(2);

        element.Statistics_I.click();
        Assert.assertTrue(element.Statistics_11A.isDisplayed(), "Statistics_I, Görüntülenemedi");
        Tools.Bekle(2);
        element.Back.click();
        Tools.Bekle(2);
        //element.Statistics_Mark.click();
        element.Geo_I.click();
        Robot robot = new Robot();

        for (int i = 0; i < 1; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        element.Back_Icon.click();
        element.Back.click();
        element.Geo_Submit.click();
        Tools.Bekle(2);
        element.Back_Icon.click();

        Tools.Bekle(5);
        element.Statistics_Mark.click();
        element.Geo_Mark.click();
    }
}