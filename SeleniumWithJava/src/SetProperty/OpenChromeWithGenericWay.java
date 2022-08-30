package SetProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeWithGenericWay {
	
	public static void setproperty() {
		// Absolute path
				String driverpath1="F:\\Workspace java\\SeleniumWithJava\\Executables\\chromedriver.exe";
				//Relative path  --> '.' indicate current working dir
				String driverpath2=".\\Executables\\chromedriver.exe";
				//or using System class
				String driverpath3=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
				//Set the driver executable path using System.setProperty(String key,String value)
				System.setProperty("webdriver.chrome.driver",driverpath3);
				//create an instance of required browser class
				WebDriver cdriver=new ChromeDriver();
				//webdriver is a interface so we are taking their reference here and for creating object of chrome browser
				//it is a runtime polymhorphism here
				//this is a generic way
	}

	public static void main(String[] args) {
	        
		        OpenChromeWithGenericWay.setproperty();

	}

}
