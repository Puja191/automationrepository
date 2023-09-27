package pomPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keyDriverFramework.Flib;

public class BaseTest extends Flib implements IautoConstant {

	private static WebDriver driver;
	public void openBrowser() throws IOException
	{
		 Flib flib = new Flib();
		    
         String browserValue = flib.readPropertyData(PROP_PATH , "Browser");
         
            String url = flib.readPropertyData(PROP_PATH, "Url");
            
            if(browserValue.equalsIgnoreCase("chrome"))
            {
              driver=new ChromeDriver();
            }
            else if(browserValue.equalsIgnoreCase("firefox"))
            {
            	driver=new FirefoxDriver();
            }
            else if(browserValue.equalsIgnoreCase("Edge"))
            {
            	driver=new EdgeDriver();
            }
            
            else
            {
            	System.out.println("enter the valid browser value!!");
            }
            
          driver.manage().window().maximize();
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		    
		    driver.get(url);
	}
	
	   public void closeBrowser()
	   {
		   driver.quit();
	   }
	
}
