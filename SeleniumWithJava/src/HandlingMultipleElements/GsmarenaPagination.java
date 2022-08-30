package HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmarenaPagination {

	public static void main(String[] args) throws InterruptedException {
		String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",dpath);
		WebDriver cd=new ChromeDriver();
		
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		cd.get("https://www.gsmarena.com/samsung-phones-9.php");
		
		String pageurl=cd.getCurrentUrl();
		System.out.println("pageurl :"+pageurl);
		String expectedurl="https://www.gsmarena.com/samsung-phones-9.php";
		System.out.println("validation status : "+pageurl.equals(expectedurl));
		
		
		//cd.findElement(By.cssSelector("div.brandmenu-v2>ul>li:nth-child(14)>a")).click();
        cd.findElement(By.linkText("REALME")).click();
        
        List<WebElement> pagination=cd.findElements(By.cssSelector(".nav-pages>a"));
        if(pagination.size()>0) {
        	
        	System.out.println("Pagination exist");
        }else
        {
        	System.out.println("Pagination not exist");
        }
        for(WebElement element :pagination) {
        	System.out.println(element.getText());
        	
        }
    	System.out.println(cd.getCurrentUrl());

        for(int i=0; i<pagination.size();i++) {
        	pagination.get(i).click();
        	Thread.sleep(2000);
        	System.out.println(cd.getCurrentUrl());

            //to avoid staleelements excution identify the pagination link
        	pagination=cd.findElements(By.cssSelector(".nav-pages>a"));
        }
	}

}
