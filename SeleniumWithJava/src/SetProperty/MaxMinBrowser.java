package SetProperty;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1. Open chrome browser and enter url as https://demosite.executeautomation.com/Login.html
2. enter username as execution
3. enter password as admin
4. click on login button
5. click on logout button
6. close the browser
 */ 
public class MaxMinBrowser {

	public static void main(String[] args){
		//1. Open chrome browser and enter url as https://demosite.executeautomation.com/Login.html
        String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe"; 
        System.setProperty("webdriver.chrome.driver",dpath);
        WebDriver cd=new ChromeDriver();
        cd.get("https://demosite.executeautomation.com/Login.html");
        //maximize window
        cd.manage().window().maximize();
        //minimize window
        cd.manage().window().setSize(new Dimension(500,500));
        //refresh
        cd.navigate().refresh();
        cd.manage().window().maximize();
        //implcit way
        cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        //2. enter username as execution
        cd.findElement(By.name("UserName")).sendKeys("execution");
        //3. enter password as admin
        cd.findElement(By.name("Password")).sendKeys("admin");
        //4. click on login button
        cd.findElement(By.cssSelector("input[name='Login']")).click();
        
        
        //backward
        cd.navigate().back();
        System.out.println("Current page url:"+cd.getCurrentUrl());
        //forward
        cd.navigate().forward();
        System.out.println("Current page url:"+cd.getCurrentUrl());

        //backward
        cd.navigate().back();
        System.out.println("Current page url:"+cd.getCurrentUrl());

        //forward
        cd.navigate().forward();
        System.out.println("Current page url:"+cd.getCurrentUrl());

        //5. click on logout button
        cd.findElement(By.tagName("span")).click();
        //Move to another Url
        cd.navigate().to("https://www.google.com/");
        
        //6. close the browser
        cd.close();
	}

}
