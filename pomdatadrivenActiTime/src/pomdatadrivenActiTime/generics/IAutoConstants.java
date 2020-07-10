package pomdatadrivenActiTime.generics;

public interface IAutoConstants 
{
	
	// by default public static final will be added by compiler
	
	String CHROME_KEY = "webdriver.chrome.driver" ;
	String CHROME_VALUE = "./driver/chromedriver.exe" ;
	
	String GECKO_KEY = "webdriver.gecko.driver" ;
	String GECKO_VALUE = "./driver/geckodriver.exe" ;
	
	String URL = "http://localhost/login.do" ;
	
	long ITO = 20 ;
	
	String LPTITLE = "actiTIME - Login" ;
	String ETTPTITLE = "actiTIME - Enter Time-Track" ;
	String TLTITLE = "actiTIME - Task List" ;
	String LICPTITLE = "actiTIME - Licenses" ;
	
}
