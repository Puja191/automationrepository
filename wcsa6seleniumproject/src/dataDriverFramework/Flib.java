package dataDriverFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

		//it is use to store Generic Reusable Method
		//all are non static
		
	// read the data from Excel sheet
		public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCoutn) throws EncryptedDocumentException, IOException
		{
		     FileInputStream fis = new FileInputStream(excelPath);	
		       Workbook wb = WorkbookFactory.create(fis);
		            Sheet sheet = wb.getSheet(sheetName);    
		      Row row = sheet.getRow(rowCount);
		      Cell cell = row.getCell(cellCoutn);
		     String data=cell.getStringCellValue();
		      return data;
		}
		
		// write data from excel sheet
		public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCoutn,String data) throws EncryptedDocumentException, IOException
		{
		     FileInputStream fis = new FileInputStream(excelPath);	
		       Workbook wb = WorkbookFactory.create(fis);
		            Sheet sheet = wb.getSheet(sheetName);    
		      Row row = sheet.createRow(rowCount);
		      Cell cell = row.getCell(cellCoutn);
		               cell.setCellValue(data);
		               
		             FileOutputStream fos = new FileOutputStream(excelPath);
		             
		             wb.write(fos);
		}
		
		//get the last row count
		public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException
	      {
	    	  FileInputStream fis = new FileInputStream(excelPath);
	    	  Workbook wb = WorkbookFactory.create(fis);
	    	  Sheet sheet = wb.getSheet(sheetName);
	    	  int row = sheet.getLastRowNum();//it is use to get last count of row where we store the data
	          return row;
	      }


}