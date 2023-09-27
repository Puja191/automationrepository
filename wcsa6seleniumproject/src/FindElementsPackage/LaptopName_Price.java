package FindElementsPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopName_Price {
    public static void main(String[] args) throws InterruptedException {
		
      WebDriver	driver=new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://www.flipkart.com/");
      
      Thread.sleep(2000);
      driver.findElement(By.name("q")).sendKeys("laptops");
      
     Thread.sleep(2000);
      driver.findElement(By.xpath("//button[text()='✕']")).click();
      
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
      
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//div[@class='_24_Dny'])[1]")).click();
      
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[text()='Brand']")).click();
     
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
      
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[text()='Operating System']")).click();
      
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 10']")).click();
      
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='4★ & above']")).click();
	
    //identify all the suggestions of laptop
      Thread.sleep(2000);  
     List<WebElement> allsuggestions = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
      
      Thread.sleep(2000);
      //identify all the suggestions of Price
       List<WebElement> allsuggestionsPrice = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
         
        for(int i=0;i<allsuggestionsPrice.size() && i<allsuggestions.size();i++)
        {
        	Thread.sleep(2000);
            System.out.println(allsuggestions.get(i).getText() +" :"+ allsuggestionsPrice.get(i).getText());
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
