package SetProperty;

import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Scenario to Automate:
 * 1.Launch the web browser.
 * 2.open the url https://www.facebook.com in the current browser
 * 3.Fetching home page title.
 * 4.verify actual title of the home page with the expected title.
 * 5.print home page title on the console
 * 6.close the browser.
 */
public class AssignmentEx5 {

	public static void main(String[] args) {
	    //1.Launch the web browser.
		String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", dpath);
		ChromeDriver cd=new ChromeDriver();
		
	    //2.open the url https://www.facebook.com in the current browser.
	    cd.get("http:www.facebook.com");
	    //3.Fetching home page title.
	    String pagetitle=cd.getTitle();
	    System.out.println("Actual title :"+pagetitle);
	    //4.verify actual title of the home page with the expected title.
	    String expectedtitle="Facebook – log in or sign up";
	    System.out.println("Expected title: "+expectedtitle);
	    System.out.println("Title validation result is: "+pagetitle.equals(expectedtitle));
	    //5.print home page title on the console
	    System.out.println("Actual title :"+pagetitle);
	    //6.close the browser.
	    //cd.close();
	    
		

	}

}
