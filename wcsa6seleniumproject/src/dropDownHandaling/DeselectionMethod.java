package dropDownHandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethod {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("file:///C:/Users/hp/Desktop/WebElement/multiselectdropdown.html");
	    
	        WebElement dropDwonele = driver.findElement(By.name("menu"));
	        
	      Select sel = new Select(dropDwonele);
	      
	      Thread.sleep(2000);
	      sel.selectByIndex(3);
	      
	      Thread.sleep(2000);
	      sel.deselectByIndex(3);
	      
	      //select multiple options
	      
	      for(int i=0;i<5;i++)
	      {
	    	  Thread.sleep(2000);
	    	sel.selectByIndex(i);  
	      }
	      //deselect multiple option by using index
	      for(int i=0;i<5;i++)
	      {
	    	  Thread.sleep(2000);
	    	  sel.deselectByIndex(i);      
	      }
	      
	    //select multiple option by using value
	      String [] arr= {"v1","v2","v3","v4"};
	      for(int i=0;i<arr.length;i++)
	      {
	    	  Thread.sleep(2000);
	    	  sel.selectByValue(arr[i]);
	      }
	      //deselect multiple option by using value
	      for(int i=0;i<arr.length;i++)
	      {
	    	  Thread.sleep(2000);
	    	  sel.deselectByValue(arr[i]);
	      }
	   
	      for(int i=0;i<5;i++)
	      {
	    	  Thread.sleep(2000);
	    	  sel.deselectByIndex(i);      
	      }
	      
	      //deselect all options using deselectAll method
	      sel.deselectAll();
	      
	}
}
