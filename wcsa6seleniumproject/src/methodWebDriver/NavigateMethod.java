package methodWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.google.com/");
	//
	Thread.sleep(2000);
	driver.navigate().back();
	//
	Thread.sleep(2000);
	driver.navigate().forward();
}
}
