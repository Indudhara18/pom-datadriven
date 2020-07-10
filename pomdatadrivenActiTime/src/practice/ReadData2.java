package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData2 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, FileNotFoundException
	{											  // Workbookfactory        , FileInputStream, path 
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		String value = wb.getSheet("sheet1").getRow(1).getCell(0).toString();
		System.out.println(value);
		
		double s = wb.getSheet("sheet1").getRow(2).getCell(0).getNumericCellValue();	// numeric cell in excel
		System.out.println("get Numeric value : " + s );	// 10.0 because in excel it will take by default double
		
		String s1 = wb.getSheet("sheet1").getRow(2).getCell(1).getStringCellValue() ; // String cell in excel
		System.out.println("get String value : " + s1);
		
	}

}
