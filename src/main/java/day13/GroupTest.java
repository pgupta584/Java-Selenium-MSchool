package day13;

import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups="SMOKE", priority=1)
	void browserLaunched() {
		System.out.println("SMOKE TEST: browserLaunched");
	}
	
	@Test(groups="SANITY", priority=2)
	void validloginTest() {
		System.out.println("SANITY TEST");
	}
	
	@Test(groups="Regression", priority=3)
	void invalidLoginTest() {
		System.out.println("Regression:Login Failed - Due to Bad Credentials");
	}
	
	@Test(groups="Regression", priority=4)
	void blockedUserLoginTest() {
		System.out.println("Regression:Login Failed - Due to User is Blocked");
	}
}
