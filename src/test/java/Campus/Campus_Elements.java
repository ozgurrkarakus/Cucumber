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
    @FindBy(xpath = "//mat-select[@id='mat-select-2']")
    public WebElement Status;
    @FindBy(xpath = "//span[@class='mdc-list-item__primary-text']")
    public WebElement Published;

    @FindBy(xpath = "/html/body/app/student-layout/div/mat-drawer-container/mat-drawer-content/div[1]")
    public WebElement Space;
    @FindBy(xpath = "//mat-select[@id='mat-select-3']")
    public WebElement Semester;
    @FindBy(xpath = "//mat-option[@value='all']")
    public WebElement All;
    @FindBy(xpath = "(//span[contains(@class, 'submission-status')])[3]")
    public WebElement MathHomework;
    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon nav-link-icon'])[3]")
    public WebElement Discussion;
    @FindBy(xpath = "//fa-icon//*[local-name()='svg' and @data-icon='users']\n")
    public WebElement Contacts;
    @FindBy(xpath = "(//user-image[@class='ng-tns-c2158703769-61']//img[@class='avatar-mini ng-star-inserted'])[1]")
    public WebElement Zuckerberg;
    @FindBy(xpath = "//textarea[@formcontrolname='commentText']")
    public WebElement Textarea;




    //<span class="title dialog-title" style="display: flex; overflow: hidden; text-overflow: ellipsis; font-size: 18px;"> Student_5 11A - Mark Zuckerberg</span>
//textarea[@formcontrolname='commentText']
//user-image[@class='ng-tns-c2158703769-61']//img[@class='avatar-mini ng-star-inserted'])[1]
//fa-icon//*[local-name()='svg' and @data-icon='users']
//span[contains(@class, 'submission-status')])[3]
//mat-option[@value='all']
//mat-select[@id='mat-select-4']
}
//*[@id="mat-option-15"]/span
//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']