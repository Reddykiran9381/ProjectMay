package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DashboardPage extends BasePage{

	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath="//a[text()='Open New Account']")
	WebElement link_openaccount;
	
	
	
	public void click_openaccount() {
		link_openaccount.click();
	}
	

}


