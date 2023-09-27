package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleAttribute {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--disable-notifications");
	
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?gclid=CjwKCAjw8ZKmBhArEiwAspcJ7m3BKqqaLfZjUXVOcclcNKp2gfcmLoWAHJK5fJeQUeHwmXLaPADlNRoC4l4QAvD_BwE&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=CjwKCAjw8ZKmBhArEiwAspcJ7m3BKqqaLfZjUXVOcclcNKp2gfcmLoWAHJK5fJeQUeHwmXLaPADlNRoC4l4QAvD_BwE:G:s&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&gad=1");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@placeholder='Select Departure City']")).sendKeys("pune");
	 
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@placeholder='Select Arrival City']")).sendKeys("cochi");
		 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
	 
	 Thread.sleep(2000);
     driver.findElement(By.xpath("//div[text()=2023]")).click();
     
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[text()=' Aug ']")).click();
     
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[text()='7']")).click();
     
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[text()='7']")).click();
     
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@name='returnTo']")).click();
     
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[text()='2023']")).click();
     
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[@monthname='Aug']")).click();
     
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[text()='15']")).click();
     
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='passengers']")).click();
	 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[contains(@class,'col-xs-12 done')]")).click();
	 
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[contains(@class,'widget-btn aub')]")).click();
	 
	 Thread.sleep(5000);
	 driver.quit(); 
}
}
