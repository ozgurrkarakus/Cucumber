package Campus;

import PROJECT.BaseDriver;
import PROJECT.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.IExpectedExceptionsHolder;
import org.testng.annotations.Test;

public class US_016 extends BaseDriver {


    @Test
    public void test1() {
        Us_16_Elements element = new Us_16_Elements();
        LoginTestMersys();
        Tools.Bekle(2);
        element.granding.click();
       Tools.Bekle(2);


        String expectedUrl = "https://test.mersys.io/student-grading";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "URL doğrulaması başarısız!");
        System.out.println("Course Grade Göründü");
        element.Student_Transcript.click();
        Tools.Bekle(2);
        WebElement studentTranscriptElement = element.Student_Transcript;
        boolean isStudentTranscriptVisible = wait.until(ExpectedConditions.visibilityOf(studentTranscriptElement)).isDisplayed();
        if (isStudentTranscriptVisible) {
            System.out.println("Student Transcript Göründü");
        } else {
            System.out.println("Student Transcript Görünmedi");
        }
        element.Subject.click();
        WebElement SubjectElement = element.Subject;
        boolean isSubjectVisible = wait.until(ExpectedConditions.visibilityOf(SubjectElement)).isDisplayed();
        if (isSubjectVisible) {
            System.out.println("Transcript By Subject Göründü");
        } else {
            System.out.println("Transcript By Subject Görünmedi");
        }

    }


}

