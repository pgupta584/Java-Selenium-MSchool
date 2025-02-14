package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsTest1 {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/payzapp-automation/Documents/Practice-Demo/MSchool/Java-Selenium/drivers/chromedriver"); // Update the path

        // Create a new instance of ChromeDriver (or any other driver)
        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.facebook.com/");

        // Print the page title
        System.out.println("Page Title: " + driver.getTitle());
        
        // Clicking on Button
        // WebElement button = driver.findElement(By.linkText("Create new account"));
        WebElement button = driver.findElement(By.xpath("(//a[@role=\"button\"])[2]"));

        button.click();
        
        // Close the browser
        driver.quit();
    }
}
