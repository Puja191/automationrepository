package dropDownHandaling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllDropdownMethod {

	public static void main(String[] args) {
		

		 WebDriver  driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("file:///C:/Users/hp/Desktop/WebElement/multiselectdropdown.html");
		 
		 WebElement dropDwonele = driver.findElement(By.name("menu"));
		 
		      Select sle = new Select(dropDwonele);
		      
		      sle.selectByIndex(1);
		      
		        WebElement ele = sle.getWrappedElement();
		        
		        System.out.println(ele.getText());
		        
		            List<WebElement> opt = sle.getOptions();
		            for(int i=0; i<opt.size();i++)
		            {
		                opt.get(i).click();	
		            }
		            
	}
}
