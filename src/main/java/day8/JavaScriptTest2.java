package day8;
import java.time.Duration;

import org.openqa.selenium.Alert;
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
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
        
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        // Pass the Text to field
//        jsExecutor.executeScript("window.scrollTo(1, document.body.scrollHeight);");
        
        WebElement slowElement = driver.findElement(By.id("promptBox"));
        // Click into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", slowElement);

        Thread.sleep(5000);
        
        // Click on Slow Element - Normal Click
        
        slowElement.click();
        Thread.sleep(5000);
        
        Alert alt = driver.switchTo().alert();
        alt.sendKeys("Hello");
        alt.accept();
        Thread.sleep(5000);


      
        
        // Quit the Browser
        driver.quit();
	}
}
