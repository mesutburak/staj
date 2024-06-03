package Intern_Project_UITesting.src.test.java.Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finance02Page extends ParentPage{


    public Finance02Page(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "body > app > student-layout > div > student-toolbar-horizontal > mat-toolbar > div > div:nth-child(1) > div > div:nth-child(2) > div > span:nth-child(6) > span > button")
     public WebElement hamburgerMenu;

    @FindBy(xpath = "//*[@id='mat-menu-panel-4']/div/button[2]/span/span")
    public WebElement FinanceSection;

    @FindBy(xpath= "//*[@id='mat-menu-panel-6']/div/button/span/span")
    public WebElement myFinance;

    @FindBy(xpath= "(//thead/tr/th)[6]")
    public WebElement FeeButton;

    @FindBy(xpath = "(//thead/tr/th)[9]")
    public WebElement BalanceButton;

  //  @FindBy(xpath = "//tr[@role='row']")
    public WebElement upbar;

 //   @FindBy(xpath = "//*[@id='container-3']/student-fees")
    public WebElement screenFee;


    @FindBy(xpath = "(//table/tfoot)")
    public WebElement TableBody;






}
