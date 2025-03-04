package day12;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgAnnoitation5 {
	
	@BeforeSuite
	void launchBrowser() {
		System.out.println("Browser Launched Success");
	}
	
	@Test
	void verifyLogin() {
		System.out.println("Test Success 1");
	}
	
	@Test
	void verifyTitle() {
		System.out.println("Test Success 2");
	}
	
	@AfterSuite
	void closeBrowser() {
		System.out.println("Browser Closed");
	}
}
