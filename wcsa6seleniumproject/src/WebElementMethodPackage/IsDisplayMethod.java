package WebElementMethodPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayMethod {

	    public static void main(String[] args) {
			
	    	 WebDriver	driver=new ChromeDriver();
		      
		      driver.manage().window().maximize();
			    
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			    
			    driver.get("http://desktop-f6unpi1/login.do");
			    
			    //To check whether the checkbox is display or not
			    driver.findElement(By.name("remember")).click();
			    
			    WebElement checkBox = driver.findElement(By.name("remember"));
			      
		     boolean res = checkBox.isDisplayed();
		     
		     System.out.println(res);
		     
		     // To check the login button of instgram is enable or disable
		     driver.navigate().to("https://www.instagram.com/");
		     
		     driver.findElement(By.name("username")).sendKeys("p@1234");
			 
			 driver.findElement(By.name("password")).sendKeys("123456");
			 
		       WebElement loginButton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
			     
		          boolean result = loginButton.isEnabled();
		       System.out.println(result);
		}
}
