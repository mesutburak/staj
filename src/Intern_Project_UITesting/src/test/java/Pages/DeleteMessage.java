package Intern_Project_UITesting.src.test.java.Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteMessage extends ParentPage {
    public DeleteMessage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[1]")
    public WebElement hamburgerMunu;

    @FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
    public WebElement messaging;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[10]")
    public WebElement trash;

    @FindBy(xpath = "//tbody/tr//ms-delete-button")
    public WebElement deleteBtn;

    @FindBy(xpath = "//span[text()=' Delete ']")
    public WebElement deleteConfirm;

    @FindBy(xpath = "//tbody/tr//ms-standard-button")
    public WebElement restoreButton;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "hamburgerMunu":
                return this.hamburgerMunu;
            case "restoreButton":
                return this.restoreButton;
            case "deleteConfirm":
                return this.deleteConfirm;
            case "deleteBtn":
                return this.deleteBtn;
            case "trash":
                return this.trash;
            case "messaging":
                return this.messaging;
        }
        return null;
    }
}
