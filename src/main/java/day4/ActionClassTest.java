package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "/Users/payzapp-automation/Documents/Practice-Demo/MSchool/Java-Selenium/drivers/chromedriver"); // Update the path

        // Create a new instance of ChromeDriver (or any other driver)
        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.facebook.com/");
        
        // Mouse Hover
        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys("Pankaj");
        Thread.sleep(2000);
        
        // Action Class Object
        Actions act = new Actions(driver);
//        act.clickAndHold(userName).perform();
        act.doubleClick(userName).contextClick().perform();
        // Right Click
//        act.contextClick(userName).perform();
        // Send Text Using ACtion Class
        act.sendKeys("Hello").perform();
        
        Thread.sleep(5000);
                
        // Close the browser
        driver.quit();
        
    }
}
