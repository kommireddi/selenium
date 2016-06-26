package pages;

import utils.Reporter;
import wrappers.LinkedInWrappers;

public class LinkedInJobsPage extends LinkedInWrappers {

	public LinkedInJobsPage() {
		if (!verifyTitle("Jobs Home | LinkedIn"))
			Reporter.reportStep("This is not Jobs Page", "FAIL");
	}

	public LinkedInJobsPage enterJobs(String data) {
		enterById(prop.getProperty("Jobs.SearchText.Id"),data);
		return this;

	}
	
	
	public LinkedInJobsPage clickSearch() {
		clickByName(prop.getProperty("Jobs.SearchButton.Name"));
		return this;

	}
	
	public LinkedInJobsPage verifyButtonColor(){
		verifyBgColourByXpath(prop.getProperty("Jobs.Viewbutton.Xpath"));
		return this;
	}
	
	public LinkedInJobViewPage clickView() {
		clickByXpath(prop.getProperty("Jobs.Viewbutton.Xpath"));
		return new LinkedInJobViewPage();
	}
	
}