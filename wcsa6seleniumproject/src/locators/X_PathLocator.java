package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_PathLocator {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("http://desktop-f6unpi1/login.do");
	 
	 //identify by using x-path
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.linkText("Logout")).click();
}
}
