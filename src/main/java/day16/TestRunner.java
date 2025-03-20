package day16;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "/Users/payzapp-automation/Documents/Practice-Demo/MSchool/Java-Selenium/src/test/resources/login.feature", // Path to your feature files
        glue = "day16"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}