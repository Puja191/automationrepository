package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://desktop-f6unpi1/user/submit_tt.do");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@class='content tt_selected selected']")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='Tasks']")).click();
	
	Thread.sleep(6000);
	driver.findElement(By.xpath("//div[text()='Reports']")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='Settings']")).click();
}
}
