package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image1Assignment3 {

	public static void main(String[] args) {
		String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", dpath);
		WebDriver cd=new ChromeDriver();
		
		cd.get("https://www.google.com/");
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String pageurl=cd.getCurrentUrl();
		System.out.println("Print current url :"+pageurl);
		String pagesource=cd.getPageSource();
		System.out.println("Page source content :"+pagesource.length());
		cd.close();
      
	}

	

}
