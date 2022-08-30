package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image3Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",dpath);
		WebDriver cd=new ChromeDriver();
		cd.get("https://www.amazon.com/");
		cd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		cd.manage().window().setSize(new Dimension(600,600));
		cd.manage().window().maximize();
		
		String pagetitle=cd.getTitle();
		System.out.println("Page current title :"+pagetitle);
		Thread.sleep(2000);

		WebElement menulink=cd.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_customerservice']"));
		System.out.println("is it display :"+menulink.isDisplayed());
		menulink.click();
		
		String pagetitle1=cd.getCurrentUrl();
		System.out.println("Print current page url :"+pagetitle1);
		
		cd.navigate().back();
		String pagetitle2=cd.getCurrentUrl();
		System.out.println("Print current page url :"+pagetitle2.equals(pagetitle));
		
		//cd.close();
		
		

	}

}
