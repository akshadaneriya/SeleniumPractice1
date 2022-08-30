package SetProperty;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Perform following operations on the application

1. Open any browser
2. Enter the url as https://demo.actitime.com/login.do
3. Verify login page
3. Username as admin
4. password as manager
5. click on Login button 
6. close the brows*/

public class AssignmentEx8ActimeOp {

	public static void main(String[] args) {
		// 1. Open any browser
		String dpath=System.getProperty("user.dir")+"//Executables//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", dpath);
		FirefoxDriver fd=new FirefoxDriver();
		//2. Enter the url as https://demo.actitime.com/login.do
		fd.get("https://demo.actitime.com/login.do");
		//3. Verify login page
		/*Identify User name field*/
		WebElement username=fd.findElementByClassName("textField");
		/*perform require operation in the username field*/
        //4. Username as Admin
        username.clear();
        username.sendKeys("Admin");
        System.out.println("----------------------------------------------------------");
        
        /*Identify password field*/
        WebElement pwd=fd.findElementByClassName("pwdfield");
        /*perform require operation in the pwd field*/
        //5. password as manager
        pwd.clear();
        pwd.sendKeys("manager");
        System.out.println("----------------------------------------------------------");

        /*Identify Sign in Button*/
        //6. click on Login button 
        WebElement loginbtn=fd.findElementById("loginButton");
        loginbtn.click();
        
	}

}
