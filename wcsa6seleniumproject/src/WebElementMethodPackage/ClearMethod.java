package WebElementMethodPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	
	public static void main(String[] args) throws InterruptedException {
      WebDriver	driver=new ChromeDriver();
      
      
      driver.manage().window().maximize();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      
      driver.get("http://desktop-f6unpi1/login.do");
      
      driver.findElement(By.name("username")).sendKeys("admin123");
      
      driver.findElement(By.name("pwd")).sendKeys("manager");
      
      driver.findElement(By.xpath("//a[text()='Login']")).click();
      
      Thread.sleep(2000);
      
      driver.findElement(By.name("username")).clear();
	}
}
