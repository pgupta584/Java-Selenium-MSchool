package day15;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleSoftAssert {
	
	ChromeDriver driver;
	
	@Test
	void verifyTitle() throws InterruptedException {
		driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        
        String EXPECTED_TITLE = "Swag Lab";
        
        // Get the title
        String ACTUAL_TITLE = driver.getTitle();
        System.out.println("Title is "+ ACTUAL_TITLE);
        
        
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(ACTUAL_TITLE, EXPECTED_TITLE);
        
        softAssert.assertEquals(1, 2);

        
        System.out.println("Next Line Assert");
        
        WebElement loginButton = driver.findElement(By.id("login-button"));
        boolean flag = loginButton.isDisplayed();
        
        softAssert.assertTrue(flag, "Login button not available");
        softAssert.assertAll();
        
        
        
        Thread.sleep(2000);
        driver.quit();
        
	}
}
