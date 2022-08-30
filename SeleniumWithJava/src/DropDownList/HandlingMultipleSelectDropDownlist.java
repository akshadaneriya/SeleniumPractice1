package DropDownList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleSelectDropDownlist {

	public static void main(String[] args) {
         String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
         System.setProperty("webdriver.chrome.driver", dpath);
         WebDriver cd=new ChromeDriver();
         
         cd.manage().window().maximize();
         cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
         
         cd.get("http://omayo.blogspot.com/");
 		//**** Idetify dropdown list
        WebElement cardropdown =cd.findElement(By.id("multiselect1"));
		//**** Create an instance of Select class and pass above element into its constructor
        Select skillselect=new Select(cardropdown);
		//**** check whether dropdown is multiselect dropdown or not
        System.out.println("Is dropdown is allowing you to select multiple option:"+skillselect.isMultiple());
		/*//**** get default or already select option
        WebElement selectedOption=skillselect.getFirstSelectedOption();
        String selectedOptionName=selectedOption.getText();
        System.out.println("Already selectec option name:"+skillselect.getFirstSelectedOption().getText());
        
        */
        //get option count
        List<WebElement> options=skillselect.getOptions();
        System.out.println("Options count :"+options.size());
		//Get dropdown option names
        for(int i=0;i<options.size();i++) {
        	System.out.println("Options :"+i+"="+options.get(i).getText());
        	
        }
         //select options from dropdown
         skillselect.selectByIndex(0);
         skillselect.selectByIndex(1);
         //skillselect.selectByIndex(2);
         skillselect.selectByIndex(3);
        /* skillselect.selectByValue("Hyundaix");
         skillselect.selectByVisibleText("Audi");
 		*/
         //get all the selected options
         List<WebElement> selectcars=skillselect.getAllSelectedOptions();
         System.out.println("selected car count :"+ selectcars.size());
         
         //unselect already select options
         skillselect.deselectByIndex(0);
         skillselect.deselectByIndex(1);
         skillselect.deselectByValue("Hyundaix");
         skillselect.deselectByVisibleText("Audi");
         //or
        // skillselect.deselectAll();
         
         

         
         

         
	}

}
