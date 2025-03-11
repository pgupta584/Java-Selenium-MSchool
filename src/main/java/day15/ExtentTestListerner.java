package day15;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentTestListerner {

    private ExtentReports extent;
    ChromeDriver driver;

    @BeforeClass
    public void setup() {
        // Create an instance of ExtentHtmlReporter
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extent-report.html");

        // Create an instance of ExtentReports
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter); // Attach the reporter to ExtentReports
    }

    ExtentTest test;

    @Test
    public void testMethod() {
        // Start a test with a specific name
        test = extent.createTest("My First Test", "Test Description");

        // Log info
        test.info("Test execution started");

        try {
            Assert.assertEquals(false, false); // This will Pass
            test.pass("Test passed");
        } catch (AssertionError e) {
            test.fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    public void testMethod2() {
        // Start a test with a specific name
        test = extent.createTest("My Second Test", "Test Description");

        // Log info
        test.info("Test execution started");

        try {
            Assert.assertEquals(false, true); // This will fail
            test.pass("Test passed");
        } catch (AssertionError e) {
            test.fail("Test failed: " + e.getMessage());
        }
    }

    @Test
    void verifyTitle() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        String EXPECTED_TITLE = "Swag Lab";

        // Start a test with a specific name
        test = extent.createTest("Verify Title", "Verify if URL has correct Title");

        // Get the title
        String ACTUAL_TITLE = driver.getTitle();
        System.out.println("Title is " + ACTUAL_TITLE);

        // Log info
        test.info("Assertion Started");

        try {
            Assert.assertEquals(EXPECTED_TITLE, ACTUAL_TITLE); // This will fail if titles don't match
            test.pass("Title verification passed");
        } catch (AssertionError e) {
            test.fail("Title verification failed: " + e.getMessage());
        }

        test.info("Assertion Completed");
    }

    @AfterClass
    public void tearDown() {
        extent.flush(); // Save the report after tests are completed
    }
}
