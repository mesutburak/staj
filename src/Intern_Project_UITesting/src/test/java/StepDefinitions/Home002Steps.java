package Intern_Project_UITesting.src.test.java.StepDefinitions;

import Pages.HomeContent002;
import Pages.LoginContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Home002Steps {

    HomeContent002 hc=new HomeContent002();
    @Then("Click on the logo on the left side on the top")
    public void clickOnTheLogoOnTheLeftSideOnTheTop() {
        hc.myClick(hc.homeLogo);
    }

    @And("Navigate to the Website Techno Study")
    public void navigateToTheWebsiteTechnoStudy() {
        String expectedUrl = "https://techno.study/";
        String actualUrl = GWD.getDriver().getCurrentUrl();


        if (expectedUrl.equals(actualUrl)) {
            GWD.getDriver().get(expectedUrl);
        }
    }
}
