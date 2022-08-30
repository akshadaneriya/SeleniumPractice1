package HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoSite {

	public static void main(String[] args) {
		String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
	       System.setProperty("webdriver.chrome.driver", dpath);
	       WebDriver cd=new ChromeDriver();
	       cd.manage().window().maximize();
	       cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       
	       
	       String pagetitle=cd.getTitle();
	       System.out.println("pageurl :"+pagetitle);
	       String expectedtitle="Live cricket scores, match schedules, latest cricket news, cricket videos";
	       System.out.println("Page validation status is :"+pagetitle.equals(expectedtitle));
	       
	       cd.get("https://www.cricinfo.com/");
	       List<WebElement> menu=cd.findElements(By.cssSelector("div.ds-popper-wrapper>a"));
	       for(int i=0;i<menu.size();i++) {
	    	   System.out.println(menu.get(i).getText());
	       }
	       
	       
	       
	       

	}

}
