package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class image1Assignment2 {
 
	public static void main(String[] args) {
		//web browser open
		String Dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",Dpath);
		WebDriver cd=new ChromeDriver();
		cd.get("https://www.facebook.com/");
		String pageTitle=cd.getTitle();
		String expectedTitle="Facebook – log in or sign up";
		System.out.println("Actual Pagetitle is :"+pageTitle);
		System.out.println("Expected Pagetitle is :"+expectedTitle);
		System.out.println("Title validation status is :"+pageTitle.equals(expectedTitle));
		//cd.close();

		
		
		

	}

}
