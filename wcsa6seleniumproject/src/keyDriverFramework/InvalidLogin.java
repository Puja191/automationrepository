package keyDriverFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvalidLogin extends BaseTest {
	
	private static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
        bt.openBrowser();
        
      Flib flib = new Flib();
        
         int rc = flib.getLastRowCount( EXCEL_PATH, INVALID_SHEETNAME);
         
         Thread.sleep(2000);
         
         for(int i=1; i<rc; i++)
         {
        	 driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH ,"Username"));
	          
	          driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH , "Password"));
	          
	          driver.findElement(By.id("loginButton")).click();
	          
	          driver.findElement(By.name("username")).clear();
         }
         Thread.sleep(2000);
         bt.closeBrowser();
	}
}
