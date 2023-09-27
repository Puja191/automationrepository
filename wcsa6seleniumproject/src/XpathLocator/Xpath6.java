package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath6 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	   driver.get("https://www.flipkart.com/");
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[text()='✕']")).click();
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobile");
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	   
	   Thread.sleep(2000);
	    System.out.println(driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText());
	    
	    Thread.sleep(2000);
	    driver.quit();
}
}

