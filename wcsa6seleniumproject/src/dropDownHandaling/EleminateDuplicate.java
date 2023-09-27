package dropDownHandaling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EleminateDuplicate {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver(); 
  		 driver.manage().window().maximize();
  		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  		 
  		driver.get("file:///C:/Users/hp/Desktop/WebElement/multiselectdropdown.html");
	    
        WebElement dropDwonele = driver.findElement(By.name("menu"));
        
               Select sel = new Select(dropDwonele);
               
               //to handle dropdown
               
               HashSet<String> hs = new HashSet<String>();
               
                  List<WebElement> allOpts = sel.getOptions();
                  
                  //read list
                  for(int i=0; i<allOpts.size();i++)
                  {
                	  Thread.sleep(2000);
                	  String opt = allOpts.get(i).getText();
                	
                	hs.add(opt);
                  }
                  Thread.sleep(2000);
                  for(String opt:hs)
                  {
                	  Thread.sleep(2000);
                	 System.out.println(opt); 
                  }
	}
}
