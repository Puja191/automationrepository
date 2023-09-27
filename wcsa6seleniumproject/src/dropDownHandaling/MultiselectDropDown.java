package dropDownHandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver  driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("file:///C:/Users/hp/Desktop/WebElement/multiselectdropdown.html");
		 
		     WebElement dropDownEle = driver.findElement(By.id("menu"));
		     
		        Select sel = new Select(dropDownEle);
		        
		        for (int i=0;i<=4;i++)
		        { 
		        	Thread.sleep(2000);
		        	sel.selectByIndex(i);
		     
		        }
	}
}
