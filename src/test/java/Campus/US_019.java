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


        element.Status.click();
        element.Published.click();
        element.Space.click();
element.Semester.click();
element.All.click();
element.MathHomework.click();
element.Discussion.click();
element.Contacts.click();
element.Zuckerberg.click();
element.Textarea.sendKeys("How do you think about this math homework?");
Tools.Bekle(5);

    }


}
