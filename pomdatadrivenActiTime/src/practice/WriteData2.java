package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData2 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		Workbook wb =WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));

		wb.getSheet("sheet2").createRow(1).createCell(0).setCellValue("1234");
		wb.write(new FileOutputStream("./data/input.xlsx"));
		
		System.out.println( wb.getSheet("sheet2").getRow(1).getCell(0).getStringCellValue() );
		
		
	}
	
}
