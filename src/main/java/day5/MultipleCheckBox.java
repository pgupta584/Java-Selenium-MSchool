package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of ChromeDriver (or any other driver)
        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        
        // Find the WebElement
        WebElement DayDropDown = driver.findElement(By.id("day"));
        
        // Creation Select
        Select sel = new Select(DayDropDown);
        
        // Select By Index
        sel.selectByIndex(4);
        Thread.sleep(5000);
        
        // Select by Visible Text
        sel.selectByVisibleText("20");
        Thread.sleep(5000);
        
        // Select by Values
        sel.selectByValue("8");
        Thread.sleep(5000);
        
        // Get All the Options
        List<WebElement> options = sel.getOptions();
        for (int i=0; i<options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
//        for (WebElement option : options) {
//            System.out.println(option.getText());
//        }
        
        // Get Text
        WebElement button = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
        String button_text= button.getText();
        System.out.println(button_text);
        
        driver.quit();

	}
}
