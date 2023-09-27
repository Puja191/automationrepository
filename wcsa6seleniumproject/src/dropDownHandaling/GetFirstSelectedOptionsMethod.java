package dropDownHandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionsMethod {

	
	public static void main(String[] args) throws InterruptedException   {
		

 	   WebDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		driver.get("file:///C:/Users/hp/Desktop/WebElement/multiselectdropdown.html");
	    
     WebElement dropDwonele = driver.findElement(By.name("menu"));
     
            Select sel = new Select(dropDwonele);
            
            //select multiple options
            for (int i=3; i<6; i++)
            {
         	   Thread.sleep(2000);
         	 sel.selectByIndex(i);  
            }
           
            //get the 
                 WebElement firstOpt = sel.getFirstSelectedOption();
                 System.out.println(firstOpt.getText()); 
                 
            
	}
}
