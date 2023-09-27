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

public class WriteExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		
        Workbook wb = WorkbookFactory.create(fis);  // make the file ready
        
           Sheet sheet = wb.getSheet("IPL");  // provide sheet name
           
         Row row = sheet.getRow(8); // get into the desired row
         
             Cell cell = row.createCell(0);
             
             cell.setCellValue("SRH");
             FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
             
             wb.write(fos);
	}
}
