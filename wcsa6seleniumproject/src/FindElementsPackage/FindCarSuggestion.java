package FindElementsPackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindCarSuggestion {
  public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.google.com/");
	 
	 Thread.sleep(2000);
	 driver.switchTo().activeElement().sendKeys("car");
	 
	 Thread.sleep(2000);
	  List<WebElement> carSuggetions = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
	  
		for(int i=0; i<carSuggetions.size(); i++)
		{
			Thread.sleep(2000);
			System.out.println(carSuggetions.get(i).getText());	
			
		}
		Thread.sleep(2000);
		driver.quit();
}
}
