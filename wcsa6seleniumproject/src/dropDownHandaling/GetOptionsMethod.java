package dropDownHandaling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("file:///C:/Users/hp/Desktop/WebElement/dropdown.html");
		 
		 WebElement dropDownEle = driver.findElement(By.name("menu"));
         
               Select sel = new Select(dropDownEle);
               
            List<WebElement> alloptions = sel.getOptions();
            
          //  for(int i=0; i<=alloptions.size(); i++)
         //  {
          //       String opt = alloptions.get(i).getText();
                 
         //        Thread.sleep(2000);
          //         System.out.println(opt);
          //  }
            
            for(int i=0; i<=alloptions.size(); i++)
                  {
            	         Thread.sleep(2000);
            	         
                             alloptions.get(i).click(); 
                        
                  }
	}
}
