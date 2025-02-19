package day7;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of ChromeDriver (or any other driver)
        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://the-internet.herokuapp.com/iframe");
        
        // Get the Normal Text before iFrame
        String mainText = driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']")).getText();
        System.out.println("mainText --> "+ mainText);
        
        // Switch to the iFrame
        driver.switchTo().frame("mce_0_ifr");
       
        WebElement iframe = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        String text = iframe.getText();
        System.out.println("text --> "+text);
        
        // Must Switch to Main Content
        driver.switchTo().defaultContent();
        
        // Get the Normal Text After Switching to iFrame
        String mainTextAfterSwitch = driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']")).getText();
        System.out.println("mainTextAfterSwitch --> "+ mainTextAfterSwitch);
        
        // Quit the Browser
        driver.quit();
	}
}
