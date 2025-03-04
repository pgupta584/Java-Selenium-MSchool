package day12;

import org.testng.annotations.Test;

public class TestNgAnnoitation {
	
	@Test
	void launchBrowser() {
		System.out.println("Browser Launched Success");
	}
	
	@Test
	void verifyTitle() {
		System.out.println("Test Success");
	}
	
	@Test
	void closeBrowser() {
		System.out.println("Browser Closed");
	}

}
