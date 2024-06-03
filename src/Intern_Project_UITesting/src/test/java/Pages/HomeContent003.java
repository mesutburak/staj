package Intern_Project_UITesting.src.test.java.Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomeContent003 extends ParentPage{

    public HomeContent003(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='ng-star-inserted']/img[1]")
    public WebElement logo;

    @FindBy(xpath = "//span[text()='Courses']")
    public WebElement coursesBtn;

    @FindBy(xpath = "//span[text()='Calendar']")
    public WebElement calendarBtn;

    @FindBy(xpath = "//span[text()='Attendance']")
    public WebElement attendanceBtn;

    @FindBy(xpath = "(//span[text()='Assignments'])[1]")
    public WebElement assignmentBtn;

    @FindBy(xpath = "//span[text()='Grading']")
    public WebElement gradingBtn;

    @FindBy(css = "[class='mat-mdc-menu-trigger mat-mdc-button-wrapper mdc-button mat-mdc-button mat-mdc-button-unchecked mat-unthemed mat-mdc-button-base']")
    public WebElement hamburgerMenuBtn;

    @FindBy(xpath = "//div[@class='mat-badge mat-badge-accent mat-badge-above mat-badge-after mat-badge-small mat-badge-hidden']")
    public WebElement newMessageChatBtn;

    @FindBy(xpath = "(//button[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[3]")
    public WebElement BtnClose;

    @FindBy(xpath = "(//button[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base'])[2]")
    public WebElement newMessageBtn;

    @FindBy(css = "[class='svg-inline--fa fa-angle-down fa-fw']")
    public WebElement profileSettingsBtn;

    public WebElement getWebelement(String element){

        switch (element){

            case "coursesBtn": return this.coursesBtn;
            case "calendarBtn": return this.calendarBtn;
            case "attendanceBtn": return this.attendanceBtn;
            case "assignmentBtn": return this.assignmentBtn;
            case "gradingBtn": return this.gradingBtn;
            case "hamburgerMenuBtn": return this.hamburgerMenuBtn;
            case "newMessageChatBtn": return this.newMessageChatBtn;
            case "BtnClose": return this.BtnClose;
            case "newMessageBtn": return this.newMessageBtn;
            case "profileSettingsBtn": return this.profileSettingsBtn;

        }
        return null;
    }











}
