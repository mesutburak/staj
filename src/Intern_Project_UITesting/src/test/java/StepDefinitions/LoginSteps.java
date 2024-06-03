package Intern_Project_UITesting.src.test.java.StepDefinitions;

import Pages.LoginContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginContent lc= new LoginContent();
    @Given("Navigate to the Website Campus")
    public void navigateToTheWebsiteCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click on the login button")
    public void enterUsernameAndPasswordAndClickOnTheLoginButton() {
        lc.mySendKeys(lc.username,"Student_4");
        lc.mySendKeys(lc.password,"S12345");
        lc.myClick(lc.loginButton);
    }

    @Then("User should be login successfully")
    public void userShouldBeLoginSuccessfully() {
        lc.verifyContainsText(lc.headText,"Welcome");
    }

    @When("Enter invalid username and password and click on the login button")
    public void enterInvalidUsernameAndPasswordAndClickOnTheLoginButton() {
        lc.mySendKeys(lc.username,"Student");
        lc.mySendKeys(lc.password,"S12");
        lc.myClick(lc.loginButton);
    }

    @Then("User should receive an error message")
    public void userShouldReceiveAnErrorMessage() {
        lc.verifyContainsText(lc.errorMsg,"Invalid");
    }
}
