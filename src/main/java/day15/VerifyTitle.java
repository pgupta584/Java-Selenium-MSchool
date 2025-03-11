package day15;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	ChromeDriver driver;
	
	@Test
	void verifyTitle() throws InterruptedException {
		driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        
        String EXPECTED_TITLE = "Swag Lab";
        
        // Get the title
        String ACTUAL_TITLE = driver.getTitle();
        System.out.println("Title is "+ ACTUAL_TITLE);
        
        // with Java
//        if(ACTUAL_TITLE.equals(EXPECTED_TITLE)) {
//        	System.out.println("Pass");
//        }else {
//        	System.out.println("Failed");
//        }
        
        // Assertion with TestNg
        Assert.assertEquals(ACTUAL_TITLE, EXPECTED_TITLE, "Expected Title doesn't match with Actual title");
//        Assert.assertTrue(EXPECTED_TITLE.equals(ACTUAL_TITLE));
//        Assert.assertTrue(EXPECTED_TITLE.equals(ACTUAL_TITLE), "Expected Title doesn't match with Actual title");
        
        
        Thread.sleep(2000);
        driver.quit();
        
	}
}
