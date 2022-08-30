package SetProperty;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DiffpathWithFirefox {

	public static void main(String[] args) {
		// Absolute path
		String driverpath1="F:\\Workspace java\\SeleniumWithJava\\Executables\\geckodriver.exe";
		//or Relative path --> '.' indicate current working dir
		String driverpath2=".\\Executables\\geckodriver.exe";
		//or using System class
		String driverpath3=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";//casesensitive
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", driverpath3);
		//create an instance of required browser class
		FirefoxDriver fdriver=new FirefoxDriver();
		fdriver.close();
	}

}
