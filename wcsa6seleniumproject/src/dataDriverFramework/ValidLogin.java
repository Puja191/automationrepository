package dataDriverFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://desktop-f6unpi1/user/submit_tt.do");
		
		 FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
			
         Workbook wb = WorkbookFactory.create(fis);  // make the file ready
         
            Sheet sheet = wb.getSheet("validcreds");  // provide sheet name
            
          Row row = sheet.getRow(1); // get into the desired row
          
          Cell cell = row.getCell(0); 
          
          String username = cell.getStringCellValue();
          Thread.sleep(2000);
          
          FileInputStream fis1 = new FileInputStream("./data/ActiTimeTestData.xlsx");
			
          Workbook wb1 = WorkbookFactory.create(fis1);  // make the file ready
          
             Sheet sheet1 = wb1.getSheet("validcreds");  // provide sheet name
             
           Row row1 = sheet1.getRow(1); // get into the desired row
           
           Cell cell1 = row1.getCell(1); 
           
           String  password = cell1.getStringCellValue();
           
           Thread.sleep(2000);
           driver.findElement(By.name("username")).sendKeys(username);
           Thread.sleep(2000);
  		 driver.findElement(By.name("pwd")).sendKeys(password);
  		Thread.sleep(2000);
  		 driver.findElement(By.xpath("//a[text()='Login']")).click();
  		Thread.sleep(5000);
  		 driver.quit();
	}
}
