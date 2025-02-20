package day8;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

public class WaitTests {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of ChromeDriver (or any other driver)
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://the-internet.herokuapp.com");
        
        // Click on Slow Element
        driver.findElement(By.linkText("Slow Resources")).click();
        
        // Hard Wait
        //Thread.sleep(5000);
        
        // Implicit Wait - Up to 5sec
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        
        // Explicit Wait - Up to 10 Sec until particular Element is loaded - Poll every 500Mili
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Slow Resources']")));
       
        String text = element.getText();
        System.out.println("text --> "+text);
        
//        WebElement slowElement = driver.findElement(By.xpath("//h3[text()='Slow Resources']"));
//        String text = slowElement.getText();
//        System.out.println("text --> "+text);
        
        // Quit the Browser
        driver.quit();
	}
}
