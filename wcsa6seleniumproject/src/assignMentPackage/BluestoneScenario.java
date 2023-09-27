package assignMentPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneScenario {

	public static void main(String[] args) {
		
 WebDriver  driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.bluestone.com/");
		 
		 driver.findElement(By.id("denyBtn")).click();
		 
	        WebElement target = driver.findElement(By.xpath("//a[text()='Rings ']"));
	        
	        target.click();
		 
	       Actions act = new Actions(driver);
		act.moveToElement(target);
	      act.moveToElement(target).perform();
	      
	           List<WebElement> allPrice = driver.findElements(By.xpath("//span[@class='b-price-wrapper']/ancestor::span[@class='p-wrap']"));
	        
	           act.moveToElement((WebElement) allPrice).perform();
	           
		      for(int i=0; i<allPrice.size(); i++)
		      {
		    	System.out.println(allPrice.get(i).getText());  
		      }
			
	}
}
