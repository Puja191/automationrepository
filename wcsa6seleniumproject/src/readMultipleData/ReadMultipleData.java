package readMultipleData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		for(int i=1; i<=4; i++)
		{
		   FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
	
	         Workbook wb = WorkbookFactory.create(fis);  // make the file ready
	         
	            Sheet sheet = wb.getSheet("IPL");  // provide sheet name
	            
	          Row row = sheet.getRow(i); // get into the desired row
	          
	          Cell cell = row.getCell(1);  // get into the desire cell/column
	          
	             String data = cell.getStringCellValue();  // it will read the value
	             
	             System.out.println(data);
		}
	}
	
}
