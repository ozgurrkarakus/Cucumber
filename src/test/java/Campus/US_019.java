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


        Tools.Bekle(1);
        element.Space.click();


        element.Semester.click();
        element.All.click();
        Tools.Bekle(2);


        element.MathHomework.click();
        Tools.Bekle(2);

        Robot robot = new Robot();

        for (int i = 0; i < 1; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Tools.Bekle(1);
        for (int i = 0; i < 8; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Tools.Bekle(1);
        Tools.Bekle(2);
        String filePath = "deneme";
        for (char c : filePath.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            if (KeyEvent.CHAR_UNDEFINED == keyCode) {
                throw new RuntimeException(
                        "Karakter için tuş kodu bulunamadı: '" + c + "'");
            }
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        element.Textarea.sendKeys("How do you think about this math homework?");

        Tools.Bekle(2);


        for (int i = 0; i < 3; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);



      //  element.Person.click();
        //element.Textarea.sendKeys("How do you think about this math homework?");


        element.Submit.click();
        Tools.Bekle(1);
        boolean isMeVisible = wait.until(ExpectedConditions.visibilityOf(element.Me)).isDisplayed();
        if (isMeVisible) {
            System.out.println("Mesaj Gönderildi.");
        } else {
            System.out.println("Mesaj Gönderilmedi.");
        }

    }


}
