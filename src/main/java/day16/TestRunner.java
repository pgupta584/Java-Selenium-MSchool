package day16;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "/Java-Selenium/src/test/resources/login.feature" // Path to your feature files
)
public class TestRunner extends AbstractTestNGCucumberTests {
}