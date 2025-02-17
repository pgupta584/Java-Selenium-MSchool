package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of ChromeDriver (or any other driver)
        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        
        // Find the WebElement
        List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
       
        
        for (int i=0; i<checkboxs.size(); i++) {
        	checkboxs.get(i).click();
     
        }
        Thread.sleep(5000);
        
        driver.quit();

	}
}
