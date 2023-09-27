package pomPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class InvalidLoginTestVCase extends BaseTest{
	
	private static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
	    bt.openBrowser();
	    
	        LoginPage lp = new LoginPage(driver);
	        
	         Flib flib = new Flib();
	         
	         int rc = flib.getLastRowCount( EXCEL_PATH, INVALID_SHEETNAME);
	         
	         for(int i=1; i<=rc; i++)
	         {
	         lp.inValidLogin(flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME,i,0),flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i,1));

	         }
	        
	         Thread.sleep(2000);
		     bt.closeBrowser();
	}
}
