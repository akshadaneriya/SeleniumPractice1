package SetProperty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Perform following operations on the application

1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. Verify login page
4. Username as Admin
5. password as admin123
6. click on Login button 
7. verify home page
8. close the browser*/

public class AssignmentEx7Operations {

	public static void main(String[] args) {
		//1. Open any browser
		String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", dpath);
		WebDriver cd=new ChromeDriver();
		//2. Enter the url as https://opensource-demo.orangehrmlive.com/
		
        cd.get("https://opensource-demo.orangehrmlive.com/");
        /**
		 * to perform any operation first we need to identify the object/element from the 
		 * application dn you can perform any required operation:
		 * 		input type: sendkeys("Input");
		 * 		click	  : click();
		 * 		existing text deletion: clear();
		 
		/*Identify User name field*/
        //3. Verify login page
         String loginpurl=cd.getCurrentUrl();
         System.out.println("Login validation status : "+loginpurl.contains("https://opensource-demo.orangehrmlive.com/"));
         WebElement username=cd.findElement(By.id("txtUsername"));
 		/*perform require operation in the username field*/
         //4. Username as Admin
         username.clear();
         username.sendKeys("Admin");
         System.out.println("----------------------------------------------------------");
         /*Identify password field*/
         WebElement password=cd.findElement(By.name("txtPassword"));
         /*perform require operation in the pwd field*/
         //5. password as admin123
         password.clear();
         password.sendKeys("admin123");
         System.out.println("----------------------------------------------------------");
         /*Identify Sign in Button*/
         //6. click on Login button 
         WebElement clickbtn=cd.findElement(By.className("button"));
         /*perform require operation in the Sign in Button*/
         /*clickbtn.clear();
         clickbtn.sendKeys("SingIn");*/
         //7. verify home page
         String homepurl=cd.getTitle();
         System.out.println("Home validation status :"+homepurl.contains("https://opensource-demo.orangehrmlive.com/index.php/dashboard"));
         clickbtn.click();
         
	}

}
