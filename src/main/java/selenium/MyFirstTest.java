package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/payzapp-automation/Documents/Practice-Demo/MSchool/Java-Selenium/drivers/chromedriver"); // Update the path

        // Create a new instance of ChromeDriver (or any other driver)
        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.facebook.com/");

        // Print the page title
        System.out.println("Page Title: " + driver.getTitle());
        //WebElement email_field = driver.findElement(By.id("email"));
        //WebElement email_field = driver.findElement(By.name("email"));
        //WebElement email_field = driver.findElement(By.tagName("input"));
//        WebElement email_field = driver.findElement(By.className("inputtext _55r1 _6luy"));
//        WebElement link = driver.findElement(By.linkText("Forgotten password?"));
//        WebElement link = driver.findElement(By.linkText("Forgotten password?"));
//        link.click();
//        WebElement email_field = driver.findElement(By.cssSelector("input[id=\"email\"]"));
        WebElement email_field = driver.findElement(By.xpath("//input[@id='email']"));
        email_field.sendKeys("Pankaj Gupta");
        Thread.sleep(5000);
        email_field.clear();
        email_field.sendKeys("pankajonlinetutor@gmail.com");
        Thread.sleep(2000);
        
        // Close the browser
        driver.quit();
    }
}
