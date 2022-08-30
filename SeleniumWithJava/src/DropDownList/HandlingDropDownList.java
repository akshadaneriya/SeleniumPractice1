package DropDownList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownList {

	public static void main(String[] args) {
		String dpath=System.getProperty("user.dir")+"//Executables//chromedriver.exe";
	       System.setProperty("webdriver.chrome.driver", dpath);
	       WebDriver cd=new ChromeDriver();
	       cd.manage().window().maximize();
	       cd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       cd.get("http://demo.automationtesting.in/Register.html");
	       
			//**** Identify dropdown list
            WebElement skilldropdown=cd.findElement(By.id("Skills"));
            
    		//**** Create an instance of Select class and pass above element into its constructor
            Select skillselect=new Select(skilldropdown);
            
    		//**** check whether dropdown is multiselect dropdown or not
            System.out.println("Is dropdown is allowing you to select multiple option: "+skillselect.isMultiple());
	       
    		//**** get default or already select option
            WebElement selectedoption=skillselect.getFirstSelectedOption();
            String selectedoptionName=selectedoption.getText();
            System.out.println("Already selected option name :"+selectedoptionName);
    		//or
            System.out.println("Already selected option name: "+skillselect.getFirstSelectedOption().getText());
            
    		//get option count 
            List<WebElement> options=skillselect.getOptions();
            System.out.println("Option count is:"+options.size());
    		//Get dropdown option names
            for(int i=0;i<options.size();i++) {
            	System.out.println("options"+i+":"+options.get(i).getText());
            }
    		//TODO: validation dropdown skills are getting displayed in ascending order
    		//select options from dropdown
    		skillselect.selectByIndex(4);
    		System.out.println("Already selected option name: "+skillselect.getFirstSelectedOption().getText());
    		//or
    		skillselect.selectByValue("Backup Management");
    		System.out.println("Already selected option name:"+skillselect.getFirstSelectedOption().getText());
    		//or
    		skillselect.selectByVisibleText("Analytics");
    		System.out.println("Already selected option name:"+skillselect.getFirstSelectedOption().getText());
            /*
    		//Expected skills
    		String expe_skillname="Adobe, InDesign,Adobe";
    		System.out.println("SkillName"+skillName);
    		*/
    		//TODO: perform validation on following
    		//1.Year(ascending order validation)
            //2.Month (month sequence validation)
    		//3.Days(ascending order validation)
    		Select daydrop=new Select(cd.findElement(By.id("daybox")));
    		List<Integer> days=new ArrayList<Integer>();
    		for(int i=1;i<daydrop.getOptions().size();i++) {
    			String day=daydrop.getOptions().get(i).getText();
    			days.add(Integer.parseInt(day));
    		}
            
    		List<Integer> dupdays=new ArrayList<Integer>();
    		Collections.sort(dupdays);
    		System.out.println(days.equals(dupdays));
    		
    		Select monthdrop=new Select(cd.findElement(By.id("form-control.ng-pristine")));
    		List<String> month=new ArrayList<String>();
    		for(inti=0;i<)
    		
            
	}

}
