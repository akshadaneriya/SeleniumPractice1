package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class image4Assignment1 {

	public static void main(String[] args) throws InterruptedException {
      String dpath= System.getProperty("user.dir")+"//Executables//chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", dpath);
      WebDriver cd=new ChromeDriver();
      cd.get("https://www.techlistic.com/");
      cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      cd.manage().window().maximize();
      Thread.sleep(2000);
      cd.findElement(By.linkText("JAVA")).click();
      String pageurl=cd.getCurrentUrl();
      System.out.println("Actual Title :"+pageurl);
      String expectedurl="https://www.techlistic.com/p/java.html";
      System.out.println("Validation status :"+pageurl.equals(expectedurl));
      System.out.println();
      cd.navigate().back();
      cd.findElement(By.className("dropbtn")).click();;
      String pageurl1=cd.getTitle();
      System.out.println("Actual Title :"+pageurl);

      String expextedurl1="https://www.techlistic.com/p/selenium-tutorials.html";
      System.out.println("validation status :"+pageurl1.equals(expextedurl1));
      cd.navigate().back();
      cd.findElement(By.linkText("BDD")).click();
      String pageurl2=cd.getTitle();
      System.out.println("Actual Title :"+pageurl);

      String expextedurl2="https://www.techlistic.com/p/bdd-tutorial-with-python-behave.html";
      System.out.println("validation status :"+pageurl2.equals(expextedurl2));
      cd.navigate().back();
      cd.findElement(By.linkText("TESTING")).click();
      String pageurl3=cd.getTitle();
      System.out.println("Actual Title :"+pageurl);

      String expextedurl3="https://www.techlistic.com/p/software-testing.html";
      System.out.println("validation status :"+pageurl3.equals(expextedurl3));
      //cd.close();
	}

}
