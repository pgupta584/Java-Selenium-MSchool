package day12;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnoitation4 {
	
	@BeforeTest
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
	
	@AfterTest
	void closeBrowser() {
		System.out.println("Browser Closed");
	}
}
