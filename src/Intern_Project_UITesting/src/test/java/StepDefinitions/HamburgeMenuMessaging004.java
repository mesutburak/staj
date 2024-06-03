package Intern_Project_UITesting.src.test.java.StepDefinitions;

import Pages.HamburgerMenuMessagingContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HamburgeMenuMessaging004 {

    HamburgerMenuMessagingContent hmc=new HamburgerMenuMessagingContent();

    @And("Click on the elements in the hamburger menu of the messaging button")
    public void clickOnTheElementsInTheHamburgerMenuOfTheMessagingButton(DataTable tabMenuElements) {

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        Actions actionDriver = new Actions(GWD.getDriver());

        List<String> tabMenuElementList = tabMenuElements.asList(String.class);

        for (int i = 0; i < tabMenuElementList.size(); i++) {
            WebElement webElement = hmc.getWebelement(tabMenuElementList.get(i));
            wait.until(ExpectedConditions.elementToBeClickable(webElement));
            actionDriver.moveToElement(webElement).click().build().perform();

        }




    }
}
