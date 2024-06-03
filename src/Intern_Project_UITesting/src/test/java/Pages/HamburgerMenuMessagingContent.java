package Intern_Project_UITesting.src.test.java.Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HamburgerMenuMessagingContent extends ParentPage{

    public HamburgerMenuMessagingContent(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@mat-ripple-loader-class-name='mat-mdc-button-ripple'])[6]")
    public WebElement hamburgerMenuBtn;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messagingBtn;

    @FindBy(xpath = "//span[text()='New Message']")
    public WebElement newMessageBtn;

    @FindBy(xpath = "//span[text()='Inbox']")
    public WebElement inboxBtn;

    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement outboxBtn;

    @FindBy(xpath = "//span[text()='Trash']")
    public WebElement trashBtn;

    public WebElement getWebelement(String element){

        switch (element){

            case "hamburgerMenuBtn": return this.hamburgerMenuBtn;
            case "messagingBtn": return this.messagingBtn;
            case "newMessageBtn": return this.newMessageBtn;
            case "inboxBtn": return this.inboxBtn;
            case "outboxBtn": return this.outboxBtn;
            case "trashBtn": return this.trashBtn;


        }
        return null;
    }







}
