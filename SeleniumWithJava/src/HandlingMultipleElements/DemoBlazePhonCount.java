package HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazePhonCount {

	public static void main(String[] args) {
		String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", dpath);
		WebDriver cd=new ChromeDriver();
		cd.manage().window().maximize();
	    cd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		cd.get("https://www.demoblaze.com/");
		List<WebElement> devicename=cd.findElements(By.cssSelector("div#tbodyid h4>a"));
        List<WebElement> deviceprice=cd.findElements(By.cssSelector("div#tbodyid h5"));
        
        for(int i=0;i<devicename.size();i++) {
        	System.out.println(devicename.get(i).getText()+":" +deviceprice.get(i).getText());
        }

	}

}
