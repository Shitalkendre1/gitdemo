package Com.InetBaking.BaseClass;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Com.InetBaking.ConfigProperties.Com_Banking_ReadConfig;

public class Com_Banking_BaseClass {

	Com_Banking_ReadConfig readcon= new Com_Banking_ReadConfig();
	 
	 public String URL= readcon.GetApplicationURL();
	public String UserName=readcon.GetUsername();
	public String pass= readcon.GetPassword();
	public static WebDriver driver ; 
	public static Logger logger ;
	public void SetUp(String brwosername) {
		logger = logger.getLogger("Inet_banking_v1");
		PropertyConfigurator.configure("Log4j.properties");
		
		if (brwosername.equals("Chrome")) { // True
			System.setProperty("webdriver.chrome.driver", readcon.Chomepath());
			driver = new ChromeDriver(); // Top open the browser
		} else if (brwosername.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\shita\\OneDrive\\Desktop\\BankingDomainProject\\BrowserDrivers\\msedgedriver 108.exe");
			driver = new EdgeDriver();
	}
	
	
}}
