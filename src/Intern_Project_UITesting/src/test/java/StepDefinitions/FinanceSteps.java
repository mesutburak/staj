package Intern_Project_UITesting.src.test.java.StepDefinitions;

import Pages.Finance;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Instant;

public class FinanceSteps {
    Finance fc=new Finance();
    @Given("The finance section in the hamburger menu should be clicked.")
    public void theFinanceSectionInTheHamburgerMenuShouldBeClicked() {
        fc.myClick(fc.hamburgerMunu);
        fc.myClick(fc.financeButton);
        fc.myClick(fc.myFinance);

    }

    @When("The finance page should be displayed")
    public void theFinancePageShouldBeDisplayed() {
        fc.myClick(fc.view);
        fc.myClick(fc.stripe);
        Select select=new Select(fc.payAmount);
        fc.myClick(fc.payAmount);
        fc.mySendKeys(fc.cardNumber,"1234123412341234");
        fc.mySendKeys(fc.expiration,"101");

    }

    @Then("Student should be verified that the page is displayed.")
    public void studentShouldBeVerifiedThatThePageIsDisplayed() {
        fc.myClick(fc.studentsFess);
    }
}
