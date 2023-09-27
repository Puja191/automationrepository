package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
    public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://desktop-f6unpi1/login.do");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.name("username")).sendKeys("admin");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Login']")).click();
		 
		 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
}
