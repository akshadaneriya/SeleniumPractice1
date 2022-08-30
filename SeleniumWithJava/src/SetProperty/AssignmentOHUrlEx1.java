package SetProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*URL: 
	1. https://opensource-demo.orangehrmlive.com/

perform following operations:
	Print page title and validate it
	print page url and validate it
	get page source and print its length*/

public class AssignmentOHUrlEx1 {

	public static void main(String[] args) {
		//Using System class Path
		String Dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
        System.setProperty("webdriver.chrome.driver",Dpath);
		//create an instance of required browser class
        WebDriver cd=new ChromeDriver();
		//need to enter application URL in the opened browser
        cd.get("https://opensource-demo.orangehrmlive.com/");
   	    System.out.println("--------------------------------------------------------------");

        //Page Title print and validate it
        String pagetitle=cd.getTitle();
        System.out.println("Actual Title :"+pagetitle);
        String expectedtitle="OrangeHRM";
        System.out.println("Expected Title :"+expectedtitle);
        if(pagetitle.equals(expectedtitle)) {
        	System.out.println("Title Validation is Passed");
        }else {
        	System.out.println("Title validation is Failed ");
        }
		System.out.println("-----------------------------------------------------------");

        //Print page url and validte it
        String pageurl=cd.getCurrentUrl();
        System.out.println("Actual Url :"+pageurl);
        String expectedurl="https://opensource-demo.orangehrmlive.com/";
        System.out.println("Expected Url: "+expectedurl);
        if(pageurl.equals(expectedurl)) {
        	System.out.println("Url Validation is passed ");
        	}
        else {
        	System.out.println("Url validation is failed");
        }
        System.out.println("-----------------------------------------------------------");
        //Get page source length print its length
        String pagesourcecontent=cd.getPageSource();
        System.out.println("Page source content length :"+pagesourcecontent.length());
        cd.close();
        

	}

}
