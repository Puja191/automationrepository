package scrollingOperationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.bluestone.com/");
	
		 Thread.sleep(2000);
		 driver.findElement(By.id("denyBtn")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.id("")).click();
	}
}
