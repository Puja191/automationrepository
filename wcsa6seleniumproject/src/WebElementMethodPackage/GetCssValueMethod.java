package WebElementMethodPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String attributeValue = driver.findElement(By.name("username")).getAttribute("class");
		
		 System.out.println(attributeValue);
		 
		String cssValue = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("height");
		System.out.println(cssValue);
		
	}
}
