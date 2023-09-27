package dropDownHandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver = new ChromeDriver(); 
	  		 driver.manage().window().maximize();
	  		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  		 
	  		driver.get("file:///C:/Users/hp/Desktop/WebElement/multiselectdropdown.html");
		    
	        WebElement dropDwonele = driver.findElement(By.name("menu"));
	        
	               Select sel = new Select(dropDwonele);
	               
	               //read all the options as considers webelement
	                   WebElement allOpts = sel.getWrappedElement();
	                   
	                    System.out.println(allOpts.getText());
	                    
	}
}
