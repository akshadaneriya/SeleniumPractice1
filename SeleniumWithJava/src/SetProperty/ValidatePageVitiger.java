package SetProperty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Perform following operations on the application
1. Open any browser
2. Enter the url as https://demo.vtiger.com/vtigercrm/index.php
3. verify login page
4. enter username and password and click on login button
5. validate home page
6. click on add widget and select any one 
7. click on add widget and select any one
8. click on add widget and select any one
9. logout from the application
10. close the browser*/
public class ValidatePageVitiger {

	public static void main(String[] args) throws InterruptedException {
		//1. Open any browser
		String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",dpath);
        WebDriver cd=new ChromeDriver();
        //2. Enter the url as https://demo.vtiger.com/vtigercrm/index.php
        cd.get("https://demo.vtiger.com/vtigercrm/index.php");
        // maximize browser window
         cd.manage().window().maximize();
        //implcit way
        cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        //3. verify login page
        String pageTitle=cd.getTitle();
        System.out.println("Actual Page Title :"+pageTitle);
        String expectedTitle="vtiger";
        System.out.println("Expected Page Title :"+expectedTitle);
        System.out.println("Validation status of Title :"+expectedTitle.equals(pageTitle));
        
        String pageUrl=cd.getCurrentUrl();
        System.out.println("Actual PageUrl :"+pageUrl);
        String expectedUrl="https://demo.vtiger.com/vtigercrm/index.php";
        System.out.println("Expected PageUrl :"+expectedUrl);
        System.out.println("Validation status of Url :"+expectedUrl.equals(pageUrl));

        //4. enter username and password and click on login button
        WebElement username=cd.findElement(By.id("username"));
        username.clear();
        username.sendKeys("admin");
        WebElement pwd=cd.findElement(By.id("password"));
        pwd.clear();
        pwd.sendKeys("Test@123");
        cd.findElement(By.className("button")).click();
        
        //5. validate home page
        Thread.sleep(2000);
        
        String pagetitle=cd.getTitle();
        System.out.println("Actual Title after login :"+pagetitle);
        String expectedtitle="Dashboard";
        System.out.println("Expected title after login :"+expectedtitle);
        System.out.println("validation status for title after login :"+expectedtitle.equals(pagetitle));
      
        String pageurl=cd.getCurrentUrl();
        System.out.println("Actual Title after login :"+pagetitle);
        String expectedurl="https://demo.vtiger.com/vtigercrm/index.php";
        System.out.println("Expected title after login :"+expectedurl);
        System.out.println("validation status for title after login :"+expectedurl.equals(pageurl));
      
        //6. click on add widget and select any one 
        WebElement widget=cd.findElement(By.cssSelector(".addButton"));
        System.out.println("Added Widget Button is displayed :"+widget.isDisplayed());
        System.out.println("Added Widget Button is enableded :"+widget.isEnabled());
        widget.click();
        cd.findElement(By.cssSelector("a[data-name='KeyMetrics']")).click();
        
        //7. click on add widget and select any one
        cd.findElement(By.cssSelector(".addButton")).click();
		cd.findElement(By.cssSelector("a[data-name='TotalRevenuePerSalesPerson']")).click();
        //8. click on add widget and select any one
		cd.findElement(By.cssSelector(".addButton")).click();
		cd.findElement(By.cssSelector("a[data-name='TopPotentials']")).click();
		
		cd.findElement(By.cssSelector("a[name='dclose']")).click();
		cd.findElement(By.cssSelector(".confirm-box-ok")).click();
		
		cd.navigate().refresh();
		
		cd.findElement(By.cssSelector("a[name='dclose']")).click();
		cd.findElement(By.cssSelector(".confirm-box-ok")).click();

		cd.navigate().refresh();
		
		cd.findElement(By.cssSelector("a[name='dclose']")).click();
		cd.findElement(By.cssSelector(".confirm-box-ok")).click();

		
		//9. logout from the application
		cd.findElement(By.cssSelector(".userName.dropdown-toggle.pull-right")).click();
		cd.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
				
		
        //10. close the browser*/
		cd.close();
	}

	}

