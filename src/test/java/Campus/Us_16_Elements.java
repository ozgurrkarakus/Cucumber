package Campus;

import PROJECT.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Us_16_Elements {
    public Us_16_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "/html[1]/body[1]/app[1]/student-layout[1]/div[1]/student-toolbar-horizontal[1]/mat-toolbar[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ms-layout-menu-button[5]/button[1]/span[2]/span[1]")
    public WebElement granding;
    @FindBy(xpath = "//span[contains(text(),'Student Transcript')]")
    public WebElement Student_Transcript;

    @FindBy(xpath = "//span[contains(text(),'Transcript By Subject')]")
    public WebElement Subject;
    @FindBy(xpath = "//td[contains(@class, 'cdk-column-subject-title')]")
    public WebElement SubjectAssert;




//td[contains(@class, 'cdk-column-subject-title')]
    //div[@class='w-100-p']//span[contains(text(),'Internship')]

}
//span[contains(text(),'Transcript By Subject')]
//td[@class='mat-mdc-cell mdc-data-table__cell cdk-cell mat-primary-400-bg cdk-column-subject-title mat-column-subject-title ng-star-inserted']