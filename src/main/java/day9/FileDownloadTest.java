package day9;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class FileDownloadTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of ChromeDriver (or any other driver)
//        WebDriver driver = new ChromeDriver();
      String downloadDir = "/Users/payzapp-automation/Documents/Practice-Demo/MSchool/Java-Selenium/fileDownloads";
      ChromeOptions options = new ChromeOptions();
   // Set preferences for file download
      options.addArguments("--headless");
      
      options.setExperimentalOption("prefs", Map.of(
              "download.default_directory", downloadDir,  // Custom download directory
              "download.prompt_for_download", false,      // Disable download prompt
              "download.directory_upgrade", true          // Enable download directory upgrade
      ));
//      options.addArguments("download.default_directory=/Users/payzapp-automation/Documents/Practice-Demo/MSchool/Java-Selenium/fileDownloads"); // Set your desired directory
      WebDriver driver = new ChromeDriver(options);

        // Open a web site
      driver.get("https://the-internet.herokuapp.com/download");
        
	    // File Download Button
	    WebElement file = driver.findElement(By.linkText("sample_media_file.png"));
	    file.click();

        

        
        // Wait
        Thread.sleep(5000);
        System.out.println("Test Completed");

        
        // Quit the Browser
        driver.quit();
	}
}
