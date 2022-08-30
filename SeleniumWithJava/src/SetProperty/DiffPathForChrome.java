package SetProperty;

import org.openqa.selenium.chrome.ChromeDriver;

public class DiffPathForChrome {

	public static void main(String[] args) {
		//Absolute path
		String drivepath1="F:\\Workspace java\\SeleniumWithJava\\Executables\\chromedriver.exe";
        //Relative Path  --> '.' indicate current working dir
		String drivepath2=".\\Executable\\chromedriver.exe";
		//using system class
		String driverpath3=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverpath3);
		//create an instance of required browser class
		ChromeDriver cdriver=new ChromeDriver();
		
		
		
	}

}
