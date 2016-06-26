package pages;

import utils.Reporter;
import wrappers.LinkedInWrappers;

public class LinkedInSignOutPage extends LinkedInWrappers{

	public LinkedInSignOutPage() {
		if (!verifyTitle("Signed Out | LinkedIn"))
			Reporter.reportStep("This is not SignOut Page", "FAIL");
	}
}
