package day7;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of ChromeDriver (or any other driver)
        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://the-internet.herokuapp.com/windows");
       
        String MainWindowTitle = driver.getTitle();
        System.out.println("MainWindowTitle --> "+ MainWindowTitle);
        
        driver.findElement(By.linkText("Click Here")).click();
        
        // Get Current Window ID
        String mainWindow = driver.getWindowHandle();
        System.out.println("mainWindow --> "+ mainWindow);
        
        // Get ALL Window ID
        Set<String> allWindow = driver.getWindowHandles();
        System.out.println("allWindow --> "+ allWindow);

        for (String window: allWindow) {
        	if(!window.equals(mainWindow)) {
        		driver.switchTo().window(window);
        	}
        }
        	
//        	for (String handle : allWindowHandles) {
//        	    if (!handle.equals(mainWindowHandle)) {
//        	        driver.switchTo().window(handle);
        
        String ChildWindowTitle = driver.getTitle();
        System.out.println("ChildWindowTitle --> "+ ChildWindowTitle);
        Thread.sleep(2000);
        
        // Try Something in Old Tab
        // We must have to Switch to the Main Window
        driver.switchTo().window(mainWindow);
        driver.findElement(By.linkText("Click Here")).click();
        Thread.sleep(5000);
        
        // Quit the Browser
        driver.close();
	}
}
