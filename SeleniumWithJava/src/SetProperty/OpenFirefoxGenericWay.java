package SetProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxGenericWay {

	public static void main(String[] args) {
        //Absolute path
		String driverpath1="F:\\Workspace java\\SeleniumWithJava\\Executables\\geckodriver.exe";
		//Relative Path  --> '.' indicate current working dir
		String driverpath2=".\\Executables\\geckodriver.exe";
		//using system class
		String driverpath3=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", driverpath3);
		//create an instance of required browser class
		WebDriver fdriver=new FirefoxDriver();
		fdriver.close();
		
		
	}
	
}
