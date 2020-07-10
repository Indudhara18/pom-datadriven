package pomdatadrivenActiTime.scripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import pomdatadrivenActiTime.generics.FWUtilis;
import pomdatadrivenActiTime.pages.LoginPage;


public class TestValidLoginPage extends FWUtilis
{

	public static void main(String[] args) throws InterruptedException , IOException
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		String un = wb.getSheet("sheet1").getRow(1).getCell(0).toString() ;
		String pw = wb.getSheet("sheet1").getRow(1).getCell(1).toString();
		
		openApplication("chrome");
		
		LoginPage lp = new LoginPage(driver);
		
		verifyPage(driver, LPTITLE);
		lp.setUsername( un );
		lp.setPassword( pw );
		lp.clickLoginButton();
		Thread.sleep(2000);
		verifyPage(driver, ETTPTITLE);
		
		takeScreenshot(driver, "./photo/and.jpg");
		
		closeApplication();
		
	}
	
}
