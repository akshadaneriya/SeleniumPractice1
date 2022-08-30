package SetProperty;

import org.openqa.selenium.chrome.ChromeDriver;
/*URL: 
		4. https://www.amazon.in/

perform following operations:
	Print page title and validate it
	ptint page url and validate it
	get page source and print its length*/
public class AmazonBasicValidtion {

	public static void main(String[] args) {
		//or using System class
		String driverpath1=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
		//Set the driver executable path using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverpath1);
		//create an instance of required browser class
		ChromeDriver cdriver=new ChromeDriver();
		
		//page title print and validate it
		cdriver.get(" https://www.amazon.in/");
		//validate page tile
		String pagetitle=cdriver.getTitle();
		String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		System.out.println("Actual title :"+pagetitle);
		System.out.println("Exopected title :"+expectedtitle);
		System.out.println("Title validation :"+pagetitle.equals(expectedtitle));		
		System.out.println("----------------------------------------------------------------------------------");
		//page title print and validate it
		String pagetitle1=cdriver.getTitle();
		String expectedtitle1="Amazon.com. Spend less. Smile more.";//find from inspect html code in title
		System.out.println("Actual title :"+pagetitle1);
		System.out.println("Exopected title :"+expectedtitle1);
		System.out.println("Title validation :"+pagetitle1.equals(expectedtitle1)); 				
		System.out.println("----------------------------------------------------------------------------------");
				
		//page url print it and validate current url
		String pageurl=cdriver.getCurrentUrl();
		String expectedurl="https://www.amazon.com/";
		System.out.println("Actual url:"+pageurl);
		System.out.println("Exopected url:"+expectedurl);
		System.out.println("Url validation :"+pageurl.equals(expectedurl));
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		//get page source content length count
		int contentlength=cdriver.getPageSource().length();
		System.out.println("Content length :"+contentlength);
		//close the current browser instance
	     cdriver.close();
		
		}

}
