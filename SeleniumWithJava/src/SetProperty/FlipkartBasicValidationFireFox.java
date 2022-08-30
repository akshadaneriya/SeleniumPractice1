package SetProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartBasicValidationFireFox {

	public static void main(String[] args) {
		//using system class
				String driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
				//Set the driver executable path using System.setProperty(String key,String value)
		        System.setProperty("webdriver.gecko.driver", driverpath);
				//create an instance of required browser class
		        WebDriver fdriver=new FirefoxDriver();
		        
		      //enter the URL
		        fdriver.get("https://www.Flipkart.com");
		      //validate page tile
		        String pagetitle=fdriver.getTitle();
		        String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
                System.out.println("Title validation :"+pagetitle.contains(expectedtitle));
                System.out.println("---------------------------------------------------------");
                //validate page tile
		        String pagetitle1=fdriver.getTitle();
		        String expectedtitle1="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
                System.out.println("Title validation :"+pagetitle1.equals(expectedtitle1));
                System.out.println("---------------------------------------------------------");
              //validate current url
                String pageurl=fdriver.getCurrentUrl();
                String expectedurl="https://www.Flipkart.com";
                System.out.println("Url validation :"+pageurl.contains(expectedurl));
                System.out.println("---------------------------------------------------------");
                //validate current url
                  String pageurl1=fdriver.getCurrentUrl();
                  String expectedurl1="https://www.flipkart.com/";
                  System.out.println("Url validation :"+pageurl1.equals(expectedurl1));
                  System.out.println("---------------------------------------------------------");
                  //validate current url
                    String pageurl2=fdriver.getCurrentUrl();
                    String expectedurl2="https://www.flipkart.com/";
                    System.out.println("Url validation :"+pageurl2.contains(expectedurl2));
                    System.out.println("---------------------------------------------------------");
                    //validate current url
                      String pageurl3=fdriver.getCurrentUrl();
                      String expectedurl3="https://www.flipkart.com";
                      System.out.println("Url validation :"+pageurl3.equals(expectedurl3));
                  System.out.println("---------------------------------------------------------");
 
                  //get page source content length count
              	  int contentlength=fdriver.getPageSource().length();
              	  System.out.println("Content length :"+contentlength);
              	  //close the current browser instance
              	  fdriver.close();  

                
                
	}

}
