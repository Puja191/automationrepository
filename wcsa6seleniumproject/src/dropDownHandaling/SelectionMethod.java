package dropDownHandaling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  
		  driver.get("file:///C:/Users/hp/Desktop/WebElement/dropdown.html");
		  
		  //identify single dropdown
		    WebElement dropDownEle = driver.findElement(By.id("menu"));
		       
		     Select sel = new Select(dropDownEle);
		     
		     Thread.sleep(4000);
		     sel.selectByIndex(3);
		     
		     Thread.sleep(4000);
		     sel.selectByVisibleText("Misal Pav");
		     
		     Thread.sleep(4000);
		     sel.selectByValue("v6");
	}
	
}
