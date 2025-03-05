package day13;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidorTest {
	
	@DataProvider(name = "test-data")
	public Object[][] createTestData() {
	    return new Object[][] {
	        { "Valid username", "valid Password" },
	        { "InValid username", "InValid Password" },
	        { "Valid username", "InValid Password" }
	    };
	}

	@Test(dataProvider = "test-data")
	public void testLogin(String username, String password) {
	    System.out.println("username: " + username + ", password: " + password);
	}

}
