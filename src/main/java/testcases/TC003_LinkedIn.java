package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LinkedInLoginPage;
import wrappers.LinkedInWrappers;

public class TC003_LinkedIn extends LinkedInWrappers {
	@Test(dataProvider="fetchData")
	public void case03 (String userName, String passWord, String skill){
		
			new LinkedInLoginPage()
			.enterUserName(userName)
			.enterPassword(passWord)
			.clickLogin()
			.clickProfile()
			.getCurrentOrg()
			.verifyAndAddNewSkill(skill);

     }
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC006";
		browserName="chrome";
		testCaseName="LinkedIn TestCase03";
		testDescription="Login and Add new skill in profile";
	}
}
