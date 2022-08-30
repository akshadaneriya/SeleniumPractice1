package SetProperty;

import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Scenarios to Automate:
 * 1.first launch the browser.
 * 2.open the google home page.
 * 3.wait for the browser page to be load.
 * 4.fetch the current url of current web page and print it on the console.
 * 5.fetch page source of current web page
 * 6.close the browser
 */
public class AssignmentEx6 {

	public static void main(String[] args) {
	    //1.first launch the browser.
		String dpath=System.getProperty("user.dir")+"//Executables//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",dpath);
		FirefoxDriver fd=new FirefoxDriver();
		//2.open the google home page.
		fd.get("https://www.google.com");
		//3.wait for the browser page to be load.
		//4.fetch the current url of current web page and print it on the console.
		String pageurl=fd.getCurrentUrl();
		System.out.println("Actual url :"+ pageurl);
		// 5.fetch page source of current web page
		String pagesource=fd.getPageSource();
		System.out.println("Page source content length :"+pagesource.length());
		//6.close the browser.
		fd.close();

	}

}
