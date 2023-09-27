package testNGPackage;

import org.junit.Assert;

public class AssertionInTestNG {
 
	public static void main(String[] args) {
		
		System.out.println("Launch the chrome browser!! and maximize it");
		System.out.println("Launch the actiTime web application!! and verify the title !!");
		System.out.println("if title is veryfied perform login");
		System.out.println("veryfy the home page is display or not  ");
		System.out.println("LogOut");
		
		Assert.fail();
		Assert.assertEquals(true, true);
	}
}
