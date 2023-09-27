package popUpHandlingPackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("file:///C:/Users/hp/Desktop/WebElement/ConfirmationPopUP.html");
		 
		 //generate confirmation popUp
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 //handle Confirmaton popUp by using switchTo()
		// driver.switchTo().alert().accept();
		 
		   Alert al = driver.switchTo().alert();
		   
		   Thread.sleep(2000);
		  // al.accept();  //accept the confirmation popUp
		 //  al.dismiss();  //dismiss the confirmation popUp
		   System.out.println(al.getText());  //get the text Of popUp
		   al.accept();
		   
		 Thread.sleep(2000);
		 driver.close();
	}
}
