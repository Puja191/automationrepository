package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapFrame {

	public static void main(String[] args) {
		
		WebDriver  driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.google.com/");
		 
		 driver.findElement(By.xpath("//a[@class='gb_d']")).click();
		 
		   
	     driver.switchTo().frame("app");
	     
	     driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
	}
}
