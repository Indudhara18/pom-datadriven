package pomdatadrivenActiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	// declare the WebElements present in LoginPage 
	
	@FindBy(name="username")
	private WebElement unTB ;
	
	@FindBy(name="pwd")
	private WebElement pwTB ;
	
	@FindBy(id="loginButton")
	private WebElement lgnBTN ;
	
	@FindBy(xpath="//span[contains(text(),'invalid.')]")
	private WebElement errMSG ;
	
	// initialise the declared WebElements 
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilisation of WebElements
	public void setUsername(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLoginButton()
	{
		lgnBTN.click();
	}
	
	public void checkErrorMessage()
	{
		if( errMSG.isDisplayed() )
		{
			System.out.println("Error Message displayed :"+ errMSG.getText());
		}	
		
		else
		{
			System.out.println("Error Message not displayed ");
		}	
		
	}
}
