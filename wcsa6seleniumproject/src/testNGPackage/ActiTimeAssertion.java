package testNGPackage;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTimeAssertion {
	static WebDriver driver;
 
@Test
  public void loginMethod() throws InterruptedException {
	  
	  WebDriver	driver=new ChromeDriver();
      
      driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    driver.get("http://desktop-f6unpi1/login.do");
	    
	    SoftAssert sa=new SoftAssert();
	    sa.assertEquals(driver.getTitle(), "title");
	    
	    driver.findElement(By.name("username")).sendKeys("admin");
        
        driver.findElement(By.name("pwd")).sendKeys("manager");
        
        driver.findElement(By.id("loginButton")).click();
        
         String titleOfhp = "actiTIME - Enter Time-Track";
         
        Assert.assertEquals(driver.getTitle(), titleOfhp);
        
            WebElement logout = driver.findElement(By.partialLinkText("Logout"));
            
            Assert.assertEquals(logout.isDisplayed(), true);
            
            Thread.sleep(2000);
            logout.click();
            
            sa.assertAll();
            
           // Assert.fail();
    		//Assert.assertEquals(true, true);
         
  }
}
