package SetProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicOperationWithFirefox {

	public static void main(String[] args) {
		//using system class
		String driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
        System.setProperty("webdriver.gecko.driver", driverpath);
		//create an instance of required browser class
        WebDriver fdriver=new FirefoxDriver();
        
		//need to enter application URL in the opened browser
        fdriver.get("https://www.google.com");
        
       //expected page url
        String expectedurl="https://www.google.com/";
        String appcurrenturl=fdriver.getCurrentUrl();
        System.out.println("Actual url : "+appcurrenturl);
        System.out.println("Expected url: "+expectedurl);
        if(appcurrenturl.contains(expectedurl)) {
        	System.out.println("Url validation is passed");
        } else{
        	System.out.println("Url validation is failed");
        }
        System.out.println("------------------------------------------------------------------------------");
        
        //expected page url
        String expectedurl1="https://www.google.com/";
        String appcurrenturl1=fdriver.getCurrentUrl();
        System.out.println("Actual url : "+appcurrenturl1);
        System.out.println("Expected url: "+expectedurl1);
        if(appcurrenturl1.equals(expectedurl1)) {
        	System.out.println("Url validation is passed");
        } else{
        	System.out.println("Url validation is failed");
        }
        System.out.println("------------------------------------------------------------------------------");
      //expected page url
        String expectedurl2="https://www.Google.com";
        String appcurrenturl2=fdriver.getCurrentUrl();
        System.out.println("Actual url : "+appcurrenturl2);
        System.out.println("Expected url: "+expectedurl2);
        if(appcurrenturl2.contains(expectedurl2)) {
        	System.out.println("Url validation is passed");
        } else{
        	System.out.println("Url validation is failed");
        }
        System.out.println("------------------------------------------------------------------------------");
        
        //expected page url
        String expectedurl3="https://www.google.com";
        String appcurrenturl3=fdriver.getCurrentUrl();
        System.out.println("Actual url : "+appcurrenturl3);
        System.out.println("Expected url: "+expectedurl3);
        if(appcurrenturl3.equals(expectedurl3)) {
        	System.out.println("Url validation is passed");
        } else{
        	System.out.println("Url validation is failed");
        }
        System.out.println("------------------------------------------------------------------------------");
		//verify that Google search page is opened or not using title
        String actualtitle=fdriver.getTitle();
        String expectedtitle="Google";
        System.out.println("Actual Title :"+actualtitle);
        System.out.println("Expected Title :"+expectedtitle);
        if(actualtitle.contains(expectedtitle)) {
        	System.out.println("Title validation is passed");
        	
        }else {
        	System.out.println("Title validation is failed");
        }
        System.out.println("------------------------------------------------------------------------------");
		//verify that Google search page is opened or not using title
        String actualtitle1=fdriver.getTitle();
        String expectedtitle1="google";
        System.out.println("Actual Title :"+actualtitle1);
        System.out.println("Expected Title :"+expectedtitle1);
        if(actualtitle1.equals(expectedtitle1)) {
        	System.out.println("Title validation is passed");
        	
        }else {
        	System.out.println("Title validation is failed");
        }
        System.out.println("------------------------------------------------------------------------------");
		//verify that Google search page is opened or not using title
        String actualtitle2=fdriver.getTitle();
        String expectedtitle2="Google";
        System.out.println("Actual Title :"+actualtitle2);
        System.out.println("Expected Title :"+expectedtitle2);
        if(actualtitle2.equals(expectedtitle2)) {
        	System.out.println("Title validation is passed");
        	
        }else {
        	System.out.println("Title validation is failed");
        }

        System.out.println("------------------------------------------------------------------------------");
		//verify that Google search page is opened or not using title
        String actualtitle3=fdriver.getTitle();
        String expectedttitle3="google";
        System.out.println("Actual Title :"+actualtitle3);
        System.out.println("Expected Title :"+expectedttitle3);
        if(actualtitle3.contains(expectedttitle3)) {
        	System.out.println("Title validation is passed");
        	
        }else {
        	System.out.println("Title validation is failed");
        }
        System.out.println("_____________________________________________________________________");	

		//get the webpage source content
		String sourcecontent =fdriver.getPageSource();
		System.out.println("Source content length :"+sourcecontent.length());
		//close current browser
		fdriver.close();
	}

}
