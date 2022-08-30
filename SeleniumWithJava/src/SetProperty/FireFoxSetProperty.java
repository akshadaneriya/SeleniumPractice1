package SetProperty;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

public class FireFoxSetProperty {

	public static void main(String[] args) {
		// here I am setting the system properties of chrome driver and specifying the path to it
		System.setProperty("webdriver.gecko.driver", "F:\\Workspace java\\SeleniumWithJava\\Executables\\geckodriver.exe");
	    //Creating a object to instantiate the broser driver 
		WebDriver fdriver=new FirefoxDriver();
		//Navigating through a particular website
		//fdriver.get("http://www.google.com/");
		fdriver.get("http://www.ebay.com/");
		  //locating elements using xpath locator for search box
		fdriver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Guitar");
		WebElement searchIcon=fdriver.findElement(By.xpath("//input[@id='gh-btn']"));
		//xpath for search button
		searchIcon.click();
		fdriver.close();

	}

}
