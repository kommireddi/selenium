package pages;

import utils.Reporter;
import wrappers.LinkedInWrappers;

public class LinkedInHomePage extends LinkedInWrappers {

	public LinkedInHomePage() {
		if (!verifyTitle("Welcome! | LinkedIn"))
			Reporter.reportStep("This is not Home Page", "FAIL");
	}

	public LinkedInHomePage verifyUserName(String data) {
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), data);
		return this;
	}

	public LinkedInAdvancedSearchPage clickAdvanced() {
		clickByLink(prop.getProperty("Home.Advanced.LinkText"));
		return new LinkedInAdvancedSearchPage();
	}

	public LinkedInProfilePage clickProfile() {
		clickByXpath(prop.getProperty("Home.Profile.Xpath"));
		return new LinkedInProfilePage();

	}
	
	public LinkedInJobsPage clickJobs() {
		clickByLink(prop.getProperty("Home.Jobs.LinkText"));
		return new LinkedInJobsPage();
	}
	
	

}
