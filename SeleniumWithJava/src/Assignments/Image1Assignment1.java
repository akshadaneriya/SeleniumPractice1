package Assignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image1Assignment1 {

	public static void main(String[] args) {
	  String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver",dpath);
	  WebDriver cd=new ChromeDriver();
	  cd.get("https://demo.actitime.com/");
	  
	  cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  String pagetitle=cd.getTitle();
	  System.out.println("Actual Page Title is : "+pagetitle);
	  System.out.println("Actual Page Title is : "+pagetitle.length());
	  
	  String pageurl=cd.getCurrentUrl();
	  String expectedurl="https://demo.actitime.com/login.do";
	  System.out.println("Expected Pageurl is :"+expectedurl);
	  System.out.println("Title validation status is :"+pageurl.equals(expectedurl));
	  
	  String pagesource=cd.getPageSource();
	  System.out.println("Pagesource Content is :"+pagesource.length());
	  
	  cd.close();
	 }

}
