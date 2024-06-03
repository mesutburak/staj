package Intern_Project_UITesting.src.test.java.Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finance extends ParentPage{
    public Finance() {PageFactory.initElements(GWD.getDriver(),this);}
    @FindBy(xpath="(//button[@aria-haspopup='menu'])[1]")
    public WebElement hamburgerMunu;
    @FindBy(xpath="//span[text()='Finance']")
    public WebElement financeButton;
    @FindBy(xpath="//span[text()='My Finance']")
    public WebElement myFinance;
    @FindBy(xpath="//span[text()=' Students Fees ']")
    public WebElement studentsFess;
    @FindBy(xpath="(//button[@matbadgesize='small'])[2]")
    public WebElement view;
    @FindBy(xpath="//div[@fxlayoutalign='space-around center']")
    public WebElement stripe;

    @FindBy(xpath="//input[@name='number']")
    public WebElement cardNumber;
    @FindBy(xpath="//input[@name='expiry']")
    public WebElement expiration;
    @FindBy(xpath="//input[@name='cvc']")
    public WebElement cvc;
    @FindBy(xpath="//select[@name='country']")
    public WebElement country;
    @FindBy(xpath="//form[@id='payment-form']")
    public WebElement payments;
    @FindBy(xpath="(//input[@class='mdc-radio__native-control'])[4]")
    public WebElement payAmount;
    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "hamburgerMunu":
                return this.hamburgerMunu;
            case "financeButton":
                return this.financeButton;
            case "myFinance":
                return this.myFinance;
            case "studentsFess":
                return this.studentsFess;
            case "view":
                return this.view;
            case "payAmount":
                return this.payAmount;
            case "cardNumber":
                return this.cardNumber;
            case "expiration":
                return this.expiration;
            case "cvc":
                return this.cvc;
            case "country":
                return this.country;
            case "payments":
                return this.payments;


        }

        return null;

    }




}