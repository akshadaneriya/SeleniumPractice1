package SetProperty;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaxMinORHL {

	public static void main(String[] args) {
		String dpath=System.getProperty("user.dir")+"//Executables//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",dpath);
		WebDriver fd=new FirefoxDriver();
		
		fd.get("https://opensource-demo.orangehrmlive.com/");
		//implcit way
		fd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//window maximize
		fd.manage().window().maximize();
		//we don't have any minimize method in selenium, so will use setSize()
        fd.manage().window().setSize(new Dimension(500,500));
        fd.manage().window().maximize();
     
		
	}

}
