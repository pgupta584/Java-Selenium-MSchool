package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of ChromeDriver (or any other driver)
        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.jotform.com/form/232851259741056");
        
        // Find the WebElement
        WebElement DayDropDown = driver.findElement(By.id("select2-w5gu-container"));
        WebElement DayDropDown2 = driver.findElement(By.id("select2-jy4q-container"));

        
        // Creation Select
        Select sel = new Select(DayDropDown);
        sel.selectByVisibleText("Group B");
        
        Thread.sleep(4000);
        
        Select sel2 = new Select(DayDropDown2);
        sel2.selectByVisibleText("Option B2");
        Thread.sleep(4000);
        
        driver.quit();

	}
}
