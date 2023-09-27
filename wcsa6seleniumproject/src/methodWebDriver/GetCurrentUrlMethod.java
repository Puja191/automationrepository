package methodWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
//it is use to get the url of current webpage
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// launch the actiTime
		driver.get("http://127.0.0.1/user/submit_tt.do");
		
		String urlOfloginPage = driver.getCurrentUrl();
		System.out.println(urlOfloginPage);
	}
}
