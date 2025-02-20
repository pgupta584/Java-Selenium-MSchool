package day8;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of ChromeDriver (or any other driver)
        WebDriver driver = new ChromeDriver();
        // Implicit Wait - Up to 5sec
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        

        // Open a website
        driver.get("https://the-internet.herokuapp.com");
        
        // Click on Slow Element - Normal Click
        WebElement slowElement = driver.findElement(By.linkText("Slow Resources"));
//        slowElement.click();
        
        // JS - Click Using JS
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", slowElement);
             
        // Quit the Browser
        driver.quit();
	}
}
