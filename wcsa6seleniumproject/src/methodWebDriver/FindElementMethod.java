package methodWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
     public static void main(String[] args) {
		
    	   WebDriver driver=new ChromeDriver();
    	   
    	   driver.manage().window().maximize();
    	   
    	   driver.get("http://desktop-f6unpi1/login.do");
    	   
    	   WebElement usernameTextBox = driver.findElement(By.name("username"));
    	   
    	   usernameTextBox.sendKeys("admin");
    	   System.out.println(usernameTextBox);
    	   
    	     WebElement passwordTextBox = driver.findElement(By.name("pwd"));
    	     
    	     passwordTextBox.sendKeys("manager");
    	     System.out.println(passwordTextBox);
    	     
    	     WebElement loginButton = driver.findElement(By.id("loginButton"));
    	     
    	     loginButton.click();
    	     System.out.println(loginButton);
	}
}
