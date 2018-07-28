package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class UserPage {
	
    WebDriver driver;
	
	public UserPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="//*[@id='user-links']/li[3]/details/summary/span") WebElement userimg;
	@FindBy(how = How.XPATH, using="//*[@id='user-links']/li[3]/details/details-menu/ul/li[1]/strong") WebElement user;
	
	public String getName() {
		
		userimg.click();
		String text = user.getText();
		Reporter.log("Text captured from user profile link", true);
		return text;
	}
	
}
