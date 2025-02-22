package day10;
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

public class BrokenLinks3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of ChromeDriver (or any other driver)
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.facebook.com/");
//        driver.findElement(By.linkText("broken link")).click();
        
//        List<WebElement> allLink = driver.findElements(By.xpath("//link[contains(@href,'http')]"));
//        allLink.get(0);
//        System.out.println(allLink.get(0));
//        
//        
//        // After Click 
//        String urlString = "https://practice-automation.com/broken-links/missing-page.htm";
//        
//        
//        
//        int responseCode = 0;

        List<WebElement> allLinks = driver.findElements(By.xpath("//a[@href]"));
        for (WebElement allLink1 : allLinks) {
           String links = allLink1.getDomProperty("href");
            System.out.println(links);
            try {
                assert links != null;
                URL url = new URL(links);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                int response = connection.getResponseCode();
                String responseMessage = connection.getResponseMessage();
                System.out.println(responseMessage);

                System.out.println(response);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
     // Quit the Browser
        driver.quit();
	}
}
