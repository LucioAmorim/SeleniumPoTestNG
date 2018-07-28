package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "login_field")
	WebElement emailTextbox;
	@FindBy(how = How.ID, using = "password")
	WebElement passwordTextbox;
	@FindBy(how = How.NAME, using = "commit")
	WebElement loginButton;

	public void openHomePage(String baseUrl) {
		driver.get(baseUrl);
		Reporter.log("Application opened with baseUrl (" + baseUrl + ")", true);
	}

	public void login(String email, String password) {

		emailTextbox.clear();
		Reporter.log("Value cleared from login textbox", true);
		emailTextbox.sendKeys(email);
		Reporter.log("Value filled in login textbox", true);
		passwordTextbox.clear();
		Reporter.log("Value cleared from password textbox", true);
		passwordTextbox.sendKeys(password);
		Reporter.log("Value filled in password textbox", true);
		loginButton.click();
		Reporter.log("Login button clicked", true);
	}

}
