
package SetProperty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Perform following operations on the application
1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. Verify login page elements*/

public class AssignmentExOHMLive {

	public static void main(String[] args) {
		// 1.Open any browser
		String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", dpath);
		WebDriver cd=new ChromeDriver();
		
		//2. Enter the url as https://opensource-demo.orangehrmlive.com/
        cd.get("https://opensource-demo.orangehrmlive.com/");
        
        //define implicit wait for browser
        cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      				
		
		//3. Verify login page elements
        //identify username field
        WebElement usernameInputField=cd.findElement(By.id("txtUsername"));
        System.out.println("username is displayed or not? :"+usernameInputField.isDisplayed());
        System.out.println("username is enabled or not? :"+usernameInputField.isEnabled());
       
        
        String defaultValueInUserNameInputField=usernameInputField.getText();
        System.out.println("Default value of user name input field:"+defaultValueInUserNameInputField);
        //System.out.println("Default value validation for user name input field status:"+defaultValueInUserNameInputField.equals("Username"));
       
        //identify password field
        WebElement passwordInputField=cd.findElement(By.id("txtPassword"));
        System.out.println("username is displayed or not? :"+passwordInputField.isDisplayed());
        System.out.println("username is enabled or not? :"+passwordInputField.isEnabled());
       
        String defaultValueInPasswordInputField=passwordInputField.getText();
        System.out.println("Default value of password input field:"+defaultValueInPasswordInputField);
        //System.out.println("Default value validation for password input field status:"+defaultValueInPasswordInputField.equals("Password"));
        
        //identify Loginbutton field
        WebElement loginbtnInputField=cd.findElement(By.id("btnLogin"));
        System.out.println("username is displayed or not? :"+loginbtnInputField.isDisplayed());
        System.out.println("username is enabled or not? :"+loginbtnInputField.isEnabled());
       
        String defaultValueInloginbtnInputField=loginbtnInputField.getAttribute("value");
        System.out.println("Default value of loginbtn input field:"+defaultValueInloginbtnInputField);
        System.out.println("Default value validation for loginbtn input field status:"+defaultValueInloginbtnInputField.equals("LOGIN"));
        
        //identify forgetpasswordlink field
        WebElement forgetplinkInputField=cd.findElement(By.id("forgotPasswordLink"));
        System.out.println("forgetplink is displayed or not? :"+forgetplinkInputField.isDisplayed());
        System.out.println("forgetplink is enabled or not? :"+forgetplinkInputField.isEnabled());
       
        String defaultValueInforgetplinkInputField= forgetplinkInputField.getText();
        System.out.println("Default value of forgetplink input field:"+defaultValueInforgetplinkInputField);
        //System.out.println("Default value validation for forgetplink input field status:"+defaultValueInforgetplinkInputField.equals("Forgot your password?"));
        
        
        
        
	}

}
