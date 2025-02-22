package day9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FileUploadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of ChromeDriver (or any other driver)
        WebDriver driver = new ChromeDriver();

        // Open a web site
        driver.get("https://the-internet.herokuapp.com/upload");
        // File Upload Button
        WebElement file = driver.findElement(By.id("file-upload"));
        
        file.sendKeys("/Users/payzapp-automation/Downloads/menu.pdf");
        
        // Wait
        Thread.sleep(5000);
        
        // Click on Upload
        driver.findElement(By.id("file-submit")).click();
        
        
     // Wait
        Thread.sleep(5000);

        
        // Quit the Browser
        driver.quit();
	}
}
