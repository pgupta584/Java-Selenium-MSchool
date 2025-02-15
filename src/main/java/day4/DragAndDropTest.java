package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "/Users/payzapp-automation/Documents/Practice-Demo/MSchool/Java-Selenium/drivers/chromedriver"); // Update the path

        // Create a new instance of ChromeDriver (or any other driver)
        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://the-internet.herokuapp.com/");
        
        // Mouse Hover
        WebElement dragAndDrop = driver.findElement(By.xpath("//a[text()=\"Drag and Drop\"]"));
        dragAndDrop.click();
        Thread.sleep(2000);

        WebElement source_element = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement target_element = driver.findElement(By.xpath("//div[@id='column-b']"));
        
        // ACtion Class Object
        Actions act = new Actions(driver);
        act.dragAndDrop(source_element, target_element).perform();
        act.contextClick(source_element).perform();
        
        Thread.sleep(5000);
                
        // Close the browser
        driver.quit();
        
    }
}
