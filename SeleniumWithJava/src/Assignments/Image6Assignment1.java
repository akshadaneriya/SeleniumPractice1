package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image6Assignment1 {

	public static void main(String[] args) {
		String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",dpath);
        WebDriver cd=new ChromeDriver();
        cd.get("https://demo.actitime.com/");
        cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //login username and password field
        WebElement username=cd.findElement(By.className("textField"));
        username.clear();
        username.sendKeys("admin");
        cd.findElement(By.name("pwd")).sendKeys("manager");
        cd.findElement(By.id("loginButton")).click();
        //click on task tab
        cd.findElement(By.cssSelector("a[id='container_tasks']")).click();
        
        
 }

}
