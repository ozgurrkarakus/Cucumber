package StepDefinitions;


import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _01_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        GWD.getDriver().get("https://test.mersys.io/");
        System.out.println("Site açıldı");
    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        //username.sendKeys("turkeyts");
        //password.sendKeys("TechnoStudy123");
        System.out.println("username ve şifre gönderildi");
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(dc.username));
        dc.username.sendKeys("turkeyts");
        dc.password.sendKeys("TechnoStudy123");
        dc.loginButton.click();

    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("Siteye girildiği kontrol edildi");
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(dc.headText,"Internship"));

        Assert.assertTrue(dc.headText.getText().equals("Internship"));
    }

}



