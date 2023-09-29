package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TasksPage;
import pagePackage.UseresPage;

public class ActiTimeDeleteTestCase extends BaseTest{

	
	@Test
	public void deleteTestScript() throws IOException {

		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLogin(flib.readPropertyData(PROP_PATH1,"Username"),flib.readPropertyData(PROP_PATH1,"Password"));

		HomePage hp = new HomePage(driver);
		TasksPage tp = new TasksPage(driver);
		UseresPage up = new UseresPage(driver);
		
		hp.click_on_Task_Module();
		tp.deleteCust_ProjectMethod();
		
		hp.click_On_User_Module();
		up.deleteManagerMethod();
		
	}
}
