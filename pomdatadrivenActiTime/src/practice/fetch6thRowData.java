package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetch6thRowData 
{
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		String s = wb.getSheet("CheckIssueDate").getRow(1).getCell(1).getStringCellValue();
		System.out.println(s);
	}
}
