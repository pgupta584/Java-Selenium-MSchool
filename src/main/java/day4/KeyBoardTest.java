package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardTest {
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
        WebElement password = driver.findElement(By.id("passContainer"));
        
        // ACtion Class Object
        Actions act = new Actions(driver);
        act.contextClick(userName).perform();

        
        // Copy
        act.sendKeys(Keys.CONTROL, "a").build().perform();
        
        // Paste
        act.sendKeys(Keys.CONTROL, "c").build().perform();

       
        Thread.sleep(5000);
                
        // Close the browser
        driver.quit();
        
    }
}
