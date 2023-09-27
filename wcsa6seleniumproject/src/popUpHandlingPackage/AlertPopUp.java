package popUpHandlingPackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("file:///C:/Users/hp/Desktop/WebElement/AlertPopUp.html");
		 
		 //genarate Alert popUp
		 driver.findElement(By.xpath("//button[text()='Click me! ']")).click();
		 
		 //handle the alert popUp by using using switchTo()
		// driver.switchTo().alert().accept();
		 
		     Alert al = driver.switchTo().alert();
		     
		     Thread.sleep(2000);
		   //  al.accept();//to accept the popUP
		   //  al.dismiss();  //to dismiss the popUp
		     System.out.println(al.getText());  //to get the text of popUp
		     al.accept();
		     
		 Thread.sleep(2000);
		 driver.close();
	}
}
