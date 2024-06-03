package Intern_Project_UITesting.src.test.java.Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginContent extends ParentPage{

    public LoginContent(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css="[formcontrolname='username']")
    public WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy (xpath = "//div[@class='ng-star-inserted']/span")
    public WebElement headText;

    @FindBy(xpath = "//mat-panel-description[@class='mat-expansion-panel-header-description ng-star-inserted']/div")
    public WebElement errorMsg;


}
