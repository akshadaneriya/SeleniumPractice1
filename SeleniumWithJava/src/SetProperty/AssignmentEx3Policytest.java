package SetProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*URL: 
	3. http://sampleapp.tricentis.com/101/
	
perform following operations:
	Print page title and validate it
	ptint page url and validate it
	get page source and print its length*/
public class AssignmentEx3Policytest{
	 public static void main(String[] args) {
	 String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe"; 
	 System.setProperty("webdriver.chrome.driver", dpath);
	 WebDriver cd=new ChromeDriver();
	 System.out.println("--------------------------------------------------------------");
	//page Title print and validate it
	 cd.get(" http://sampleapp.tricentis.com/101/\r\n");
	 String pagetitle=cd.getTitle();
	 System.out.println("Actual title :"+pagetitle);
	 if(pagetitle.equals("Tricentis Vehicle Insurance")) {
		 System.out.println("Title validation is passed");
	 }else {
		 System.out.println("Title validation is Failed");
	 }
	 System.out.println("--------------------------------------------------------------");
	//page url print and validate it
	 String pageurl=cd.getCurrentUrl();
	 System.out.println("Actual Url :"+pageurl);
	 System.out.println("Url validation test is :"+pageurl.equals("http://sampleapp.tricentis.com/101/"));
	 System.out.println("-----------------------------------------------------------------");
     //Get page source length print its length
     String pagesource=cd.getPageSource();
	 System.out.println("Page source content length :"+pagesource.length());
	 cd.close();
	 }

}
