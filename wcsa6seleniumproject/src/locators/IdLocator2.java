package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator2 {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.netflix.com/in/Login");
	Thread.sleep(2000);
	driver.findElement(By.id("id_userLoginId")).sendKeys("9876543210");
	
	driver.get("https://www.netflix.com/in/Login");
	Thread.sleep(2000);
	driver.findElement(By.id("id_password")).sendKeys("1234");
	
	
}
}
