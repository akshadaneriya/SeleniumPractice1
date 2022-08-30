package SetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSetProperty {

	public static void main(String[] args) {
		// here I am setting the system properties of chrome driver and specifying the path to it
				System.setProperty("webdriver.chrome.driver", "F:\\Workspace java\\SeleniumWithJava\\Executables\\chromedriver.exe");
			    //Creating a object to instantiate the broser driver 
				WebDriver cdriver=new ChromeDriver();
				//Navigating through a particular website
				cdriver.get("http://www.google.com/");
				/*cdriver.get("http://www.ebay.com/");
				 * //locating elements using xpath locator for search box
				cdriver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Guitar");
				WebElement searchIcon=cdriver.findElement(By.xpath("//input[@id='gh-btn']"));
				//xpath for search button
				searchIcon.click();*/
				cdriver.close();
			
			
	}

}
