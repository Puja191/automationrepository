package methodWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch the instagram
		driver.get("https://www.instagram.com/");
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		driver.close();
		
	}
}