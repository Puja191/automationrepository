package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
  public static void main(String[] args) throws InterruptedException {
	
	WebDriver  driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9301536%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw_aemBhBLEiwAT98FMu71PkZNa_rEK90rsXZW8le7SysiNJDNU280i8QD3axlUq-6lj43sRoCBP8QAvD_BwE");

	Thread.sleep(2000);
	driver.findElement(By.name("firstname")).sendKeys("Qspider");
	
	Thread.sleep(2000);
	driver.findElement(By.name("lastname")).sendKeys("123456");
	
	Thread.sleep(2000);
	driver.findElement(By.name("reg_email__")).sendKeys("8976543210");
	
	Thread.sleep(2000);
	driver.findElement(By.id("password_step_input")).sendKeys("234567");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[contains(@name,'birthday_day')]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[contains(text(),'5')and (@value='5')]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Aug");
	
	driver.findElement(By.xpath("//option[contains(text(),'Jun') and (@value='6')]")).click();
	
	driver.findElement(By.xpath("//select[contains(@name,'birthday_year')]")).click();
	
	driver.findElement(By.xpath("//option[contains(text(),'2000') and (@value='2000')]")).click();
	
}
}