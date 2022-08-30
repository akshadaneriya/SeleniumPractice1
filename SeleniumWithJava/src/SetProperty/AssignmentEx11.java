package SetProperty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Perform following operations on the application
1. Open any browser
2. Enter the url as https://opensource-demo.orangehrmlive.com/
3. verify login page
4. enter username and password*/
public class AssignmentEx11 {

	public static void main(String[] args) {
		//1. Open any browser
		String dpath=System.getProperty("user.dir")+"//Executables//geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", dpath);
		WebDriver fd=new FirefoxDriver();
		//2. Enter the url as https://opensource-demo.orangehrmlive.com/
        fd.get("https://opensource-demo.orangehrmlive.com/");
        //define implicit wait for browser
        fd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        //3. verify login page
        //verify username field
        WebElement usernameInputField=fd.findElement(By.id("txtUsername"));
        System.out.println("username is displayed or not? :"+usernameInputField.isDisplayed());
        System.out.println("username is enabled or not? :"+usernameInputField.isEnabled());

        String defaultinputusernameinputfield=usernameInputField.getText();
        System.out.println("Default value of user name input field:"+defaultinputusernameinputfield);
        System.out.println("Default value validation for user name input field status:"+defaultinputusernameinputfield.equals("Username"));

      //identify password field
        WebElement passwordInputField=fd.findElement(By.id("txtPassword"));
        System.out.println("username is displayed or not? :"+passwordInputField.isDisplayed());
        System.out.println("username is enabled or not? :"+passwordInputField.isEnabled());
       
        String defaultValueInPasswordInputField=passwordInputField.getText();
        System.out.println("Default value of password input field:"+defaultValueInPasswordInputField);
        //System.out.println("Default value validation for password input field status:"+defaultValueInPasswordInputField.equals("Password"));
        
        //identify Loginbutton field
        WebElement loginbtnInputField=fd.findElement(By.id("btnLogin"));
        System.out.println("username is displayed or not? :"+loginbtnInputField.isDisplayed());
        System.out.println("username is enabled or not? :"+loginbtnInputField.isEnabled());
       
        String defaultValueInloginbtnInputField=loginbtnInputField.getAttribute("value");
        System.out.println("Default value of loginbtn input field:"+defaultValueInloginbtnInputField);
        System.out.println("Default value validation for loginbtn input field status:"+defaultValueInloginbtnInputField.equals("LOGIN"));
        
        //identify forgetpasswordlink field
        WebElement forgetplinkInputField=fd.findElement(By.id("forgotPasswordLink"));
        System.out.println("forgetplink is displayed or not? :"+forgetplinkInputField.isDisplayed());
        System.out.println("forgetplink is enabled or not? :"+forgetplinkInputField.isEnabled());
       
        String defaultValueInforgetplinkInputField=forgetplinkInputField.getText();
        System.out.println("Default value of forgetplink input field:"+defaultValueInforgetplinkInputField);
        //System.out.println("Default value validation for forgetplink input field status:"+defaultValueInforgetplinkInputField.equals("Forgot your password? "));
        
        //3.Enter username and password
        WebElement username=fd.findElement(By.id("txtUsername"));
        username.clear();
        username.sendKeys("Admin");

        WebElement password=fd.findElement(By.id("txtPassword"));
        password.clear();
        password.sendKeys("admin123");
        
        WebElement loginbtn=fd.findElement(By.id("btnLogin"));
        loginbtn.click();
        
        


	}

}
