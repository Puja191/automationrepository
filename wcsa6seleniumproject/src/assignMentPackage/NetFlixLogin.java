package assignMentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlixLogin {
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.netflix.com/in/Login");
	
	Thread.sleep(2000);
	driver.findElement(By.id("id_userLoginId")).sendKeys("puja@123");
	
	Thread.sleep(2000);
	driver.findElement(By.id("id_password")).sendKeys("1234");
	
	Thread.sleep(2000);
	driver.findElement(By.className("class=\"btn login-button btn-submit btn-small\"")).clear();
}
}
