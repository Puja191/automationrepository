package scrollingOperationPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_ScrollDown {

	public static void main(String[] args) {
		
           WebDriver  driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.selenium.dev/");
		 
		 //
		         JavascriptExecutor jse = (JavascriptExecutor)driver;
		         
		         //scrolling up
		         jse.executeScript("window.ScrollBy(0,500)");
		         
		         //scrolling down
		         jse.executeScript("window.ScrollBy(0,-500)");
	}
	
}
