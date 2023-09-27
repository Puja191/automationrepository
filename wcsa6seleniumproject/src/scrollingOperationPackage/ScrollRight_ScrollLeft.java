package scrollingOperationPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight_ScrollLeft {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		 
		     JavascriptExecutor jse = (JavascriptExecutor)driver;
		     
		     for(int i=0;i<2;i++)
		     {
		    	 jse.executeScript("window.ScrollBy(500,0)");
		    	 Thread.sleep(2000);
		     }
		     
		     Thread.sleep(2000);
		     for(int i=0;i<2;i++)
		     {
		    	 jse.executeScript("window.ScrollBy(-500,0)");
		    	 Thread.sleep(2000);
		     }
	}
}
