package HandlingMultipleElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookValidation {

	public static void main(String[] args) {
		String dpath=System.getProperty("user.dir")+"//executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",dpath);
		WebDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		cd.get("https://www.facebook.com/");
		String pageurl=cd.getCurrentUrl();
		String expectedUrl="https://www.facebook.com/";
		System.out.println("validation status :"+pageurl.equals(expectedUrl));
		
		cd.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		
		
		
		
		
		

	}

}
