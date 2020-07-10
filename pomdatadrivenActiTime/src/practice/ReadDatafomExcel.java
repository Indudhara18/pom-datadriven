package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDatafomExcel 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
	 // create a file for fetching data from excel
//	 Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
	 // from book get sheet
//	 Sheet sheet = wb.getSheet("sheet1");
	 // from sheet get row	
//	 Row row = sheet.getRow(1);
	 // from row get cell	
//	 Cell cell = row.getCell(0);
	 // in cell get data present in it	
//	 String value = cell.getStringCellValue();
//	 System.out.println("username : " + value);
	
		
	 // code optimaisation	
	 Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
	 String s = wb.getSheet("sheet1").getRow(1).getCell(1).toString();		
	 // toString() can also be used in place of getStringCellValue
	 System.out.println("username :" + s);
	 
	 
	 
	 
	 
	}
}
