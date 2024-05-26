package Campus;

import PROJECT.BaseDriver;
import PROJECT.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Base64;

public class US_017 extends BaseDriver {
    @Test
    public void test1() throws AWTException {
        Campus_Elements element = new Campus_Elements();
        LoginTestMersys();
        Tools.Bekle(2);
        element.granding.click();
        Tools.Bekle(2);
        element.Student_Transcript.click();
        WebElement studentTranscriptElement = element.Student_Transcript;
        boolean isStudentTranscriptVisible = wait.until(ExpectedConditions.visibilityOf(studentTranscriptElement)).isDisplayed();
        if (isStudentTranscriptVisible) {
            System.out.println("Student Transcript Göründü");
        } else {
            System.out.println("Student Transcript Görünmedi");
        }
        //Tools.Bekle(2);
element.Print.click();
        Tools.Bekle(3);
        Robot robot=new Robot();
        for (int i = 0; i <8; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

Tools.Bekle(2);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);




    }
}
