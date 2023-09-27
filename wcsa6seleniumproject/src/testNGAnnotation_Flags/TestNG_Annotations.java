package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
  @Test
  public void method_test_annotation1() {
	  
	  Reporter.log("TestAnnotation1",true);
  }
  @Test
  public void method_test_annotation() {
	  
	  Reporter.log("TestAnnotation",true);
  }
    @BeforeMethod
    public void method_beforeMethod_annotation() {
    
    	Reporter.log("beforeMethodAnnotation",true);
    }
    
    @AfterMethod
    public void method_afterMethod_annotation() {
    	
    	Reporter.log("afterMethodAnnotation",true);
    }
    
    @BeforeClass
    public void method_beforeClass_annotation() {
    	Reporter.log("beforeClassAnnotation",true);
    }
    
    @AfterClass
    public void method_afterClass_annotation() {
    	
    	Reporter.log("afterClassAnnotation",true);
    }
    
    @BeforeTest
    public void method_beforeTest_annotation() {
    	
    	Reporter.log("beforeTestAnnotation",true);
    }
    
    @AfterTest
    public void method_afterTest_annotation() {
    	Reporter.log("afterTestAnnotation",true);
    }
    
    @BeforeSuite
    public void method_beforeSuit_annotation() {
    	Reporter.log("beforeSuitAnnotation",true);
    }
    
    @AfterSuite
    public void method_afterSuit_annotation() {
    	Reporter.log("afterSuitAnnotation",true);
    }
}
