package assignMentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5MaximizeChildBrowser {

	public static void main(String[] args) {
		
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  driver.get("https://www.myntra.com/");
		  
		  driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shose");
		  
		  driver.findElement(By.xpath("//li[text()='Shose Women']")).click();
		  
		  driver.findElement(By.xpath("(//a[@style='display: block;'])[1]")).click();
		  
		  driver.findElement(By.xpath("//p[text()='5']")).click();    
		  
		  driver.findElement(By.xpath("//div[contains(@class,'pdp-add-to-bag pdp-button pdp-flex pdp-cente')]")).click();
		  
		  driver.findElement(By.xpath("//input[@class='pincode-code']")).sendKeys("133034");
		  
		  driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
	}
}
