package methodWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindoeHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://omayo.blogspot.com/");
		 
		    Thread.sleep(3000);
		 //scroll till open a popup window link
		 
		          WebElement childBrowser = driver.findElement(By.partialLinkText("Open a popup window"));
		          
		        JavascriptExecutor jse = (JavascriptExecutor)driver;
		        
		        jse.executeScript("arguments[0].ScrollIntoView(true)",childBrowser);
		        
		        childBrowser.click();
		        
		         Set<String> allHandles = driver.getWindowHandles();
		         
		         System.out.println(allHandles);
		         
		        for(String wh:allHandles) 
		        {
		        	
		        }
		         
		       
	}
}
