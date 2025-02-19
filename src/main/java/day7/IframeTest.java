package day7;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of ChromeDriver (or any other driver)
        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://the-internet.herokuapp.com/iframe");
        
        // Switch to the iFrame
        driver.switchTo().frame("mce_0_ifr");
       
        WebElement iframe = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        String text = iframe.getText();
        System.out.println("text --> "+text);
        
        // Quit the Browser
        driver.quit();
	}
}
