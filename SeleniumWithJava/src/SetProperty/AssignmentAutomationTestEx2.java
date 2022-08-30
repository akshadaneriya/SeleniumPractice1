package SetProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*URL: 
	2. https://demo.automationtesting.in/Register.html
	
perform following operations:
	Print page title and validate it
	ptint page url and validate it
	get page source and print its length
*/

public class AssignmentAutomationTestEx2 {

	public static void main(String[] args) {
		//Using System class
		String dpath=System.getProperty("user.dir")+"//Executables//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",dpath);
		WebDriver fd=new FirefoxDriver();
		System.out.println("--------------------------------------------------------------");

		fd.get("https://demo.automationtesting.in/Register.html");
		 //Page Title print and validate it
		String pagetitle=fd.getTitle();
		System.out.println("Actual Title :"+pagetitle);
		String expectedtitle="Register";
		System.out.println("Expected Title :"+expectedtitle);
		if(pagetitle.equals(expectedtitle)) {
			System.out.println("Title Validation is passed");
		}else {
			System.out.println("Title validation is failed");
		}
		System.out.println("-----------------------------------------------------------");
		//page url print and validate it
		String pageurl=fd.getCurrentUrl();
		System.out.println("Actual Url :"+pageurl);
		String expectedurl="https://demo.automationtesting.in/Register.html";
		System.out.println("Expected Url :"+expectedurl);
		if(pageurl.contains(expectedurl)) {
			System.out.println("Url validation is passed");
		}else {
			System.out.println("Url validation is failed");
		}
		System.out.println("-----------------------------------------------------------");
		//Get page source length print its length
        String pagesource=fd.getPageSource();
        int sourcelength=pagesource.length();
        System.out.println("Page source content length :"+sourcelength);
        fd.close();
	}

}
