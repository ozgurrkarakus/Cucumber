package Campus;

import PROJECT.BaseDriver;
import PROJECT.Tools;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US_019 extends BaseDriver {
    @Test
    public void test1() throws AWTException {
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

        element.Assignments.click();

       Robot robot = new Robot();

       for (int i = 0; i < 10; i++) {
           robot.keyPress(KeyEvent.VK_TAB);
           robot.keyRelease(KeyEvent.VK_TAB);
       }

       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);
      Tools.Bekle(2);



        element.Status.click();
        Tools.Bekle(2);
        element.Published.click();
       //Select published = new Select(element.Status);
       //published.selectByIndex(1);


    }


}
