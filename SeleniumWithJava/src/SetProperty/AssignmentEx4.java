package SetProperty;

import org.openqa.selenium.chrome.ChromeDriver;

/*
 * scenrio to automate:
 * 1.Launch a new chrome browser.
 * 2.Open https://demo.actitime.com/
 * 3.get page title name and title length.
 * 4.Print page title and title length on the eclipse console.
 * 5.Get page url and verify if it is a correct page opened.
 * 6.Get page source(html source code) and page source length.
 * 7.print page length on eclipse console.
 * 8.close the browser.
 */
public class AssignmentEx4 {

	public static void main(String[] args) {
		//1.Launch a new chrome browser.
		String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", dpath);
		ChromeDriver cd=new ChromeDriver();
		// 2.Open https://demo.actitime.com/
		cd.get("https://demo.actitime.com/");
		//3.get page title name and title length.
		String pagetitle=cd.getTitle();
		int pagetlength=pagetitle.length();
		//4.Print page title and title length on the eclipse console.
        System.out.println("Actual Title :"+pagetitle);
		System.out.println("Page title length :"+pagetlength);
		//5.Get page url and verify if it is a correct page opened.
		String pageurl=cd.getCurrentUrl();
		String expectedurl="https://demo.actitime.com/login.do";
		System.out.println("Page url validation is :"+pageurl.contains(expectedurl));
		//6.Get page source(html source code) and page source length.
		String pagesource=cd.getPageSource();
		int pageslength=pagesource.length();
		//7.print page length on eclipse console.
		System.out.println("Page source content length :"+pageslength);
		//8.close the browser.
		cd.close();
		}

}
