package day15;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentTestListners implements ITestListener{
	
	private ExtentReports extent;
    ExtentTest test;


	public void onTestStart(ITestResult result) {
		// Create an instance of ExtentHtmlReporter
    	ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extent-report.html");

        // Create an instance of ExtentReports
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter); // Attach the reporter to ExtentReports
	  }

	 
	public void onTestSuccess(ITestResult result) {
	    // not implemented
		test.pass("Tests Passed");
	  }

	  
	public void onTestFailure(ITestResult result) {
		test.fail("Tests Failed"+ result.getTestName());

	  }
	
	public void onFinish(ITestContext context) {
        extent.flush(); // Save the report after tests are completed

	  }

}
