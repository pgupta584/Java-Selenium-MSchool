package day12;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	@BeforeSuite
	void setupEnvironment() {
		System.out.println("Setup Env");
	}
	
	@AfterSuite
	void generateReport() {
		System.out.println("Generate Report");
	}
	
	@BeforeTest
	void connectDB() {
		System.out.println("Connect DB");
	}
	
	@AfterTest
	void disConnectDB() {
		System.out.println("Disconnect DB");
	}
	
	@BeforeClass
	void launchBrowser() {
		System.out.println("Browser Launched");
	}
	
	@AfterClass
	void closeBrowser() {
		System.out.println("Browser Closed");
	}
}
