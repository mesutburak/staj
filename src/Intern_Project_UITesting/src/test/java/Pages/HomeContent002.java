package Intern_Project_UITesting.src.test.java.Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeContent002 extends ParentPage{

    public HomeContent002(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='ng-star-inserted']/img[1]")
    public WebElement homeLogo;


}
