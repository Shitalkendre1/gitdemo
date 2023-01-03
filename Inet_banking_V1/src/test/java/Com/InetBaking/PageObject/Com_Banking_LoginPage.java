package Com.InetBaking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.InetBaking.BaseClass.Com_Banking_BaseClass;

public class Com_Banking_LoginPage extends Com_Banking_BaseClass {

	public Com_Banking_LoginPage() {
		PageFactory.initElements(driver,this);
	}

@FindBy(name="uid") 
public WebElement username;
@FindBy(xpath = "//input[@name=\"password\"]")
public WebElement Password;

@FindBy(name = "btnLogin")
public WebElement LoginBtn;

@FindBy(xpath = "//a[contains(text(),'Log out')]")
public WebElement LogoutBtn;

public void Setusername(String uname) {
	username.sendKeys(uname);
}
	
public void Setpass(String pwd) {
	Password.sendKeys(pwd);
}

public void Clickbtn() {
	LoginBtn.click();
}
public void LogoutButton() {
	LogoutBtn.click();
}
}
	
	
	

