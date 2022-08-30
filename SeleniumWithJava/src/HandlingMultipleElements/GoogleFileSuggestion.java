package HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFileSuggestion {

	public static void main(String[] args) throws InterruptedException {
	  String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", dpath);
	  WebDriver cd=new ChromeDriver();
	  
      cd.manage().window().maximize();
      cd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      cd.get("https://www.google.com/");
      
      //type selenium interview questions
      cd.findElement(By.name("q")).sendKeys("Selenium Interview Questions");
      
      Thread.sleep(2000);//uncomment this line if you get stale element exception during execution
		//get all the suggestions
      List<WebElement> sugg=cd.findElements(By.cssSelector("ul>li>div>div:nth-of-type(2)>*:first-child>span"));
      //suggestion count
      System.out.println("Suggestion count :"+sugg.size());
    //print suggestions in the console
      for(int i=0;i<sugg.size();i++) {
    	  
    	  //System.out.println(sugg.get(i).getText());
    	  
    	  //or
    	  WebElement element= sugg.get(i);
    	  System.out.println(element.getText());
    	  
      }
      
      
	}

}
