package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//identify
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[placeholder='username']")).sendKeys("Admin");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[placeholder='Password']")).sendKeys("admin123");
	
	//login button using text() function
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
}
}
