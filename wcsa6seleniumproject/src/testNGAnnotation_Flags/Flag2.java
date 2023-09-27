package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(description = "perfor log in",enabled=true)
  public void method1() {
	Reporter.log("method1",true);  
  }
  
  @Test(description = "perform create user",enabled =false)
  public void method2() {
	  Reporter.log("method2",true);
  }
  @Test(description = "peform Log Out")
  public void method3() {
	  Reporter.log("method3",true);
  }
}
