package Generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public static String fetch(int r,int c) throws EncryptedDocumentException, IOException {
	
		FileInputStream f1 = new FileInputStream("./excel/Book1.xlsx");
		Workbook book = WorkbookFactory.create(f1);
		Sheet sheet = book.getSheet("Sheet1");
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		String data = cell.toString();
		
		return data;
	}
	
}
