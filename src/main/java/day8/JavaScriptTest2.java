package day8;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

public class JavaScriptTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of ChromeDriver (or any other driver)
        WebDriver driver = new ChromeDriver();
        // Implicit Wait - Up to 5sec
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        

        // Open a website
        driver.get("https://www.facebook.com/");
        
        // Click on Slow Element - Normal Click
        WebElement slowElement = driver.findElement(By.id("email"));
//        slowElement.click();
        
        // JS - Click Using JS
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // Pass the Text to field
        jsExecutor.executeScript("arguments[0].value='Pankaj';", slowElement);
        jsExecutor.executeScript("window.scrollTo(200, document.body.scrollHeight);");
        Thread.sleep(5000);
      
        
        // Quit the Browser
        driver.quit();
	}
}
