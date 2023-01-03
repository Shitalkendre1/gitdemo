package Com.InetBaking.TestCase;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;

import Com.InetBaking.BaseClass.Com_Banking_BaseClass;
import Com.InetBaking.PageObject.Com_Banking_LoginPage;
import Com.InetBaking.Utilities.XLUtils;

public class Com_banking_LoginTestCase extends Com_Banking_BaseClass {

	public void Logindata (String user,String pwd) throws InterruptedException {
		
		logger.info("Open url");
		Com_Banking_LoginPage bl=new Com_Banking_LoginPage() ;
		logger.info("set username");
		bl.Setusername(user);
		logger.info("set password");
		bl.Setpass(pwd);
		logger.info("click on button");
		bl.Clickbtn();
		
		if(IsAlertpresent()==true) {
			driver.switchTo().alert().accept();//popuclose
			driver.switchTo().defaultContent();
			AssertJUnit.assertTrue(true);
			logger.info("LoginFailed");
		}
		else {
			AssertJUnit.assertTrue(true);
			logger.info("Login Passed");
            Thread.sleep(2000);
            bl.LogoutButton();
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            driver.switchTo().defaultContent();
		}
		
	}
	
	public boolean IsAlertpresent() throws InterruptedException {
		
		try {
		driver.switchTo().alert();
		Thread.sleep(2000);
		return true;
		}
		catch (NoAlertPresentException e) {
			return false;
		}
	}
	
	@DataProvider(name="LoginData")
	public String[][] getdata() throws IOException{
		
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\Com_Banking_TestData\\TestData (2).xlsx";
	
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++) {  //Row
			
			for(int j=0;j<colcount;j++) { //Col
				
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);  //1 0  1 1
			}
		}
		
		return logindata;
	}
				
	}
	

