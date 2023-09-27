package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHRMAssertion {
	static WebDriver driver;
  @Test
  public void loginMethod() throws InterruptedException {
 WebDriver	driver=new ChromeDriver();
      
      driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    SoftAssert sa=new SoftAssert();
	    sa.assertEquals(driver.getTitle(), "title");
	    
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    Thread.sleep(2000);
	    driver.findElement(By.partialLinkText(" Login ")).click();
	    
	      String title = "OrangeHRM";
	      Assert.assertEquals(driver.getTitle(), title);
	      
	      WebElement logout = driver.findElement(By.partialLinkText("Logout"));
	      
	      Assert.assertEquals(logout.isDisplayed(), true);
	      
	     // Thread.sleep(2000);
          logout.click();
          
          sa.assertAll();
  }
}
