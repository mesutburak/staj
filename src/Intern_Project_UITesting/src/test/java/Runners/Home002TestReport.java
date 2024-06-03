package Intern_Project_UITesting.src.test.java.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features={"src/test/java/FeatureFiles/Home002.feature"}  ,
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class Home002TestReport extends AbstractTestNGCucumberTests {
}
