package testNGAnnotation_Flags;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Flag7 {
  
	 @Test(description = "performs login")
	  public void loginMethod() {
		 
		  System.out.println("it is use to perform login!!");
	  }
	 
	  @Test(description = "Performs create user",dependsOnMethods="loginMethod")
	  public void createUserMethod() {
		  
		  Assert.fail();//it is use to fail the execution
		  System.out.println("user created!!");
	  }
	  
	  @Test(description = "Performs logout",dependsOnMethods="createUserMethod",alwaysRun = true)
	  public void logoutMethod() {
		  
		  System.out.println("it is use to perform logout!!");
	  }
}
