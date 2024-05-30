package testCases;

import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.DashboardPage;
import testBase.BaseClass;

public class TC_002_OpenNewAccount  extends BaseClass{
	@Test(priority=2)
	public void NewAccount() throws InterruptedException {
		
		DashboardPage dp=new DashboardPage(BasePage.driver);
		dp.click_openaccount();
		logger.info("****Clicked on New Account*****");
       
		
		
	}
}
