package Intern_Project_UITesting.src.test.java.StepDefinitions;

import Pages.HomeContent003;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Home003 {

    HomeContent003 hc = new HomeContent003();

    @And("Click on the elements in the top nav")
    public void clickOnTheElementsInTheTopNav(DataTable tabMenuElements) {

        List<String> tabMenuElementList = tabMenuElements.asList(String.class);

        for (int i = 0; i < tabMenuElementList.size(); i++) {
            WebElement element = hc.getWebelement(tabMenuElementList.get(i));
            hc.myClick(element);

        }

    }

    @Then("Move to the elements und click on the elements")
    public void moveToTheElementsUndClickOnTheElements(DataTable tabMenuElements) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        Actions actionDriver = new Actions(GWD.getDriver());

        List<String> tabMenuElementList = tabMenuElements.asList(String.class);

        for (int i = 0; i < tabMenuElementList.size(); i++) {
            WebElement webElement = hc.getWebelement(tabMenuElementList.get(i));
            wait.until(ExpectedConditions.elementToBeClickable(webElement));
            actionDriver.moveToElement(webElement).click().build().perform();
            actionDriver.sendKeys(Keys.ESCAPE).build().perform();

        }


    }
}
