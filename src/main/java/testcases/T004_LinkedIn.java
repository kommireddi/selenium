package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LinkedInLoginPage;
import wrappers.LinkedInWrappers;

public class T004_LinkedIn extends LinkedInWrappers {
	@Test(dataProvider="fetchData")
	public void case04 (String userName, String passWord, String job){
		
			new LinkedInLoginPage()
			.enterUserName(userName)
			.enterPassword(passWord)
			.clickLogin()
			.clickJobs()
			.enterJobs(job)
			.clickSearch()
			.verifyButtonColor()
			.clickView()
			.getCompany()
			.clickCompany()
			.CompanyStength();
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC007";
		browserName="chrome";
		testCaseName="LinkedIn TestCase04";
		testDescription="Login, search Job and get the comppany employee strength";
	}
}
			

