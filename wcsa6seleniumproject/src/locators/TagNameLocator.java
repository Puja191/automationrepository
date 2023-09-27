package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	
     public static void main(String[] args) throws InterruptedException {

	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("file:///C:/Users/hp/Desktop/WebElement/textbox1.html");
	  //identify Username Textbox by using tagName locator
	  Thread.sleep(2000);
	  driver.findElement(By.tagName("input")).sendKeys("Admin");
	  //
	  Thread.sleep(2000);
	  driver.findElement(By.tagName("input")).sendKeys("Manager");
}
}
