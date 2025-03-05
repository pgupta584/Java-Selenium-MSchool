package day13;

import org.testng.annotations.Test;

public class SendEmailTest {
	
	@Test(groups = "SMOKE")
	void sendEmail() {
		System.out.println("SMOKE: Email Sent");
	}

}
