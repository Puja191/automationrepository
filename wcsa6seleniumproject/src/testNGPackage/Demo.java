package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void method1() {
	  
	  Reporter.log("method1", true);
  }
  
  @Test
  public void method2() {
  System.out.println("method2");
  }
}
