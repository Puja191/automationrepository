package assignMentPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnRobotAndActions {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
 		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 		 
 		   driver.get("https://www.bluestone.com/");
 		   
 		   driver.findElement(By.id("denyBtn")).click();
 		   
 		       WebElement watchJwellary = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
 		       
 		          Actions act = new Actions(driver);
 		          act.moveToElement(watchJwellary).perform();
 		          
 		         driver.findElement(By.xpath("//a[text()='Band']")).click();
 		         
 		          WebElement filterBy = driver.findElement(By.xpath("//span[@class='f-by']"));
 		          
 		       for(int i=1; i<=2; i++)
 		        {
 			      act.doubleClick(filterBy).perform();
 			   
 		         	act.clickAndHold(filterBy).perform();  
 		        }
 		       
 		                 Robot robot = new Robot();
 		                 
 		                 robot.keyPress(KeyEvent.VK_CONTROL);
 		                 robot.keyPress(KeyEvent.VK_C);
 		                 
 		                 robot.keyRelease(KeyEvent.VK_CONTROL);
 		                 robot.keyRelease(KeyEvent.VK_C);
 		                 
 		                 driver.findElement(By.id("search_query_top_elastic_search")).click();
 		                 
 		                robot.keyPress(KeyEvent.VK_CONTROL);
		                 robot.keyPress(KeyEvent.VK_C);
		                 
		                 robot.keyRelease(KeyEvent.VK_CONTROL);
		                 robot.keyRelease(KeyEvent.VK_C);
		                 
		                 driver.findElement(By.name("submit_search")).submit();
	}
}
