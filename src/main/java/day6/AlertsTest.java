package day6;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of ChromeDriver (or any other driver)
        ChromeDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        
//        // Simple Alert
//        driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
//        
//        // Switch Driver to Alert
//        Alert alt = driver.switchTo().alert();
//        // Accept the alert
//        alt.accept();
        
//        // // Confirmation Alert
//        WebElement jsConfirm = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
//        jsConfirm.click();
//        
//        // Switch Driver to Alert
//        Alert alt = driver.switchTo().alert();
//        // Accept the alert
//        //alt.accept();
//        // Dismiss the alert
//        Thread.sleep(5000);
//        alt.dismiss();
//        // Verify Accept
//        WebElement confirmationMessage = driver.findElement(By.xpath("//*[text()=\"Result:\"]/following::p"));
//        String text = confirmationMessage.getText();
//        System.out.println(text);
//        
//        if(text.contains("Cancel")) {
//        	System.out.println("Test Pass");
//        }else {
//        	System.out.println("Test Failed");
//        }
        
        // Promt Alert
        String promt_text = "Hello Buddy";
        WebElement promt = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        promt.click();
        Thread.sleep(5000);
        // Switch Driver to Alert
        Alert alt = driver.switchTo().alert();
        alt.sendKeys(promt_text);
        alt.accept();
        
	    WebElement confirmationMessage = driver.findElement(By.xpath("//*[text()=\"Result:\"]/following::p"));
	    String text = confirmationMessage.getText();
        
        if(text.contains(promt_text)) {
        	System.out.println("Test Pass");
        }else {
        	System.out.println("Test Failed");
        }
        
        driver.quit();

	}
}
