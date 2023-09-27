package scrollingOperationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillPerticularWebelement {

	public static void main(String[] args) {
		
		WebDriver  driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.selenium.dev/");
		 
		 //webelemwnt is news text
		 
		       WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
		       
		         Point loc = newsElement.getLocation();
		         
		            JavascriptExecutor jse = (JavascriptExecutor)driver;
		            
		            jse.executeScript("window.scrollBy("+loc.getX()+ ","+ (loc.getY()-90)+ ") ") ;
	}
}
