package Intern_Project_UITesting.src.test.java.StepDefinitions;

import Pages.Finance02Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.util.Locale;

public class Finance02Steps {

    Finance02Page fp02=new Finance02Page();
    @Then("Go finance section")
    public void goFinanceSection() {

        fp02.myClick(fp02.hamburgerMenu);
        fp02.myClick(fp02.FinanceSection);
        fp02.myClick(fp02.myFinance);

    }

    @And("Follow table")
    public void followTable() {


       fp02.myClick(fp02.FeeButton);
       Assert.assertTrue(fp02.TableBody.getText().contains("$"),"Fee not work");



       fp02.myClick(fp02.BalanceButton);
       Assert.assertTrue(fp02.TableBody.getText().contains("$"),"Balance not work");


    }
}
