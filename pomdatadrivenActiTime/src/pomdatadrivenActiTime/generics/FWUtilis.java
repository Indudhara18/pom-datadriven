package pomdatadrivenActiTime.generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * This class is used to For FrameWork
 * @author Manu
 *
 */

public class FWUtilis extends BaseTest
{

	public static void verifyPage( WebDriver driver , String expTitle )
	{
		String expectedTitle = expTitle ;
		String actualTitle = driver.getTitle() ;
		
		if ( actualTitle.equals( expectedTitle ) ) 
		{
			System.out.println("Expected page is displayed-->" + expectedTitle);
		}
		else
		{
			System.out.println("Expected page not displayed-->" + actualTitle);
		}		
	}
	
	public static void takeScreenshot(WebDriver driver, String path) throws IOException
	{
		  TakesScreenshot ts = (TakesScreenshot) driver ;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  File des = new File(path);
		  FileUtils.copyFile(src, des);
	}
	
}
