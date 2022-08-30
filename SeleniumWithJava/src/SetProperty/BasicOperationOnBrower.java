package SetProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperationOnBrower {

	public static void main(String[] args) {
		//Using System class
		String driverpath1=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverpath1);
		//create an instance of required browser class
		WebDriver cdriver=new ChromeDriver();
		
		//need to enter application URL in the opened browser
		cdriver.get("https://www.google.com");
		
		//expected page url
		String expectedurl="https://www.google.com";
		//get the entered URL from the opened browser
		String appcurrenturl=cdriver.getCurrentUrl();
		System.out.println("ActualUrl :"+appcurrenturl);
		System.out.println("ExpectedUrl :"+expectedurl);
		if(appcurrenturl.contains(expectedurl)) { //it will print if u have any typing mistake in url it will accept and print passed
			System.out.println("Current url validation is Passed");
		}
		else {
			System.out.println("Current url validation is Failed");

		}
		System.out.println("____________________________________________________________________");
		//expected page url
				String expectedurl1="https://www.google.com";
				//get the entered URL from the opened browser
				String appcurrenturl2=cdriver.getCurrentUrl();
				System.out.println("ActualUrl :"+appcurrenturl2);
				System.out.println("ExpectedUrl :"+expectedurl1);
				if(appcurrenturl2.equals(expectedurl1)) { //casesensitive print failed if u have any text missing
					System.out.println("Current url validation is Passed");
				}
				else {
					System.out.println("Current url validation is Failed");

				}
        System.out.println("____________________________________________________________________");
        
		//verify that Google search page is opened or not using title
        String actualTitle=cdriver.getTitle();
        String expectedtitle="Google";
        System.out.println("ActualTitle :"+actualTitle);
		System.out.println("ExpectedTitle :"+expectedtitle);
		if(actualTitle.equals(expectedtitle)) {
			System.out.println("Title validation is passed");
		}else {
			System.out.println("Title validation is failed");
		}
		System.out.println("_____________________________________________________________________");	
		//verify that Google search page is opened or not using title
        String actualTitle1=cdriver.getTitle();
        String expectedtitle2="google";
        System.out.println("ActualTitle :"+actualTitle1);
		System.out.println("ExpectedTitle :"+expectedtitle2);
		if(actualTitle1.equals(expectedtitle2)) {//case sensitive print failed
			System.out.println("Title validation is passed");
		}else {
			System.out.println("Title validation is failed");
		}	
		
		System.out.println("_____________________________________________________________________");	

		//get the webpage source content
		String sourcecontent =cdriver.getPageSource();
		System.out.println("Source content length :"+sourcecontent.length());
		//close current browser
		cdriver.close();
	}
	

}


/**
 * Open Chrome browser
 * Enter google search page url
 * validate URL is entered properly or not
 * validate google search page is open or not
 * once all the validation are performed close the browser
 */ 
