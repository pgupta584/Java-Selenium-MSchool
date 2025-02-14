package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "/Users/payzapp-automation/Documents/Practice-Demo/MSchool/Java-Selenium/drivers/chromedriver"); // Update the path

        // Create a new instance of ChromeDriver (or any other driver)
        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://the-internet.herokuapp.com");
        
        // Clicking on Button
        // WebElement button = driver.findElement(By.linkText("Create new account"));
        driver.findElement(By.linkText("Checkboxes")).click();
        Thread.sleep(2000);
        WebElement checkbox = driver.findElement(By.xpath("//input[1]"));
        if(checkbox.isEnabled() && checkbox.isSelected()) {
        	System.out.println("Already Selected");
        }
        else {
        	checkbox.click();
            Thread.sleep(5000);
        }
                
        // Close the browser
        driver.quit();
    }
}
