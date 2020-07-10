package pomdatadrivenActiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LicensePage 
{
	// declare the WebElements of License page
	
	@FindBy(xpath="//nobr[contains(text(),'Product Edition:')]/../../td[2]")
	private WebElement productEdition ;
	
	@FindBy( xpath="//nobr[contains(text(),'Issue Date:')]/../../td[2]" )
	private WebElement issueDate ;
	
	// initialise the dclared WebElements
	
	public LicensePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilisation of WebElements by creating setter methods
	
	public void getProductEdition()
	{
		String s = productEdition.getText() ;
		System.out.println("Product Edition is : " + s);
	}
	
	public void getIssueDate()
	{
		String s = issueDate.getText() ;
		System.out.println("Issue Date is : " + s);
	}
	
}
