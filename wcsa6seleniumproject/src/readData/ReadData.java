package readData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
			
         Workbook wb = WorkbookFactory.create(fis);
         
            Sheet sheet = wb.getSheet("IPL");
            
          Row row = sheet.getRow(3);
          
          Cell cell = row.getCell(1);  //get into the desire cell/column
          
          String data = cell.getStringCellValue();
          
          System.out.println(data);
	}
}
