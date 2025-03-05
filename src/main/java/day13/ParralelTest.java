package day13;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParralelTest {
	
	@BeforeMethod
	void loginToGmail() {
		System.out.println("***********************");
		System.out.println("loginToGmail: ");
		
	}
	
	@Test//5
	void composeEmail() {
		System.out.println("composeEmail: ");
		System.out.println(Thread.currentThread());
	}
	
	@Test//5
	void sendEmail() {
		System.out.println("sendEmail: ");
		System.out.println(Thread.currentThread());
	}
	
	@Test//10
	void clearSpamEmail() {
		System.out.println("clearSpamEmail: ");
		System.out.println(Thread.currentThread());
	}
	
	@Test//10
	void testSentItem() {
		System.out.println("testSentItem: ");
		System.out.println(Thread.currentThread());
	}
	
	@AfterMethod
	void logout() {
		System.out.println("logout: ");
		System.out.println("***********************");
	}

}
