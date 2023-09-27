package dropDownHandaling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EleminateDuplicateByTreeSet {

	   public static void main(String[] args) throws InterruptedException {
		
		   WebDriver driver = new ChromeDriver(); 
	  		 driver.manage().window().maximize();
	  		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  		 
	  		driver.get("file:///C:/Users/hp/Desktop/WebElement/multiselectdropdown.html");
		    
	        WebElement dropDwonele = driver.findElement(By.name("menu"));
	        
	              //handle the dropDown
	               Select sel = new Select(dropDwonele);
	               
	               //remove duplicate from dropDown by using TreeSet
	               TreeSet<String> ts = new TreeSet<String>();
	               
	               //read the options from dropDown
	                 List<WebElement> allOpts = sel.getOptions();
	                 
	                 //read the option
					for(int i=0; i<allOpts.size(); i++)
	                 {
						 Thread.sleep(2000);
						String opt =allOpts.get(i).getText();
	                	ts.add(opt);
	               
	             	   }
					 Thread.sleep(4000);
	                 
	                 for(String opt:ts)
	                 {
	                	 Thread.sleep(2000);
	                System.out.println(opt); 
	                 }
	               
	               
	}
}
