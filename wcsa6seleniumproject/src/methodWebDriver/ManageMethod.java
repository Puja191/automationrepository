package methodWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
  public static void main(String[] args) throws InterruptedException {
	 //
	  WebDriver driver=new ChromeDriver();
	  //use
	  driver.manage().window().maximize();
	  
	  Thread.sleep(2000);
	Dimension targetsize = new Dimension(450,250);
	driver.manage().window().setSize(targetsize);
	
	Point targetPosition = new Point(650,350);
	driver.manage().window().setPosition(targetPosition);
	  
}
}
