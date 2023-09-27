package dropDownHandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationalMethod {

	
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 // to check whether drop down is single select
		// driver.get("file:///C:/Users/hp/Desktop/WebElement/dropdown.html");
		 
		//to check whether drop down is single multi select
		 driver.get("file:///C:/Users/hp/Desktop/WebElement/multiselectdropdown.html");
		 
		          WebElement dropDownEle = driver.findElement(By.name("menu"));
		          
		         Select sel = new Select(dropDownEle);
		          
		          //to check whether drop down is single select or multi select
		          
				System.out.println(sel.isMultiple());	
	}
}
