package methodWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourcsMethod {
//it is use to get the source
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/user/submit_tt.do");
		//read the source code of login page
		
		String loginPageSourceCode = driver.getPageSource();
		System.out.println(loginPageSourceCode);
	}
}
