package pomdatadrivenActiTime.scripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import pomdatadrivenActiTime.generics.FWUtilis;
import pomdatadrivenActiTime.pages.EnterTimeTrackPage;
import pomdatadrivenActiTime.pages.LicensePage;
import pomdatadrivenActiTime.pages.LoginPage;


public class TestIssueDate extends FWUtilis
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		Workbook  wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
		String un = wb.getSheet("sheet1").getRow(1).getCell(0).toString();
		String pw = wb.getSheet("sheet1").getRow(1).getCell(1).toString();
		
		openApplication("firefox");
		
		verifyPage(driver, LPTITLE);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername( un );
		lp.setPassword( pw );
		lp.clickLoginButton();
		Thread.sleep(1000);
		
		verifyPage(driver, ETTPTITLE);
		
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		etp.clickSettings();
		etp.clickLicense();
		Thread.sleep(1000);
		
		verifyPage(driver, LICPTITLE);
		
		LicensePage lip = new LicensePage(driver);
		lip.getIssueDate();
		
		Thread.sleep(1000);
		takeScreenshot(driver, "./photo/1.jpg ");
		Thread.sleep(1000);
		
		closeApplication();
	}
	
}
