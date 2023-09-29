package genericPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	//it is use to generic reusable method
		//all methods are non static
		
	   public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	      {
		     FileInputStream fis = new FileInputStream(excelPath);
		     Workbook wb = WorkbookFactory.create(fis);
		     Sheet sheet = wb.getSheet(sheetName);
		     Row row = sheet.getRow(rowCount);
		     Cell cell = row.getCell(cellCount);
		     String data = cell.getStringCellValue();
		     return data;
	       }
	   
		   //write data from excel file 
		   public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCoutn,String data) throws EncryptedDocumentException, IOException
			{
			       FileInputStream fis = new FileInputStream(excelPath);	
			       Workbook wb = WorkbookFactory.create(fis);
			       Sheet sheet = wb.getSheet(sheetName);    
			       Row row = sheet.getRow(rowCount);
			       Cell cell = row.createCell(cellCoutn);
			       cell.setCellValue(data);
			               
			       FileOutputStream fos = new FileOutputStream(excelPath);
			             wb.write(fos);
			}
		   
		   //get the last count
		   public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
		   {
			   FileInputStream fis = new FileInputStream(excelPath);	
		       Workbook wb = WorkbookFactory.create(fis);
		       Sheet sheet = wb.getSheet(sheetName);  
		       int rc = sheet.getLastRowNum();
		           return rc;
		   }
		   
		   public String readPropertyData(String propPath, String key) throws IOException
		   {
			   FileInputStream fis = new FileInputStream(propPath);	 
			   Properties prop = new Properties();
			   prop.load(fis);
			   String data = prop.getProperty(key);
			   return data;
		   }

}
