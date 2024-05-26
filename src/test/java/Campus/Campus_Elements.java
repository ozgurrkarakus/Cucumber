package Campus;

import PROJECT.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campus_Elements {

    public Campus_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "(//button[contains(@class, 'mat-mdc-button-wrapper')]//fa-icon)[5]")
    public WebElement granding;
    @FindBy(xpath = "//span[contains(text(),'Student Transcript')]")
    public WebElement Student_Transcript;

    @FindBy(xpath = "//span[contains(text(),'Transcript By Subject')]")
    public WebElement Subject;
    @FindBy(xpath = "/html/body/app/student-layout/div/student-toolbar-horizontal/mat-toolbar/div/div[1]/div/div[2]/div/ms-layout-menu-button[4]/button/span[2]/fa-icon")
    public WebElement Assignments;
    @FindBy(xpath = "(//div[@class='mdc-tooltip__surface mdc-tooltip__surface-animation']")
    public WebElement Assignments_Notification;
    @FindBy(xpath = "//span[normalize-space()='Math Quiz 24']")
    public WebElement MathQuiz;
    @FindBy(css = "span.mat-mdc-select-min-line.ng-tns-c1154042729-53.ng-star-inserted\n")
    public WebElement Status;
    @FindBy(xpath = "//span[@class='mdc-list-item__primary-text']")
    public WebElement Published;

}
//*[@id="mat-option-15"]/span
//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']