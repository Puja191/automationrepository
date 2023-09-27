package assignMentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://omayo.blogspot.com/");
		 
          driver.findElement(By.partialLinkText("Open a popup window"));
          
          Thread.sleep(3000);
 		 //scroll till open a popup window link
 		 
 		          WebElement childBrowser = driver.findElement(By.partialLinkText("Open a popup window"));
 		          
 		        JavascriptExecutor jse = (JavascriptExecutor)driver;
 		        
 		        jse.executeScript("arguments[0].ScrollIntoView(true)",childBrowser);
 		        
 		        childBrowser.click();
		 
		 driver.quit();

	}
}
