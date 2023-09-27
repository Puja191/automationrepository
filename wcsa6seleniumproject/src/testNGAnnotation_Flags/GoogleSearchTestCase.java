package testNGAnnotation_Flags;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GoogleSearchTestCase extends BaseTest {
	static WebDriver driver;
  @Test
  public void search_for_java() {
	  
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
  }
  @Test
  public void search_for_selenium() {
	  
	  driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
  }
}
