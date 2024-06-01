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
    @FindBy(xpath = "(//div[contains(@class, 'mdc-tooltip__surface') and contains(@class, 'mdc-tooltip__surface-animation')])")
    public WebElement Assignments_Notification;
    @FindBy(xpath = "//span[normalize-space()='Math Quiz 24']")
    public WebElement MathQuiz;
    @FindBy(xpath = "//mat-select[@id='mat-select-2']")
    public WebElement Status;
    @FindBy(xpath = "//span[@class='mdc-list-item__primary-text']")
    public WebElement Published;

    @FindBy(xpath = "//div[@class='mat-spacer']")
    public WebElement Space;
    @FindBy(xpath = "//mat-select[@id='mat-select-4']")
    public WebElement Semester;
    @FindBy(xpath = "//mat-option[@value='all']")
    public WebElement All;
    @FindBy(xpath = "(//span[contains(@class, 'submission-status')])[3]")
    public WebElement MathHomework;
    @FindBy(xpath = "//*[@id=\"container-3\"]/my-assignments-form-page/my-assignments-form/div/div/div/div/div[1]/div[3]/user-chat-bell/button/div/fa-icon")
    public WebElement Discussion;
    @FindBy(xpath = "//fa-icon//*[local-name()='svg' and @data-icon='users']")
    public WebElement Contacts;
    @FindBy(xpath = "//span[text()='Mark Zuckerberg']")
    public WebElement Person;
    @FindBy(xpath = "//textarea[@formcontrolname='commentText']")
    public WebElement Textarea;
    @FindBy(xpath = "//div[@fxlayoutalign='end center']//ms-icon-button[@icon='paper-plane']//button[@mat-icon-button]")
    public WebElement Submit;
    @FindBy(xpath = "//div[contains(@class, 'comment-member-name') and text()=' Me ']")
    public WebElement Me;
    @FindBy(xpath = "//span[contains(@class, 'ng-star-inserted') and text()='Print']")
    public WebElement Print;
    @FindBy(xpath = "(//button[@mat-icon-button and @matbadgeoverlap='false' and @matbadgesize='small'])[1]")
    public WebElement Statistics_I;
    @FindBy(xpath = "(//button[@mat-icon-button and @matbadgeoverlap='false' and @matbadgesize='small' and contains(@class, 'mat-mdc-tooltip-trigger')])[2]")
    public WebElement Statistics_Mark;
    @FindBy(xpath = "(//button[@mat-icon-button and @matbadgeoverlap='false' and @matbadgesize='small' and contains(@class, 'mat-mdc-tooltip-trigger')])[3]")
    public WebElement Geo_I;
    @FindBy(xpath = "(//button[@mat-icon-button and @matbadgeoverlap='false' and @matbadgesize='small' and contains(@class, 'mat-mdc-tooltip-trigger')])[4]")
    public WebElement Geo_Submit;
    @FindBy(xpath = "(//button[@mat-icon-button and @matbadgeoverlap='false' and @matbadgesize='small' and contains(@class, 'mat-mdc-tooltip-trigger')])[5]")
    public WebElement Geo_Mark;
    @FindBy(xpath = "(//button[@mat-icon-button and contains(@class, 'mdc-icon-button') and contains(@class, 'mat-mdc-icon-button')])[3]")
    public WebElement Back;
    @FindBy(xpath = "//div[contains(@class, 'w-70-p') and text()='11A-Statistics']\n")
    public WebElement Statistics_11A;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement Back_Icon;
}