package readMultipleData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		
        Workbook wb = WorkbookFactory.create(fis);  // make the file ready
        
                 Sheet sheet = wb.getSheet("IPL");
                 
               Row row = sheet.getRow(1);
               
            Cell cell = row.createCell(2);
          //pass the value for cell 
                 cell.setCellValue("Ranchi");
               //to  
                 FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
                 
                 wb.write(fos);
	}
}
