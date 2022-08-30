
package SetProperty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Perform following operations on the application
1. Open any browser
2. Enter the url as https://demo.actitime.com/login.do
3. Verify login page elements
*/


public class AssignmentEx10ActiTime {


	public static void main(String[] args) {
		// 1.Open any browser
		String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", dpath);
		WebDriver cd=new ChromeDriver();
		
		//2. Enter the url as https://opensource-demo.orangehrmlive.com/
        cd.get("https://demo.actitime.com/login.do");
        //define implicit wait for browser
        cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//3. Verify login page elements
        //identify username field
        WebElement usernameInputField=cd.findElement(By.id("username"));
        System.out.println("username is displayed or not? :"+usernameInputField.isDisplayed());
        System.out.println("username is enabled or not? :"+usernameInputField.isEnabled());
       
        String defaultValueInUserNameInputField=usernameInputField.getAttribute("placeholder");
        System.out.println("Default value of user name input field:"+defaultValueInUserNameInputField);
        System.out.println("Default value validation for user name input field status:"+defaultValueInUserNameInputField.equals("Username"));
       
        //identify password field
        WebElement passwordInputField=cd.findElement(By.name("pwd"));
        System.out.println("username is displayed or not? :"+passwordInputField.isDisplayed());
        System.out.println("username is enabled or not? :"+passwordInputField.isEnabled());
       
        String defaultValueInPasswordInputField=passwordInputField.getAttribute("placeholder");
        System.out.println("Default value of password input field:"+defaultValueInPasswordInputField);
        System.out.println("Default value validation for password input field status:"+defaultValueInPasswordInputField.equals("Password"));
        
        //identify Loginbutton field
        WebElement loginbtnInputField=cd.findElement(By.id("loginButton"));
        System.out.println("username is displayed or not? :"+loginbtnInputField.isDisplayed());
        System.out.println("username is enabled or not? :"+loginbtnInputField.isEnabled());
       
        String defaultValueInloginbtnInputField=loginbtnInputField.getText();
        System.out.println("Default value of loginbtn input field:"+defaultValueInloginbtnInputField);
        System.out.println("Default value validation for loginbtn input field status:"+defaultValueInloginbtnInputField.equals("Login"));
        
        //identify forgetpasswordlink field
        WebElement forgetplinkInputField=cd.findElement(By.id("toPasswordRecoveryPageLink"));
        System.out.println("forgetplink is displayed or not? :"+forgetplinkInputField.isDisplayed());
        System.out.println("forgetplink is enabled or not? :"+forgetplinkInputField.isEnabled());
       
        String defaultValueInforgetplinkInputField=forgetplinkInputField.getText();
        System.out.println("Default value of forgetplink input field:"+defaultValueInforgetplinkInputField);
        System.out.println("Default value validation for forgetplink input field status:"+defaultValueInforgetplinkInputField.equals("Forgot your password?"));
        
        //identify checkbox field
        WebElement checkboxInputField=cd.findElement(By.id("keepLoggedInCheckBox"));
        System.out.println("checkbox is displayed or not? :"+checkboxInputField.isDisplayed());
        System.out.println("checkbox is enabled or not? :"+checkboxInputField.isEnabled());
        System.out.println("checkbox is selected or not? :"+checkboxInputField.isSelected());

        String defaultValueIncheckboxInputField=checkboxInputField.getAttribute("name");
        System.out.println("Default value of checkbox input field:"+defaultValueIncheckboxInputField);
        System.out.println("Default value validation for checkbox input field status:"+defaultValueIncheckboxInputField.equals("remember"));
        
      //identify checkboxlink field
        WebElement checkboxlinkInputField=cd.findElement(By.id("keepLoggedInLabel"));
        System.out.println("checkboxlink is displayed or not? :"+checkboxlinkInputField.isDisplayed());
        System.out.println("checkboxlink is enabled or not? :"+checkboxlinkInputField.isEnabled());

        String defaultValueIncheckboxlinkInputField=checkboxlinkInputField.getText();
        System.out.println("Default value of checkboxlink input field:"+defaultValueIncheckboxlinkInputField);
       // System.out.println("Default value validation for checkboxlink input field status:"+defaultValueIncheckboxlinkInputField.equals("Keep me logged in "));
         
        
        
	}

}
