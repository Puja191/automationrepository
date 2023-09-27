package scrollingOperationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver=new ChromeDriver();
		 
		 //driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("file:///C:/Users/hp/Desktop/WebElement/disableWebElement.html");
		 
		        WebElement usn = driver.findElement(By.id("i1"));
		        usn.sendKeys("admin");
		        
		        Thread.sleep(2000);
		        
		           JavascriptExecutor jse = (JavascriptExecutor)driver;
		           
		           jse.executeScript("document.getElmentBy.Id('i2').value='manager'");
		        
		        
	}
}
