package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataintoExcel 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		// create file to fetch data from excel
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		// create sheet
		Sheet sheet = wb.createSheet("sheet2");
		// create row
		Row row = sheet.createRow(0);
		// create cell
		Cell cell = row.createCell(0);
		// set the value into created cell
		cell.setCellValue("User Name");
		
		// save the excel file after writing data into it
		wb.write(new FileOutputStream("./data/input.xlsx"));
				
		// sheet, row already created
		wb.getSheet("sheet2").getRow(0).createCell(1).setCellValue("Password");
		
		// save the excel file after writing data into it
		wb.write(new FileOutputStream("./data/input.xlsx"));
		
	}
	
}
