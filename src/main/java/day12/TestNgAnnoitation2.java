package day12;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnoitation2 {
	
	@BeforeMethod
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
	
	@AfterMethod
	void closeBrowser() {
		System.out.println("Browser Closed");
	}

}
