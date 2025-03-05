package day13;

import org.testng.annotations.Test;

public class LoginTest_1 {
	
	@Test(priority=0)
	void browserLaunched() {
		System.out.println("Browser Launched");
	}
	
	@Test(priority=2)
	void validloginTest() {
		System.out.println("Login Success");
	}
	
	@Test(priority=2)
	void invalidLoginTest() {
		System.out.println("Login Failed - Due to Bad Credentials");
	}
	
	@Test
	void blockedUserLoginTest() {
		System.out.println("Login Failed - Due to User is Blocked");
	}
}
