package day12;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test
	void loginTestWithValidUser() {
		System.out.println("loginTestWithValidUser");
		assertTrue(true);
	}
	
	@Test
	void loginTestWithInvalidUser() {
		System.out.println("loginTestWithInvalidUser");
		assertTrue(true);
	}
}
