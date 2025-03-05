package day13;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidorTest4 {
	
	ChromeDriver driver;
	@BeforeMethod
	void browserLaunch() throws InterruptedException {
		driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
		
	}
	
	@DataProvider(name = "excelData")
	public Object[][] createTestData() {
	    return new Object[][] {
	        { "standard_user", "secret_sauce" },
	        { "standard_user", "InValidPassword" }
	    };
	}

	@Test(dataProvider = "excelData")
	public void loginToWeb(String param1, String param2) throws InterruptedException {
	    System.out.println("Test Data: " + param1 + ", " + param2);
	    driver.findElement(By.id("user-name")).sendKeys(param1);
	    driver.findElement(By.id("password")).sendKeys(param2);
	    driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        
	    String expected= "Swag Labs";
	    String actual = driver.findElement(By.className("app_logo")).getText();
	    assertEquals(expected, actual);
        Thread.sleep(2000);

	}
	
	@AfterMethod
	void CloseLaunch() {
		driver.quit();
	}

}
