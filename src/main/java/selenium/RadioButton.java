package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "/Users/payzapp-automation/Documents/Practice-Demo/MSchool/Java-Selenium/drivers/chromedriver"); // Update the path

        // Create a new instance of ChromeDriver (or any other driver)
        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        String sex = "Custom"; // Male
        // Clicking on Button
        Thread.sleep(2000);
        WebElement radioButton = driver.findElement(By.xpath("//label[text()='"+sex+"']/input"));
        if(radioButton.isEnabled() && radioButton.isSelected()) {
        	System.out.println("Already Selected");
        }
        else {
        	radioButton.click();
            Thread.sleep(5000);
        }
                
        // Close the browser
        driver.quit();
    }
}
