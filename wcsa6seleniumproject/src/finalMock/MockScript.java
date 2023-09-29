package finalMock;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class MockScript {

	public static void main(String[] args) throws IOException {    
	     
         WebDriver  driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.selenium.dev/");
		 
		 
		       WebElement newsElement = driver.findElement(By.xpath("//h2[text()='News']"));
		       
		         Point loc = newsElement.getLocation();
		         
		            JavascriptExecutor jse = (JavascriptExecutor)driver;
		            
		            jse.executeScript("window.scrollBy("+loc.getX()+ ","+ (loc.getY()-90)+ ") ") ;
	     
		            TakesScreenshot ts = (TakesScreenshot)driver;
		    		
		    		File src = ts.getScreenshotAs(OutputType.FILE);
		    		File dest = new File("./Screenshots/ss1.png");
		    		
		    		Files.copy(src, dest);
	}
}
