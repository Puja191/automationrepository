package WebElementMethodPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
 
	public static void main(String[] args) {
		
	      WebDriver	driver=new ChromeDriver();
	      
	      driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    
		    driver.get("http://desktop-f6unpi1/login.do");
		    
		    driver.findElement(By.name("remember")).click();
		    
		      WebElement checkBox = driver.findElement(By.name("remember"));
		      
		        System.out.println(checkBox);
		     
		     boolean res = checkBox.isDisplayed();
		     
		     System.out.println(res);
	}
}
