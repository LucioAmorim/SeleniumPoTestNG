package tests;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.UserPage;

public class TestLogin extends CommonSteps {
	
	LoginPage homePage;
	UserPage userPage;
	
	@BeforeClass
	public void beforeThisClass() {
		homePage = PageFactory.initElements(super.driver, LoginPage.class);
		userPage = PageFactory.initElements(super.driver, UserPage.class);
	}
	
	@Test(description = "Verify login with valid credentials", enabled = true)
	@Parameters({"loginEmail", "loginPassword"})
	private void verifyValidLogin(String loginEmail, String loginPassword)
	{
		homePage.openHomePage(super.baseUrl);
		homePage.login(loginEmail, loginPassword);
		String actualText = userPage.getName();
		String expectedText = "LucioAmorim";
		Assert.assertEquals(expectedText, actualText);
		Reporter.log("Text verified successfully, which is equals to: " + expectedText, true);
	}
	
	@Test(description = "Verify login with valid credentials 2", enabled = true)
	@Parameters({"loginEmail", "loginPassword"})
	private void verifyValidLogin2(String loginEmail, String loginPassword)
	{
		homePage.openHomePage(super.baseUrl);
		homePage.login(loginEmail, loginPassword);
		String actualText = userPage.getName();
		String expectedText = "Jenkins";
		Assert.assertEquals(expectedText, actualText);
		Reporter.log("Text verified successfully, which is equals to: " + expectedText, true);
	}
	
}
