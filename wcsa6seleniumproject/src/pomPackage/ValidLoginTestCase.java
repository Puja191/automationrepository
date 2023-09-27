package pomPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class ValidLoginTestCase extends BaseTest  {

	private static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		

	// to open & close browser
	    BaseTest bt = new BaseTest();
	    bt.openBrowser();
	    
	    //perform 
	    //
	   
	      LoginPage lp = new LoginPage(driver) ; 
	      
	    Flib flib = new Flib();
	      
	     lp.validLogin(flib.readPropertyData(PROP_PATH ,"Username"),flib.readPropertyData(PROP_PATH , "Password"));
	     
	     Thread.sleep(2000);
	     bt.closeBrowser();
 }
}
