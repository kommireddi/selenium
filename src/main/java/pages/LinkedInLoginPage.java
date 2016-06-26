package pages;

import utils.Reporter;
import wrappers.LinkedInWrappers;

public class LinkedInLoginPage extends LinkedInWrappers {

	public LinkedInLoginPage() {

		if (!verifyTitle("World’s Largest Professional Network | LinkedIn"))
			Reporter.reportStep("This is not Login Page", "FAIL");
	}

	public LinkedInLoginPage enterUserName(String data) {
		enterById(prop.getProperty("Login.UserName.Id"), data);
		return this;

	}
	
	public LinkedInLoginPage enterPassword(String data) {
		enterById(prop.getProperty("Login.Password.Id"), data);
		return this;

	}
	
	public LinkedInHomePage clickLogin() {
		clickByName(prop.getProperty("Login.LoginButton.Name"));
		return new LinkedInHomePage();
	}
}
