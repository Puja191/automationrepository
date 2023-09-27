package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.bluestone.com/");
	
		 driver.findElement(By.id("denyBtn")).click();
		 
		 //this chat design under frame
		 //handle frame first by identifying it....
		 Thread.sleep(2000);
		 //by using index value
		 //driver.switchTo().frame(3);
		 
		 //by using id & name attribute
		// driver.switchTo().frame("fc_widget");
		 
		 //by using frame element
		  WebElement frameElement = driver.findElement(By.id("fc_widget"));
		   
		     driver.switchTo().frame(frameElement);
		 
		      WebElement chatIcon = driver.findElement(By.id("chat-icon"));
		      chatIcon.click();
		      
		      //switch control to main page
		     // driver.switchTo().defaultContent();
		      
		      //switch control parent frame
		      driver.switchTo().parentFrame();
		      
		      driver.findElement(By.id("chat-fc-name")).sendKeys("admin");
		      
		      driver.findElement(By.id("chat-fc-email")).sendKeys("admin@gmail.com");
		      
		      driver.findElement(By.id("chat-fc-phone")).sendKeys("123457890");
		      
		      
	}
}
