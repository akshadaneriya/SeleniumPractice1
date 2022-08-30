package HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaSamsungPhon {

	public static void main(String[] args) {
       String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
       System.setProperty("webdriver.chrome.driver", dpath);
       WebDriver cd=new ChromeDriver();
       cd.manage().window().maximize();
       cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
       cd.get("https://www.gsmarena.com/samsung-phones-9.php");
       
       List<WebElement> phones=cd.findElements(By.cssSelector("ul>li>a>strong>span"));
       System.out.println("Devices count :"+phones.size());
       for(int i=0;i<phones.size();i++) {
    	   System.out.println(phones.get(i).getText());
       }
       
       
	}

}
