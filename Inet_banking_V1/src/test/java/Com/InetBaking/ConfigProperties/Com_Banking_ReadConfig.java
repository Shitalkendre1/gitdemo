package Com.InetBaking.ConfigProperties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Com_Banking_ReadConfig {
	Properties pro;
	public Com_Banking_ReadConfig() {
	File src= new File("C:\\Users\\shita\\OneDrive\\Desktop\\BankingDomainProject\\src\\test\\java\\Com\\InetBaking\\ConfigProperties\\ConfigProperties");
	
	try {
	FileInputStream file=new FileInputStream(src);
    pro=new Properties();
    pro.load(file);
			
}
	catch(Exception e) {
		System.out.println("Exception is"+e.getMessage());
	}}
	public String GetApplicationURL() {
		String url=pro.getProperty("BaseURL");
		return url;
	}
	public String GetUsername() {
		String username= pro.getProperty("Username1");
		return username;
	}
	public String GetPassword() {
		String password= pro.getProperty("Password");
		return password;
	}
	public String Chomepath() {
		String chromepath= pro.getProperty("Chromepath1");
		return chromepath;
	}
	public String Edgepath() {
		String edgepath=pro.getProperty("edgepath1");
		return edgepath;
	}
}
