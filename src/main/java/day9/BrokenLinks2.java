package day9;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

public class BrokenLinks2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of ChromeDriver (or any other driver)
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.facebook.com/");
//        driver.findElement(By.linkText("broken link")).click();
        
        List<WebElement> allLink = driver.findElements(By.xpath("//link[contains(@href,'http')]"));
        allLink.get(0);
        System.out.println(allLink.get(0));
        
        
        // After Click 
        String urlString = "https://practice-automation.com/broken-links/missing-page.htm";
        
        
        
        int responseCode = 0;
        
        // Click on Slow Element
        for (int i=0;i<allLink.size();i++) {
        	System.out.println(allLink.get(i));
        	try {
                URL url = new URL(urlString);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                responseCode = connection.getResponseCode();
                System.out.println("Response Code for " + urlString + ": " + responseCode);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        
        // Assertion
        if(responseCode == 404 || responseCode==500 || responseCode == 400) {
        	System.out.println("Link is Broken");
        }
        


        
        // Quit the Browser
        driver.quit();
	}
}
