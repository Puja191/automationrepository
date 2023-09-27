package methodWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get(" https://www.google.com/");
	
	driver.switchTo().activeElement().sendKeys("poha");

	   List<WebElement> pohasuggestions = driver.findElements(By.xpath("//div[@class='mus_il']"));
	   
	   Thread.sleep(2000);
	   
	   for(int i=0;i<pohasuggestions.size();i++ )
	   {
		   Thread.sleep(2000);
		 System.out.println(pohasuggestions.get(i).getText());
	   }
	   Thread.sleep(2000);
	   driver.quit();
}
}
