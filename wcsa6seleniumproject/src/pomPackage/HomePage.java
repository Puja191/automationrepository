package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(xpath="//div[.=\'Time-Track\']/ancestor::a") private WebElement Time_Track_Module;
	@FindBy(xpath="//div[.=\'Tasks\']/ancestor::a") private WebElement Task_Module;
	@FindBy(xpath="//div[.=\'Reports\']/ancestor::a") private WebElement Report_Module;
	@FindBy(xpath="//div[.=\'Users\']/ancestor::a") private WebElement User_Module;
	@FindBy(xpath="//div[.=\'Work Schedule\']/ancestor::a") private WebElement Work_Schedule_Module;
	@FindBy(xpath="//div[.=\'Settings\']/ancestor::a") private WebElement Settings_module;
	@FindBy(partialLinkText="//div[.=\'Logout\']/ancestor::a") private WebElement Logout_Link;
	
	// initialization
	    public HomePage(WebDriver driver)
	    {
	    PageFactory.initElements(driver,this);
	    }
	    
	    

	    //utilization
	public WebElement getTime_Track_Module() {
		return Time_Track_Module;
	}
	
	public WebElement getTask_Module() {
		return Task_Module;
	}

	public WebElement getReport_Module() {
		return Report_Module;
	}

	public WebElement getUser_Module() {
		return User_Module;
	}

	public WebElement getWork_Schedule_Module() {
		return Work_Schedule_Module;
	}

	public WebElement getSettings_module() {
		return Settings_module;
	}

	public WebElement getLogout_Link() {
		return Logout_Link;
	}
	
	//operational
	
	public void click_on_Time_Track_Module()
	{
		Time_Track_Module.click();	
	}
	
	public void click_on_Task_Module()
	{
		Task_Module.click();
	}
	
	public void click_On_Report_Module()
	{
		Report_Module.click();
	}
	
	public void click_On_User_Module()
	{
		User_Module.click();
	}
	
	public void click_On_Work_Shedule_Module()
	{
		Work_Schedule_Module.click();
	}
	
	public void click_On_Settings_Module()
	{
		Settings_module.click();
	}
	
	public void click_On_Logout_Link	()
	{
		Logout_Link.click();
	}
}