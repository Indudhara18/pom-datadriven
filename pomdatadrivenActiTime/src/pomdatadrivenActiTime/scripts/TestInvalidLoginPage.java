package pomdatadrivenActiTime.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import pomdatadrivenActiTime.generics.FWUtilis;
import pomdatadrivenActiTime.pages.LoginPage;

public class TestInvalidLoginPage extends FWUtilis
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException 
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		String un1 = wb.getSheet("sheet2").getRow(1).getCell(0).toString();	
		String pw1 = wb.getSheet("sheet2").getRow(1).getCell(1).toString();
		
		String un2 = wb.getSheet("sheet2").getRow(2).getCell(0).toString();
		String pw2 = wb.getSheet("sheet2").getRow(2).getCell(1).toString();
		

		String un3 = wb.getSheet("sheet2").getRow(3).getCell(0).toString();
		String pw3 = wb.getSheet("sheet2").getRow(3).getCell(1).toString();
		
		String un4 = wb.getSheet("sheet1").getRow(1).getCell(0).toString();
		String pw4 = wb.getSheet("sheet1").getRow(1).getCell(1).toString();
		
		
		openApplication("chrome");
		
		LoginPage lp = new LoginPage(driver);
		
		verifyPage(driver, LPTITLE);
		
		lp.setUsername( un1 );
		lp.setPassword( pw1 );
		lp.clickLoginButton();
		Thread.sleep(1000);
		lp.checkErrorMessage();
		
		lp.setUsername(un2);
		lp.setPassword(pw2);
		Thread.sleep(1000);
		lp.checkErrorMessage();
		
		lp.setUsername(un3);
		lp.setPassword(pw3);
		Thread.sleep(1000);
		lp.checkErrorMessage();
		
		lp.clickLoginButton();
		Thread.sleep(1000);
		lp.checkErrorMessage();
		
		lp.setUsername( un4 );
		lp.clickLoginButton();
		Thread.sleep(1000);
		lp.checkErrorMessage();
		
		lp.setPassword( pw4 );
		lp.clickLoginButton();
		Thread.sleep(1000);
		lp.checkErrorMessage();
		
		closeApplication();
		
	}
	
	
}
